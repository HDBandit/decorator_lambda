package com.hdbandit.decorator;

public final class Complements {

    public static Pizza chips(Pizza pizza) {
        return Pizza.newPizza(pizza.getBasePrice() + 2);
    }
    
    public static Pizza extraDrink(Pizza pizza) {
        return Pizza.newPizza(pizza.getBasePrice() + 2);
    }
    
    public static Pizza cinemaDisccount(Pizza pizza) {
        return Pizza.newPizza(pizza.getBasePrice() + 2);
    }
    
    public static Pizza iceCream(Pizza pizza) {
        return Pizza.newPizza(pizza.getBasePrice() + 4);
    }
    

}
