package oop_computer;

public class Computer {

    double price;
    double height;
    double length;
    double width;
    String type;  // Gaming, Office, Basic
    String model;  // Can be null
    String brand;  // Can be mixed

   
    public Computer(double price, double height, double length, double width, String type, String model, String brand) {
        this.price = price;
        this.height = height;
        this.length = length;
        this.width = width;
        this.type = type;
        this.model = model;
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println("Powering on . . .");
    }

    public void turnOff() {
        System.out.println("Shutting down. . .");
    }

    public void reset() {
        System.out.println("Restaring . . .");
    }

}
