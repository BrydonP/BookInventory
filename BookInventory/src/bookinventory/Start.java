/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookinventory;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Vlad Crihan
 */
public class Start extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    TextField searchBar = new TextField();
    Button btSearch = new Button("Search");
    Button btListAll = new Button("List All");

    @Override
    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);

        ImageView logo = new ImageView(new Image("file:///D://School//Semester "
                + "2//Java 2//Assignment2//BookInventory//BookInventory//src//"
                + "bookImage.jpg"));
        gridPane.add(logo,3,0);
        
        gridPane.add(searchBar, 3, 1);
        gridPane.add(btSearch, 4, 1);

        ComboBox<String> sortBy = new ComboBox<>();
        sortBy.getItems().addAll("Title", "ISPN", "Last Name");
        sortBy.setValue("Search By");
        gridPane.add(sortBy, 2, 1);
        
        gridPane.add(btListAll,3,2);
        
        Scene scene = new Scene(gridPane, 800, 600);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("BookInventory");
        primaryStage.show();
    }

}
