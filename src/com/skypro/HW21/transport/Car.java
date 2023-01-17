package com.skypro.HW21.transport;


public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean tires;
    private Key key;


    public static final String defaultBrand = "default";
    public static final String defaultModel = "default";
    public static final double defaultEngineVolume = 1.5;
    public static final String defaultColor = "Белый";
    public static final int defaultYear = 2000;
    public static final int defaultNumberOfSeats = 5;
    public static final String defaultBodyType = "тип кузова";
    public static final String defaultTransmission = "1";
    public static final String defaultRegistrationNumber = "a111aa";

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String bodyType, int numberOfSeats,String transmission, String registrationNumber,
               boolean tires, boolean RemoteEngineStart, boolean KeylessAccess) {

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
            this.year = 2000;
        } else {
            this.year = defaultYear;
        }
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = defaultBodyType;
        } else {
            this.bodyType = bodyType;
        }
        if (numberOfSeats <= 0){
            this.numberOfSeats = 2000;
        } else {
            this.numberOfSeats = defaultNumberOfSeats;
        }
        this.country = country;

        setEngineVolume(engineVolume);
        setColor(color);
        setRegistrationNumber(registrationNumber);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setTires(tires);
        setKey(RemoteEngineStart, KeylessAccess );


    }
    class Key {
        private final boolean RemoteEngineStart;
        private final boolean KeylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            RemoteEngineStart = remoteEngineStart;
            KeylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return RemoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return KeylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "RemoteEngineStart=" + RemoteEngineStart +
                    ", KeylessAccess=" + KeylessAccess +
                    '}';
        }
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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
    public String getCountry() {
        return country;
    }
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (model == null || model.isBlank()){
            this.transmission = defaultTransmission;
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (model == null || model.isBlank()) {
            this.registrationNumber = defaultRegistrationNumber;
        } else {
            this.registrationNumber = registrationNumber;
        }

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }
    public void changeTires (int month) {
        if (month >= 4 && month <= 10) {
            setTires(true);
        } else {
            setTires(false);
        }
    }
    public void setKey(boolean remoteEngineStart,boolean KeylessAccess) {
        this.key = new Key(remoteEngineStart, KeylessAccess);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", tires=" + tires +
                ", key=" + key +
                '}';
    }
}