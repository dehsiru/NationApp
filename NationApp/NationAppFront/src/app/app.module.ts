import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CountryListComponent } from './country-list/country-list.component';
import {HttpClientModule} from "@angular/common/http";
import { CountryWithMaxRatioListComponent } from './country-with-max-ratio-list/country-with-max-ratio-list.component';

@NgModule({
  declarations: [
    AppComponent,
    CountryListComponent,
    CountryWithMaxRatioListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
