package Activity;

/**
 *
 * @author Eliah
 */
public class Car {
    private String model;
    private String brand;
    private String color;
    private int topSpeed; 

    public Car(String model, String brand, String color, int topSpeed) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    
    
    
}
