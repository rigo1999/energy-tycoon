package com.inf2328.energytycoon.model;

import java.util.Random;

public class Residence {
    private int level;
    private double demand;
    private double payment;

    public Residence(int level) {
        this.level = level;
        Random r = new Random();
        demand = 5 * level + r.nextDouble() * 5;
        payment = 10 * level + r.nextDouble() * 10;
    }

    public double getDemand() {
        return demand;
    }

    public double getPayment() {
        return payment;
    }
}
