package com.inf2328.energytycoon.simulation;

import com.inf2328.energytycoon.model.City;
import com.inf2328.energytycoon.model.Player;

public class GameEngine {

    public void runCycle(City city, Player player) {
        double production = city.getPlants()
                .stream()
                .mapToDouble(p -> p.getProduction())
                .sum();

        double demand = city.getResidences()
                .stream()
                .mapToDouble(r -> r.getDemand())
                .sum();

        double ratio = production / demand;

        double income = city.getResidences()
                .stream()
                .mapToDouble(r -> r.getPayment())
                .sum();

        if (ratio < 1) {
            income *= ratio;
        }

        player.earn(income);
        city.updateSatisfaction(ratio);
    }
}
