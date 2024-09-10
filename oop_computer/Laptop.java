package oop_computer;

public class Laptop extends Computer {

    String BatteryDuration;
    String touchpad;
    boolean withNumpad;
    String screenSize;
    int numberOfUSBPorts;
    boolean withHDMISlot;
    boolean withSDCardSlot;

    public Laptop(String BatteryDuration, String touchpad, boolean withNumpad, String screenSize, int numberOfUSBPorts, boolean withHDMISlot, boolean withSDCardSlot, double price, double height, double length, double width, String type, String model, String brand) {
        super(price, height, length, width, type, model, brand);
        this.BatteryDuration = BatteryDuration;
        this.touchpad = touchpad;
        this.withNumpad = withNumpad;
        this.screenSize = screenSize;
        this.numberOfUSBPorts = numberOfUSBPorts;
        this.withHDMISlot = withHDMISlot;
        this.withSDCardSlot = withSDCardSlot;
    }

    public void volumeUp() {
        System.out.println("Volume Increased");
    }

    public void volumeDown() {
        System.out.println("Volume Decreased");
    }

    public void brightnessUp() {
        System.out.println("Brightness Increased");
    }

    public void brightnessDown() {
        System.out.println("Brightness Decreased");
    }

    public void screenOff() {
        System.out.println(this.brand + " " + this.model + " Screen on Sleep . . .");
    }
}
