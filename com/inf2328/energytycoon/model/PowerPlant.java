package com.inf2328.energytycoon.model;

public class PowerPlant {
    private int level = 1;
    private double production = 20;

    public double getProduction() {
        return production;
    }

    public double upgradeCost() {
        return level * 50;
    }

    public void upgrade() {
        level++;
        production += 15;
    }
}
