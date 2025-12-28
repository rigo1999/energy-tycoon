package com.inf2328.energytycoon.view;

import com.inf2328.energytycoon.model.City;
import com.inf2328.energytycoon.model.Player;

import java.util.Scanner;

public class ConsoleView {

    private Scanner scanner = new Scanner(System.in);

    public void displayState(int cycle, City city, Player player) {
        System.out.println("\nCycle " + cycle);
        System.out.println("Money: " + player.getMoney());
        System.out.println("Power plants: " + city.getPlants().size());
        System.out.println("Residences: " + city.getResidences().size());
        System.out.println("Satisfaction: " + city.getSatisfaction());
    }

    public int askAction() {
        System.out.println("1. Build power plant");
        System.out.println("2. Upgrade power plant");
        System.out.println("3. Skip");
        return scanner.nextInt();
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }

    public void gameOver() {
        System.out.println("Game Over: citizens are unhappy");
    }
}
