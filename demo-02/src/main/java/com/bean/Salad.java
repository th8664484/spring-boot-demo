package com.bean;

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

    public String getBanana() {
        return banana;
    }

    public void setBanana(String banana) {
        this.banana = banana;
    }

    public String getApple() {
        return apple;
    }

    public void setApple(String apple) {
        this.apple = apple;
    }

    public String getWatermelon() {
        return watermelon;
    }

    public void setWatermelon(String watermelon) {
        this.watermelon = watermelon;
    }
}
