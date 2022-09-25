package com.example.Qualco.api.demo.service;

import com.example.Qualco.api.demo.domain.Country;
import com.example.Qualco.api.demo.domain.CountryLanguage;
import com.example.Qualco.api.demo.domain.Language;
import com.example.Qualco.api.demo.repository.CountryLanguageRepository;
import com.example.Qualco.api.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryLanguageService {

    @Autowired
    CountryLanguageRepository countryLanguageRepository;

    public List<String> getLanguagesByCountryId(Long id){
      return countryLanguageRepository.findLanguagesByCountryId(id);
    }
}
