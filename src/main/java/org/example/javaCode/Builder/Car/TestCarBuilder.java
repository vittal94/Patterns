package org.example.javaCode.Builder.Car;

public class TestCarBuilder {
    public static void run() {
        Car volvo = Car.createCar("volvo")
                .buildColor("gray")
                .buildNumberOfDoors((byte) 4)
                .buildPrice(25_000)
                .build();
        System.out.println(volvo);

        Car lada = Car.createCar("lada").build();
        System.out.println(lada);

    }
}
