import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Country} from "./country";


@Injectable({
  providedIn: 'root'
})
export class CountryService {

  private countriesURL="http://localhost:8080/api/countries";
  private countryLanguagesURL=`http://localhost:8080/api/country-languages`;

  constructor(private httpClient: HttpClient) { }

  getCountriesList(): Observable<Country[]>{
    return this.httpClient.get<Country[]>(`${this.countriesURL}`);
  }

  getCountryLanguagesByCountryId(id: number): Observable<Country>{
    return this.httpClient.get<Country>( `${this.countryLanguagesURL}/${id}`);
  }

}
