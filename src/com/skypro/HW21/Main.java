package com.skypro.HW21;

import com.skypro.HW21.transport.Bus;
import com.skypro.HW21.transport.Car;

import java.security.Key;

public class Main {
    public static void main(String[] args) {

        Car bmv = new Car("BMV", "M2", 2005, "Германия", "Черный",
                250, 3.2, "Седан", 6, "Автомат",
                "a543aa", false, false, false);
        Bus mers = new Bus("Мерседес", "Микроавтобус", 2005, "Чехия", "Желтый", 100);
        Bus pas3205 = new Bus("Паз", "3205", -5, "Россия", "Желтый", 80);
        Bus laiz = new Bus("Лиаз", "5292", 2010, "Россия", " ", 110);
        System.out.println(mers);
        System.out.println(pas3205);
        System.out.println(laiz);
        System.out.println(bmv);
    }

}
