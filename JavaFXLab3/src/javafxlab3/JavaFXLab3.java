/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxlab3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mahat
 */
public class JavaFXLab3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        Label Name1 = new Label("Name");
        TextField ID = new TextField();
        ID.setStyle("-fx-padding: 5;");
        Label ID1 = new Label("ID");
        TextField Name = new TextField();
        Name.setStyle("-fx-padding: 5;");
        
         Button btn = new Button("Submit");
        btn.setStyle("-fx-background-color:green;"
                + "-fx-text-fill:white");
       
        
        
    
        //Table Part
        
        TableView<Data_Class> table = new TableView<>();
        TableColumn<Data_Class,String> col1 = new TableColumn("Name");
        TableColumn<Data_Class,Integer> col2 = new TableColumn("ID");
        
        col1.setCellValueFactory(cellData -> {
                Data_Class p = cellData.getValue();
                return new javafx.beans.property.SimpleStringProperty(p.name);
                });
        
            col2.setCellValueFactory(cellData -> {
            Data_Class p = cellData.getValue();
            return new javafx.beans.property.SimpleIn
                    
                    tegerProperty(p.id).asObject();
            });
        
        
        
        table.getColumns().addAll(col1,col2);
        ObservableList<Data_Class> data = FXCollections.observableArrayList();
        
        VBox root = new VBox(10);
        root.getChildren().addAll(ID1,ID,Name1,Name,btn);
        
        VBox root2 = new VBox(10,table);
        
        
        VBox roott = new VBox(20);
        roott.getChildren().addAll(root,root2);
        
        
        
         String name = nameField.getText();
            int id = Integer.parseInt(idField.getText());

            Data_Class data = new Data_Class(name, id);

            list.add(data);

            // clear field
            nameField.clear();
            idField.clear();
        
        Scene scene = new Scene(roott, 400, 300);
        primaryStage.setTitle("Student Reg.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
