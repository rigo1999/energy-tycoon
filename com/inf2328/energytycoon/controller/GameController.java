package com.inf2328.energytycoon.controller;

import com.inf2328.energytycoon.model.*;
import com.inf2328.energytycoon.simulation.GameEngine;

public class GameController {

    private City city = new City();
    private Player player = new Player(200);
    private GameEngine engine = new GameEngine();
    private int cycle = 1;

    public GameController() {
        city.getResidences().add(new Residence(1));
        city.getResidences().add(new Residence(2));
        city.getPlants().add(new PowerPlant());
    }

    public void nextCycle() {
        engine.runCycle(city, player);
        cycle++;
    }

    public boolean buildPlant() {
        if (player.spend(100)) {
            city.getPlants().add(new PowerPlant());
            return true;
        }
        return false;
    }

    public boolean upgradePlant() {
        PowerPlant plant = city.getPlants().get(0);
        if (player.spend(plant.upgradeCost())) {
            plant.upgrade();
            return true;
        }
        return false;
    }

    public City getCity() {
        return city;
    }

    public Player getPlayer() {
        return player;
    }

    public int getCycle() {
        return cycle;
    }
}
