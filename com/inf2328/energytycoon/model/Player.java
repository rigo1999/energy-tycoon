package com.inf2328.energytycoon.model;

public class Player {
    private double money;

    public Player(double initialMoney) {
        this.money = initialMoney;
    }

    public double getMoney() {
        return money;
    }

    public boolean spend(double amount) {
        if (money >= amount) {
            money -= amount;
            return true;
        }
        return false;
    }

    public void earn(double amount) {
        money += amount;
    }
}
