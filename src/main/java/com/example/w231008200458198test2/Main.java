package com.example.w231008200458198test2;

public class Main {

    public static void main(String[] args) {
        Food Burger = new Food("Burger",500,5.25,25);
        Food Pizza = new Food("Pizza",300,3.50,10);

        Meal cart = new Meal();
        cart.addFoodItem(Burger);
        cart.addFoodItem(Burger);
        cart.RemoveFoodItem(Burger);
        cart.addFoodItem(Pizza);
        System.out.println(cart.getFoodNames());
        System.out.println(cart);

    }
}
