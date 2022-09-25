package com.example.Qualco.api.demo.repository;

import com.example.Qualco.api.demo.domain.CountryStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryStatsRepository extends JpaRepository<CountryStats, Long> {

    @Query("SELECT cs2 from CountryStats cs2 where cs2.gdp/cs2.population = (SELECT MAX(cs1.gdp/cs1.population) FROM CountryStats cs1 where cs1.country.id = :countryId)")
    CountryStats findMaxRatioFromCountryStatsByCountryId(@Param("countryId") Long countryId);
}
