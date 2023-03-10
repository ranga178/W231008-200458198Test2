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

    public int getCalories()
    {
        int total = 0;
        for(Food food :cart)
            total += food.getCalories();
        return total;
    }

    public double getTotalPrice()
    {
        double total = 0;
        for(Food food :cart)
            total += food.getPrice();
        return total;
    }

    public int getProtein()
    {
        int total=0;
        for(Food food:cart)
            total += food.getProtein();
        return total;
    }

    public String toString()
    {
        return String.format("Meal has  %d items, Total Price: $%.2f ",
                cart.size(),getTotalPrice());

    }

    public String getFoodNames()
    {
        String FoodNames=" ";
        for(Food food : cart)
            FoodNames += food.getName()+", ";

        return FoodNames.substring(0,FoodNames.length()-2);
    }
}
