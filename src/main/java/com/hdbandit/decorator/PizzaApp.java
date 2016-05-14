package com.hdbandit.decorator;

import static com.hdbandit.decorator.Ingredients.*;

public class PizzaApp {

@SuppressWarnings("unchecked")
public static void main(String[] args) {
       
       // The client orders a Barbacoa pizza. The base price of the pizza is 15 dollars.
       Pizza myOrder = Pizza.newPizza(15, baicon(), cheese(), tomato(), barbacoaSauce());
       
       // The client adds some complements
       // We are decorating the pizza with complements
       myOrder.setComplements(
               Complements::chips, 
               Complements::extraDrink, 
               Complements::iceCream, 
               Complements::cinemaDisccount);
       
       // Finally get the price
       System.out.println("Base price of the barbacoa pizza: " + myOrder.getBasePrice());
       System.out.println("Total price to pay with the complements: " + myOrder.getTotalPrice());
   }

}
