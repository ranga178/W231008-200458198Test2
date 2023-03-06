package com.example.w231008200458198test2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class foodController implements Initializable {

    @FXML
    private Button button;

    @FXML
    private TextField calories;

    @FXML
    private ListView<String> listView;

    @FXML
    private TextField name;

    @FXML
    private TextField price;

    @FXML
    private TextField protein;

    @FXML
    private Label totalCalories;

    @FXML
    private Label totalPrice;

    @FXML
    private Label totalProtein;


    @FXML
    void addFood(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       Food meal = new Food("Pizza",350,2.50,5);


       meal.getFood().add("Pizza");

        Food meal02 = new Food("Burger",400,3.50,20);
        meal.getFood().add("Burger");

        Food meal03 = new Food("Fries",250,2.75,6);
        meal.getFood().add("Fries");
        listView.setItems(meal.getFood());
        totalCalories.setText(Double.toString(meal.getCalories()));
        totalProtein.setText(Integer.toString(meal.getProtein()));
        totalPrice.setText(Double.toString(meal.getPrice()));

    }
}
