package org.example.javaCode.Builder.Car;

public class Car {
    private String model;
    private String color = "unknown";
    private byte numbersOfDoors;
    private double price;
    private Car(CarBuilder builder) {
       this.model = builder.model;
       this.color = builder.color;
       this.price = builder.price;
       this.numbersOfDoors = builder.numbersOfDoors;
    }
     static class CarBuilder {
        private Car car;
        private String model;
        private String color = "unknown";
        private byte numbersOfDoors;
        private double price;
        public CarBuilder(String model) {

            this.model = model;
        }
        public CarBuilder buildColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder buildNumberOfDoors(byte number) {
            this.numbersOfDoors = number;
            return this;
        }
        public CarBuilder buildPrice(int price) {
            this.price = price;
            return this;
        }
        public Car build() {
            car = new Car(this);
            return car;
        }

    }

    public static CarBuilder createCar(String model) {
        return new CarBuilder(model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numbersOfDoors=" + numbersOfDoors +
                ", price=" + price +
                '}';
    }
}
