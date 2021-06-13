package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "salad")
@PropertySource("classpath:salad.properties")
public class SaladConfig {
    private String banana;
    private String apple;
    private String watermelon;

    public SaladConfig() {
    }

    public SaladConfig(String banana, String apple, String watermelon) {
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
