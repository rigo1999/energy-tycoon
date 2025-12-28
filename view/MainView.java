package com.inf2328.energytycoon.view;

import com.inf2328.energytycoon.controller.GameController;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class MainView extends VBox {

    private GameController controller = new GameController();

    private Label cycleLabel = new Label();
    private Label moneyLabel = new Label();
    private Label plantsLabel = new Label();
    private Label satisfactionLabel = new Label();
    private Label messageLabel = new Label();

    public MainView() {
        setSpacing(10);
        setPadding(new Insets(15));

        Button buildBtn = new Button("Build Power Plant");
        Button upgradeBtn = new Button("Upgrade Power Plant");
        Button nextBtn = new Button("Next Cycle");

        buildBtn.setOnAction(e -> {
            messageLabel.setText(
                controller.buildPlant() ? "Plant built" : "Not enough money"
            );
            refresh();
        });

        upgradeBtn.setOnAction(e -> {
            messageLabel.setText(
                controller.upgradePlant() ? "Plant upgraded" : "Not enough money"
            );
            refresh();
        });

        nextBtn.setOnAction(e -> {
            controller.nextCycle();
            refresh();
        });

        getChildren().addAll(
                cycleLabel,
                moneyLabel,
                plantsLabel,
                satisfactionLabel,
                buildBtn,
                upgradeBtn,
                nextBtn,
                messageLabel
        );

        refresh();
    }

    private void refresh() {
        cycleLabel.setText("Cycle: " + controller.getCycle());
        moneyLabel.setText("Money: " + controller.getPlayer().getMoney());
        plantsLabel.setText("Power plants: " + controller.getCity().getPlants().size());
        satisfactionLabel.setText("Satisfaction: " + controller.getCity().getSatisfaction());
    }
}
