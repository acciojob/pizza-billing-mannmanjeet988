package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakenAway;
    private boolean isBillGenerated;
    private int cheese;
    private int toppings;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            isCheeseAdded = true;
            this.price += cheese;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded == false){
            isToppingAdded = true;
            this.price += toppings;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakenAway == false){
            isTakenAway = true;
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){

            if(isCheeseAdded){
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            }
            if(isToppingAdded){
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if(isTakenAway){
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
