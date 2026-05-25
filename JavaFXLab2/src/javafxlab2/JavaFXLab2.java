/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxlab2;

import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author mahat
 */
public class JavaFXLab2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Scene 1
        Text ques1 = new Text("What is your Name: ?");
        TextField ans1 = new TextField();
        ans1.setPromptText("Answer: ");
        Button submitButton1 = new Button("Submit");
        submitButton1.setStyle("-fx-background-color:green;"
                + "-fx-text-fill:white");
        
        VBox root1 = new VBox(10);
        root1.getChildren().addAll(ques1,ans1,submitButton1);
        Scene scene1 = new Scene(root1,400,300);
        
        
        //Scene 2
        Text ques2 = new Text("What is your ID: ?");
        TextField ans2 = new TextField();
        ans2.setPromptText("Answer: ");
        Button submitButton2 = new Button("Submit");
        submitButton2.setStyle("-fx-background-color:green;"
                + "-fx-text-fill:white");
        Button backButton1 = new Button("Back");
        
        VBox root2 = new VBox(10);
        root2.getChildren().addAll(ques2,ans2,submitButton2,backButton1);
        Scene scene2 = new Scene(root2,400,300);
        
        
        //Scene 3
        Text ques3 = new Text("What is your Dept: ?");
        TextField ans3 = new TextField();
        ans2.setPromptText("Answer: ");
        Button submitButton3 = new Button("Submit");
        submitButton3.setStyle("-fx-background-color:green;"
                + "-fx-text-fill:white");
        Button backButton2 = new Button("Back");
        
        
        //Scene 4
        Text msg = new Text("Congratulations! You have answered all correct");
        msg.setStyle("-fx-font-size:15px;"
                + "-fx-font-weight:bold;");
        Button Done = new Button("Done");
        Done.setStyle("-fx-background-color:green;"
                + "-fx-text-fill:white;"
                + "-fx-font-weight:bold;");
        
        VBox root4 = new VBox();
        root4.getChildren().addAll(msg,Done);
        root4.setStyle("-fx-alignment:center");
        Scene lastscene = new Scene(root4,400,300);
        
        
        
        VBox root3 = new VBox(10);
        root3.getChildren().addAll(ques3,ans3,submitButton3,backButton2);
        Scene scene3 = new Scene(root3,400,300);
        
        submitButton1.setOnAction(e->{
            
            String answer = ans1.getText();
            
            if(answer.equals("Mahathir")){
                primaryStage.setScene(scene2);
            }
            else{
                System.out.println("Wrong Answer");
            }
        });
            
        submitButton2.setOnAction(e->{
            
            String answer2 = ans2.getText();
            
            if(answer2.equals("16")){
                primaryStage.setScene(scene3);
            }
            else{
                System.out.println("Wrong Answer");
            }
             
        });
        
        submitButton3.setOnAction(e->{
            
            String answer3 = ans3.getText();
            
            if(answer3.equals("CSE")){
                primaryStage.setScene(lastscene);
            }
            else{
                System.out.println("Wrong Answer");
            }
             
        });
        
        Done.setOnAction(e->{
            primaryStage.setScene(scene1);
        
        
        
        
        
        });
        
        backButton1.setOnAction(e->{
                primaryStage.setScene(scene1);
        });
        backButton2.setOnAction(e->{
                primaryStage.setScene(scene2);
        });
        
        
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Stage"); 
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }

    
}
