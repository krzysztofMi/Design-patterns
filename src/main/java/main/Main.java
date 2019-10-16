package main;

import Eats.Cake;
import Eats.PotatoSoup;
import Eats.Soup;
import Eats.StrawberryCake;
import builder.Meal;

public class Main {
    public static void main(String[] args){
          Soup soup = new PotatoSoup();
        Cake cake = new StrawberryCake();
        Meal meal = new Meal.MealBuilder(soup, cake).create();
        System.out.println("meal");
    }
}
