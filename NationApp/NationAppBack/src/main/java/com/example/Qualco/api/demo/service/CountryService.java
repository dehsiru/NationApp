package com.example.Qualco.api.demo.service;

import com.example.Qualco.api.demo.domain.Country;
import com.example.Qualco.api.demo.domain.CountryStats;
import com.example.Qualco.api.demo.repository.CountryRepository;
import com.example.Qualco.api.demo.repository.CountryStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    public CountryRepository countryRepository;

    @Autowired
    public CountryStatsRepository countryStatsRepository;

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    public Optional<Country> getCountryById(Long id){
        return countryRepository.findById(id);
    }

    public List<CountryStats> getCountriesWithMaxRatioFromCountryStats() {
        List <Country> countries= countryRepository.findAll();
        ArrayList<CountryStats> countryStatsMaxRatioList =  new ArrayList<CountryStats>();
        countries.forEach( country -> {
            CountryStats countryStats = countryStatsRepository.findMaxRatioFromCountryStatsByCountryId(country.getId());
            if(countryStats != null) {
                countryStatsMaxRatioList.add(countryStats);
            }
        });
        return countryStatsMaxRatioList;
    }


//    public List<CountryStats> getCountriesWithMaxRatioFromCountryStats() {
//        List <Country> countries= countryRepository.findAll();
//        ArrayList<CountryStats> countryStatsMaxRatioList =  new ArrayList<CountryStats>();
//        countries.forEach( country -> {
//            CountryStats countryStats;
//            countryStats= countryStatsRepository.findMaxRatioFromCountryStatsByCountryId(country.getId());
//            if(countryStats == null){
//                countryStats.setCountry(country);
//            }
//            countryStatsMaxRatioList.add(countryStats);
//        });
//        return countryStatsMaxRatioList;
//    }



}
