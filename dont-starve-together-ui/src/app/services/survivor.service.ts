import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Survivor } from '../models/survivor';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class SurvivorService {

  http = inject(HttpClient)

  constructor() { }

  getAllSurvivors() {
    return this.http.get<Survivor[]>(`${environment.apiUrl}/survivors`)
  }

}
