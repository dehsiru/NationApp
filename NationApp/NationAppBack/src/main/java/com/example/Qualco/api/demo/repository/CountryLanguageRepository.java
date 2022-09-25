package com.example.Qualco.api.demo.repository;

import com.example.Qualco.api.demo.domain.CountryLanguage;
import com.example.Qualco.api.demo.domain.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, Long> {

    @Query("SELECT l.language FROM Language l INNER JOIN CountryLanguage cl ON l.languageId= cl.languageId WHERE cl.countryId = :countryId ")
    List<String> findLanguagesByCountryId(@Param("countryId") Long countryId);

}
