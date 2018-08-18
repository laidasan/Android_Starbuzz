package com.dophin.starbuzz;

public class Drink {
    private String level;
    private String name;
    private String description;
    //private int imageResourceId;


    public static final Drink[] drinks = {
            new Drink("Latte","Nice coffe"),
            new Drink("Cappuccino","This is a good coffe"),
            new Drink("Filter","Amazing coffe")
    };

    Drink(String name,String description) {
        this.name = name;
        this.description = description;
        //this.imageResourceId = imageResourceId;
    }

    public Drink(String level,String name,String description) {
        this.name = name;
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }

    //public int getImageResourceId() {
    //   return imageResourceId;
    //}


}
