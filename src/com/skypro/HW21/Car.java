package com.skypro.HW21;


public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    public static final String defaultBrand = "default";
    public static final String defaultModel = "default";
    public static final double defaultEngineVolume = 1.5;
    public static final String defaultColor = "Белый";
    public static final int defaultYear = 2000;
    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        setBrand(brand);
        setColor(color);
        setModel(model);
        setEngineVolume(engineVolume);
        setYear(year);
        this.country=country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = defaultBrand;
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = defaultModel;
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0){
            this.engineVolume = defaultEngineVolume;
        } else {
            this.engineVolume = engineVolume;
        }
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0){
            this.year = 2000;
        } else {
            this.year = defaultYear;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Бренд автомобиля: " + brand + ". Модель автомобиля: " + model +
                ". Объем двигателя в литрах: " + engineVolume + ". Цвет кузова: " + color +
                ". Год производства: " + year + ". Страна сборки: " + country;
    }
}