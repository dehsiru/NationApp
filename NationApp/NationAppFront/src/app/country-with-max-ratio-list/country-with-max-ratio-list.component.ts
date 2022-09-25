import { Component, OnInit } from '@angular/core';
import {CountryWithMaxRatio} from "../country-with-max-ratio";
import {CountryWithMaxRatioService} from "../country-with-max-ratio.service";

@Component({
  selector: 'app-country-with-max-ratio-list',
  templateUrl: './country-with-max-ratio-list.component.html',
  styleUrls: ['./country-with-max-ratio-list.component.css']
})
export class CountryWithMaxRatioListComponent implements OnInit {

  countriesWithMaxRatio: CountryWithMaxRatio[];

  constructor(private countryWithMaxRatioService: CountryWithMaxRatioService) { }

  ngOnInit(): void {
    this.getCountriesWithMaxRatioList();
  }

  private getCountriesWithMaxRatioList(){
    this.countryWithMaxRatioService.getCountriesWithMaxRatioList().subscribe(data => {
      this.countriesWithMaxRatio = data;
    });
  }
}
