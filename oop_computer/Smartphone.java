package oop_computer;

public class Smartphone extends Computer {

    double batteryDuration;  
    double screenSize;
    String cameraQuality;
    int numberOfSimCardSlots;
    boolean withSdCardSlots;
    boolean withHeadphoneJack;
    int numberOfChargingPorts;


    public Smartphone(double batteryDuration, double screenSize, String cameraQuality, int numberOfSimCardSlots, boolean withSdCardSlots, boolean withHeadphoneJack, int numberOfChargingPorts, double price, double height, double length, double width, String type, String model, String brand) {
        super(price, height, length, width, type, model, brand);
        this.batteryDuration = batteryDuration;
        this.screenSize = screenSize;
        this.cameraQuality = cameraQuality;
        this.numberOfSimCardSlots = numberOfSimCardSlots;
        this.withSdCardSlots = withSdCardSlots;
        this.withHeadphoneJack = withHeadphoneJack;
        this.numberOfChargingPorts = numberOfChargingPorts;
    }
    
    
    
     public void volumeUp() {
        System.out.println(this.brand + " " + this.model + " volume increased.");
    }

    public void volumeDown() {
        System.out.println(this.brand + " " + this.model +  " volume decreased.");
    }

    public void brightnessUp() {
        System.out.println(this.brand + " " + this.model +  " brightness increased.");
    }

    public void brightnessDown() {
        System.out.println(this.brand + " " + this.model + " brightness decreased.");
    }

    public void screenOff() {
        System.out.println(this.brand + " " + this.model + " screen is now OFF.");
    }

    public void text(String message, String phoneNumber) {
        System.out.println("Texting '" + message + "' to " + phoneNumber + ".");
    }

    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

}
