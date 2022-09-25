import { Component, OnInit } from '@angular/core';
import {Country} from "../country";
import {CountryService} from "../country.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-country-list',
  templateUrl: './country-list.component.html',
  styleUrls: ['./country-list.component.css']
})
export class CountryListComponent implements OnInit {

  countries: Country[];

  constructor(private countryService : CountryService,
              private router: Router) { }

  ngOnInit(): void {
    this.getCountries();
  }

  private getCountries(){
     this.countryService.getCountriesList().subscribe(data =>{
       this.countries = data;
     })
  }

  public findCountryLanguages(id: number): void {
    this.countryService.getCountryLanguagesByCountryId(id).subscribe({
      next: (res: any) => {
        console.error(res);
      },
      error: (error: any) => {
        console.error(error);
      }
    });
  }


}
