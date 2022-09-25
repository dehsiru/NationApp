package com.example.Qualco.api.demo.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="region_areas")
public class RegionArea implements Serializable {

    @Id
    @Column(name = "region_name")
    private String regionName;

    @Column(name = "region_area")
    private double regionArea;

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public double getRegionArea() {
        return regionArea;
    }

    public void setRegionArea(double regionArea) {
        this.regionArea = regionArea;
    }
}
