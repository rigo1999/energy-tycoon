package com.inf2328.energytycoon;

import com.inf2328.energytycoon.view.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        MainView root = new MainView();
        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Energy Tycoon MVP");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
