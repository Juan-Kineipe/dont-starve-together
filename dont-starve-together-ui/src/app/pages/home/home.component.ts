import { Component, Inject, OnInit } from "@angular/core";
import { CommonModule } from "@angular/common";
import { SurvivorService } from "../../services/survivor.service";
import { Survivor } from "../../models/survivor";

@Component({
    selector: "app-home",
    standalone: true,
    imports: [CommonModule],
    templateUrl: "./home.component.html",
    styleUrl: "./home.component.scss",
})
export class HomeComponent implements OnInit {
    survivorList: Survivor[] = [];

    constructor(private survivorService: SurvivorService) {}

    ngOnInit(): void {
        this.survivorService.getAllSurvivors().subscribe((res) => {
            if (res) {
                this.survivorList = res;
            }
        });
    }
}
