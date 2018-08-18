package com.dophin.starbuzz;

public class Eat {
    private String level;
    private String name;
    private String description;

    public  final static Eat[] Eats = {
            new Eat("咖哩飯","印度火辣辣咖哩飯"),
            new Eat("牛肉麵","好吃的牛肉麵"),
            new Eat("簡易素餐","這是素的")
    };

    public Eat(String name,String description) {
        this.name = name;
        this.description = description;
    }

    public Eat(String level,String name,String description) {
        this.level = level;
        this.name = name;
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return  description;
    }
}
