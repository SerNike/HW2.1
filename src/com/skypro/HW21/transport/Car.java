package com.skypro.HW21.transport;


public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean tires;
    private Key key;

    public static final double defaultEngineVolume = 1.5;
    public static final int defaultNumberOfSeats = 5;
    public static final String defaultBodyType = "тип кузова";
    public static final String defaultTransmission = "1";
    public static final String defaultRegistrationNumber = "a111aa";

    public Car(String brand, String model,int year, String country,String color, int maxSpeed, double engineVolume,
               String bodyType, int numberOfSeats,String transmission, String registrationNumber,
               boolean tires, boolean RemoteEngineStart, boolean KeylessAccess) {
        super(brand, model,year,country,color, maxSpeed);


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


        setEngineVolume(engineVolume);
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
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()){
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
        if (registrationNumber == null || registrationNumber.isBlank()) {
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
        return "Марка автомобиля: " + getBrand() + ". Модель автомобиля: " + getModel() + ". Год выпуска автомобиля: "
                + getYear() + ". Страна производитель автомобиля: " + getCountry() + ". Цвет автомобиля: " + getColor() +
                ". Максимальная скорость автомобиля: " + getMaxSpeed() + ". Объем двигателя: " + engineVolume + ". Тип кузова: " + bodyType + ". Количество мест: " + numberOfSeats
                + ". Коробка передач: " + transmission + ". Регистрационный номер: " + registrationNumber + ". Шины: "
                + tires + ". Удаленный запуск двигателя: " + key.RemoteEngineStart + ". Доступ без ключа: " + key.KeylessAccess;
    }
}