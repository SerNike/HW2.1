package com.skypro.HW21;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8", 3.0, "Черный", 2020, "Германия");
        Car bmv = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage",2.4, "Красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        Car unknownCarOne = new Car( "", "", 0, "", -5, "Южная Корея");
        Car unknownCarTwo = new Car( "BMW", "Avante", 2.0, "Оранжевый", 2016, "Южная Корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(unknownCarOne);
        System.out.println(unknownCarTwo);
    }
}
