
package javafxcalculatorapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXCalculatorApp extends Application {

    private TextField display = new TextField();
    private String operator = "";
    private double num1 = 0;

    @Override
    public void start(Stage stage) {

        display.setEditable(false);
        display.setPrefHeight(60);

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));

        String[][] buttons = {
                {"7","8","9","/"},
                {"4","5","6","*"},
                {"1","2","3","-"},
                {"C","0","=","+"}
        };

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                String text = buttons[i][j];
                Button btn = new Button(text);
                btn.setPrefSize(60, 60);
                btn.setOnAction(e -> handleInput(text));
                grid.add(btn, j, i);
            }
        }

        VBox root = new VBox(10, display, grid);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 300, 400);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setTitle("JavaFX Calculator");
        stage.setScene(scene);
        stage.show();
    }

    private void handleInput(String value) {
        switch (value) {
            case "C":
                display.clear();
                num1 = 0;
                operator = "";
                break;

            case "+":
            case "-":
            case "*":
            case "/":
                num1 = Double.parseDouble(display.getText());
                operator = value;
                display.clear();
                break;

            case "=":
                double num2 = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": result = num1 / num2; break;
                }

                display.setText(String.valueOf(result));
                break;

            default:
                display.appendText(value);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
