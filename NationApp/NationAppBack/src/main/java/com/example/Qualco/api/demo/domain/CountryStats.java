package com.example.Qualco.api.demo.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="country_stats")
@IdClass(CountryStats.class)
public class CountryStats  implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Id
    @Column(name = "year")
    private Long year;

    @Column(name = "population")
    private Long population;

    @Column(name = "gdp")
    private double gdp;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }
}
