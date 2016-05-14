package com.hdbandit.decorator;

import java.util.function.Function;
import java.util.stream.Stream;

public class Pizza {
    
    private Ingredient[] ingredients;
    private Function<Pizza, Pizza> complement;
    private int basePrice;
    
    public static Pizza newPizza(int price, Ingredient... ingredients) {
        return new Pizza(price, ingredients);
    }

    private Pizza(int basePrice, Ingredient... ingredients) {
        this.ingredients = ingredients;
        this.basePrice = basePrice;
    }
    
    public void setComplements(Function<Pizza, Pizza>... complements) {
       complement = Stream.of(complements).reduce(Function.identity(), Function::andThen);
    }
    
    public int getTotalPrice() {
        Pizza p = complement.apply(this);
        return p.getBasePrice();
    }

    public int getBasePrice() {
        return basePrice;
    }

}
