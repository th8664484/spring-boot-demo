package com.bean;


import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Salad{
    private String banana;
    private String apple;
    private String watermelon;

    public Salad() {
    }

    public Salad(String banana, String apple, String watermelon) {
        this.banana = banana;
        this.apple = apple;
        this.watermelon = watermelon;
    }

}
