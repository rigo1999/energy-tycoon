package com.inf2328.energytycoon.model;

import java.util.ArrayList;
import java.util.List;

public class City {

    private List<Residence> residences = new ArrayList<>();
    private List<PowerPlant> plants = new ArrayList<>();
    private double satisfaction = 100;

    public List<Residence> getResidences() {
        return residences;
    }

    public List<PowerPlant> getPlants() {
        return plants;
    }

    public double getSatisfaction() {
        return satisfaction;
    }

    public void updateSatisfaction(double ratio) {
        satisfaction += (ratio - 1) * 10;
        satisfaction = Math.max(0, Math.min(100, satisfaction));
    }
}
