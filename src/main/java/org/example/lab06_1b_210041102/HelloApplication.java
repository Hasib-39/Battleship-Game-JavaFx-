package org.example.lab06_1b_210041102;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("initial.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            primaryStage.setTitle("BATTLESHIP");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}