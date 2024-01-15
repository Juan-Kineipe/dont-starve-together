import { Component, OnInit } from "@angular/core";
import { CommonModule } from "@angular/common";
import { NgxSpinnerModule, NgxSpinnerService } from "ngx-spinner";
import { SurvivorService } from "../../services/survivor.service";
import { Survivor } from "../../models/survivor";

@Component({
    selector: "app-home",
    standalone: true,
    imports: [CommonModule, NgxSpinnerModule],
    templateUrl: "./home.component.html",
    styleUrl: "./home.component.scss",
})
export class HomeComponent implements OnInit {
    survivorList: Survivor[] = [];
    activeSurvivor: Survivor | undefined;

    constructor(
        private spinner: NgxSpinnerService,
        private survivorService: SurvivorService
    ) {}

    ngOnInit(): void {
        this.getAllSurvivors();
    }

    getAllSurvivors() {
        this.spinner.show();
        this.survivorService.getAllSurvivors().subscribe(
            (res) => {
                this.survivorList = res;
                this.activeSurvivor = res[0];
                this.spinner.hide();
            },
            () => {
                this.spinner.hide();
            }
        );
    }

    showSurvivorInfo(survivor: Survivor) {
        this.activeSurvivor = survivor;
    }
}
