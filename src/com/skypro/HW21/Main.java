package com.skypro.HW21;

import com.skypro.HW21.transport.Car;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
        Car bmv = new Car("BMV", "A8", 1.5, "Черный", 2005, "Германия", "Седан",
                6, "Автомат", "a543aa", false,
                false, false);
        System.out.println(bmv);
    }
}
