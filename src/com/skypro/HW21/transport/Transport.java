package com.skypro.HW21.transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public static final String defaultBrand = "default";
    public static final String defaultModel = "default";
    public static final int defaultYear = 2000;
    public static final String defaultColor = "Белый";


    public Transport(String brand, String model,int year, String country,String color, int maxSpeed) {
        if (brand == null || brand.isBlank()) {
            this.brand = defaultBrand;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = defaultModel;
        } else {
            this.model = model;
        }
        if (year <= 0){
            this.year = defaultYear;
        } else {
            this.year = year;
        }
        this.country = country;


    setColor(color);
    setMaxSpeed(maxSpeed);
}
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()){
            this.color = defaultColor;
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0){
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return "Бренд: " + brand +
                ". Модель: " + model +
                ". Год выпуска: " + year +
                ". Страна: " + country + '\'' +
                ". Цвет: " + color +
                ". Максимальная скорость: " + maxSpeed;
    }
}
