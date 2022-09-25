import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CountryListComponent} from "./country-list/country-list.component";
import {CountryWithMaxRatioListComponent} from "./country-with-max-ratio-list/country-with-max-ratio-list.component";

const routes: Routes = [
  {path: 'countries', component: CountryListComponent},
  {path: 'countries-with-max-ratio', component: CountryWithMaxRatioListComponent},
  {path: '', redirectTo:'countries', pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
