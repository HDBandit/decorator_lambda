package com.hdbandit.decorator;

public final class Ingredients {
    
    private static final Ingredient TOMATO = new Ingredient("tomato", 2);
    private static final Ingredient CHEESE = new Ingredient("cheese", 1);
    private static final Ingredient EGG = new Ingredient("egg", 3);
    private static final Ingredient BAICON = new Ingredient("baicon", 5);
    private static final Ingredient BARBACOA_SAUCE = new Ingredient("barbacoa sauce", 2);
    
    public static Ingredient tomato() {
        return TOMATO;
    }
    
    public static Ingredient baicon() {
        return BAICON;
    }
    
    public static Ingredient egg() {
        return EGG;
    }
    
    public static Ingredient cheese() {
        return CHEESE;
    }
    
    public static Ingredient barbacoaSauce() {
        return BARBACOA_SAUCE;
    }
   
}
