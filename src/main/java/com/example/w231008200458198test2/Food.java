package com.example.w231008200458198test2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Food {
    private String name;
    private int calories;
    private double price;
    private int protein;

    private ObservableList<String> food;


    public Food(String name, int calories, double price, int protein) {
       setName(name);
       setCalories(calories);
       setPrice(price);
       setProtein(protein);
       this.food = FXCollections.observableArrayList();
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return String.format("%s $%.2f",name,price);
    }
    public void setName(String name) {
        if(!name.isBlank())
          this.name = name;
        else throw new IllegalArgumentException("Name cannot be blank.");
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if(calories >= 0 && calories <= 2000)
         this.calories = calories;
        else
            throw new IllegalArgumentException("Must be in the range of 0 to 2000");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >=0 && price <= 150)
          this.price = price;
        else
            throw new IllegalArgumentException("Price must be in the range of 0 - 150 dollars");
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        if(protein > 0 && protein <= 100)
          this.protein = protein;
        else
            throw new IllegalArgumentException("Protein must be in the range of 0-100");
    }

    public ObservableList<String> getFood() {
        return food;
    }

    public void setFood(ObservableList<String> food) {
        this.food = food;
    }
}
