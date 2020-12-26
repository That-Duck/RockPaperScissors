package com.company;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Insets;

public class Main extends Application {

    @Override
    public void start (Stage primaryStage) {
        primaryStage.setTitle("Rock Paper Scissors");

        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 350, 300);
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(new Label("Monthly Investment:"), 0, 0);
        grid.add(new Label("Interest Rate:"), 0, 1);
        grid.add(new Label("Monthly Return:"), 0, 2);
        grid.add(new Label("Investment Time:"), 0, 3);

        TextField monthField = new TextField();
        grid.add(monthField, 1, 0);

        TextField interestField = new TextField();
        grid.add(interestField, 1, 1);

        TextField returnField = new TextField();
        grid.add(returnField, 1, 2);
        
        TextField timeField = new TextField();
        grid.add(timeField, 1, 3);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
	// write your code here
        launch(args);
    }
}
