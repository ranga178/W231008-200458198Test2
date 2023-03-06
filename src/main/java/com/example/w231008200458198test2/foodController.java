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
        ObservableList<Food> meal = FXCollections.observableArrayList();
        meal.add(new Food("Burger",500,5.25,25));
        meal.add(new Food("Pizza",300,3.50,10));
        meal.add(new Food("Fries",360,2.75,3));
        ListView<Food> listView = new ListView<>(meal);

    }
}
