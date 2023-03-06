package com.example.w231008200458198test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class foodController {

    @FXML
    private Button button;

    @FXML
    private TextField calories;

    @FXML
    private ListView<?> listView;

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

}
