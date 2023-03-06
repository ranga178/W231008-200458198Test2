package com.example.w231008200458198test2;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Food> cart;


    public Meal() {
        cart = new ArrayList<>();
    }

    public void addFoodItem(Food food){
        cart.add(food);
    }

    public void RemoveFoodItem(Food food){
        cart.remove(food);
    }
    public String getFoodNames()
    {
        String FoodNames=" ";
        for(Food food : cart)
            FoodNames += food.getName()+", ";

        return FoodNames.substring(0,FoodNames.length()-2);
    }
}
