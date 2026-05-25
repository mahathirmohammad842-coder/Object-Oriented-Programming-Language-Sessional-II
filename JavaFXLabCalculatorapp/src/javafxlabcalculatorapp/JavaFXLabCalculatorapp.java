package javafxlabcalculatorapp;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXLabCalculatorapp extends Application {

    double firstNumber = 0;
    String operator = "";

    @Override
    public void start(Stage stage) {

        // Display
        TextField display = new TextField();
        display.setEditable(false);
        display.getStyleClass().add("display");

        // Grid Layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(15);
        grid.setVgap(15);

        // Number Buttons
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");

        // Operator Buttons
        Button btnAdd = new Button("+");
        Button btnSub = new Button("−");
        Button btnMul = new Button("×");
        Button btnDiv = new Button("÷");
        Button btnMod = new Button("%");
        Button btnEq  = new Button("=");
        Button btnC   = new Button("C");
        Button btnDot = new Button(".");

        // CSS Classes
        btnAdd.getStyleClass().add("operator");
        btnSub.getStyleClass().add("operator");
        btnMul.getStyleClass().add("operator");
        btnDiv.getStyleClass().add("operator");
        btnMod.getStyleClass().add("operator");

        btnEq.getStyleClass().add("equal");
        btnC.getStyleClass().add("cancel");

        // Row 0
        grid.add(btnC, 0, 0);
        grid.add(btnMod, 1, 0);
        grid.add(btnDiv, 2, 0);

        // Row 1
        grid.add(btn7, 0, 1);
        grid.add(btn8, 1, 1);
        grid.add(btn9, 2, 1);

        // Row 2
        grid.add(btn4, 0, 2);
        grid.add(btn5, 1, 2);
        grid.add(btn6, 2, 2);

        // Row 3
        grid.add(btn1, 0, 3);
        grid.add(btn2, 1, 3);
        grid.add(btn3, 2, 3);

        // Row 4
        grid.add(btn0, 1, 4);
        grid.add(btnDot, 2, 4);

        // Right Side Operators
        grid.add(btnMul, 3, 1);
        grid.add(btnSub, 3, 2);
        grid.add(btnAdd, 3, 3);
        grid.add(btnEq, 3, 4);

        // Number Button Actions
        btn0.setOnAction(e -> display.appendText("0"));
        btn1.setOnAction(e -> display.appendText("1"));
        btn2.setOnAction(e -> display.appendText("2"));
        btn3.setOnAction(e -> display.appendText("3"));
        btn4.setOnAction(e -> display.appendText("4"));
        btn5.setOnAction(e -> display.appendText("5"));
        btn6.setOnAction(e -> display.appendText("6"));
        btn7.setOnAction(e -> display.appendText("7"));
        btn8.setOnAction(e -> display.appendText("8"));
        btn9.setOnAction(e -> display.appendText("9"));

        // Decimal Button
        btnDot.setOnAction(e -> {
            if (!display.getText().contains(".")) {
                display.appendText(".");
            }
        });

        // Clear Button
        btnC.setOnAction(e -> {
            display.clear();
            firstNumber = 0;
            operator = "";
        });

        // Operator Actions
        btnAdd.setOnAction(e -> {
            if(display.getText().isEmpty()) return;

            firstNumber = Double.parseDouble(display.getText());
            operator = "+";
            display.clear();
        });

        btnSub.setOnAction(e -> {
            if(display.getText().isEmpty()) return;

            firstNumber = Double.parseDouble(display.getText());
            operator = "-";
            display.clear();
        });

        btnMul.setOnAction(e -> {
            if(display.getText().isEmpty()) return;

            firstNumber = Double.parseDouble(display.getText());
            operator = "*";
            display.clear();
        });

        btnDiv.setOnAction(e -> {
            if(display.getText().isEmpty()) return;

            firstNumber = Double.parseDouble(display.getText());
            operator = "/";
            display.clear();
        });

        btnMod.setOnAction(e -> {
            if(display.getText().isEmpty()) return;

            firstNumber = Double.parseDouble(display.getText());
            operator = "%";
            display.clear();
        });

        // Equal Button
        btnEq.setOnAction(e -> {

            if(display.getText().isEmpty()) return;

            double secondNumber = Double.parseDouble(display.getText());
            double result = 0;

            switch(operator) {

                case "+":
                    result = firstNumber + secondNumber;
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    break;

                case "/":

                    if(secondNumber == 0) {
                        display.setText("Error");
                        return;
                    }

                    result = firstNumber / secondNumber;
                    break;

                case "%":
                    result = firstNumber % secondNumber;
                    break;

                default:
                    return;
            }

            // Remove .0 from integer
            if(result == (int) result) {
                display.setText(String.valueOf((int) result));
            } else {
                display.setText(String.valueOf(result));
            }
        });

        // Root Layout
        VBox root = new VBox(30, display, grid);
        root.setAlignment(Pos.CENTER);

        // Scene
        Scene scene = new Scene(root, 420, 700);

      scene.getStylesheets().add(
    "file:///C:/Users/mahat/OneDrive/Documents/NetBeansProjects/JavaFXLabCalculatorapp/src/javafxlabcalculatorapp/style.css"
);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}