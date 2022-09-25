package com.example.Qualco.api.demo.web.rest;

import com.example.Qualco.api.demo.domain.Country;
import com.example.Qualco.api.demo.domain.CountryStats;
import com.example.Qualco.api.demo.service.CountryLanguageService;
import com.example.Qualco.api.demo.service.CountryService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CountryController {

    private final CountryService countryService;
    private final CountryLanguageService countryLanguageService;

    public CountryController(CountryService countryService, CountryLanguageService countryLanguageService) {
        this.countryService = countryService;
        this.countryLanguageService = countryLanguageService;
    }

    @GetMapping(value = "/countries")
    public List<Country> findAllCountries(){

        return countryService.getCountries();
    }

    @GetMapping(value = "/country/{id}")
    public ResponseEntity<Country> findCountryById(@PathVariable("id") Long id){
        return ResponseEntity.ok(countryService.getCountryById(id).
                orElseThrow(() -> new ResourceNotFoundException("There is no country with id :" + id)));
    }

    @GetMapping(value = "/country-languages/{id}")
    public ResponseEntity<List<String>> findLanguagesByCountryId(@PathVariable("id") Long id){
        return ResponseEntity.ok(countryLanguageService.getLanguagesByCountryId(id));}

    @GetMapping(value = "/country-max-stats", produces = {"application/json"})
    public List<CountryStats> getAll(){
        return countryService.getCountriesWithMaxRatioFromCountryStats();}

}

