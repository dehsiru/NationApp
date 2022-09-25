import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {CountryWithMaxRatioListComponent} from "./country-with-max-ratio-list/country-with-max-ratio-list.component";
import {CountryWithMaxRatio} from "./country-with-max-ratio";

@Injectable({
  providedIn: 'root'
})
export class CountryWithMaxRatioService {


  private baseURL = "http://localhost:8080/api/country-max-stats";

  constructor(private httpClient: HttpClient) { }

  getCountriesWithMaxRatioList(): Observable<CountryWithMaxRatio[]>{
    return this.httpClient.get<CountryWithMaxRatio[]>(`${this.baseURL}`);
  }

}
