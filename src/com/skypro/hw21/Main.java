package com.skypro.hw21;

import com.skypro.hw21.transport.Bus;
import com.skypro.hw21.transport.Driver.DriverB;
import com.skypro.hw21.transport.Driver.DriverC;
import com.skypro.hw21.transport.Driver.DriverD;
import com.skypro.hw21.transport.PassengerCar;
import com.skypro.hw21.transport.Transport;
import com.skypro.hw21.transport.Truck;

public class Main {
    public static void main (String[] args) {
        DriverB driverB = new DriverB("Иван Иванович Иванов", true, 5);
        DriverC driverC = new DriverC("Петр Петрович Петров", true, 2);
        DriverD driverD = new DriverD("Роман романович Романов", true, 1);
        PassengerCar passengerCar = new PassengerCar("BMV", "E6", 3.0, driverB);
        Truck truck = new Truck("Камаз", "6520", 5.0, driverC);
        Bus bus = new Bus("Газ", "22171", 6.0, driverD);

        print(passengerCar);
        print(truck);
        print(bus);
    }
    private static void print(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем "
                + transport.getBrand() + " и будет участвовать в заезде");
    }
}
