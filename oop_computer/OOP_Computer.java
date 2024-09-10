package oop_computer;

// @author CELINO, ELIAH JOSEPH
public class OOP_Computer {

    public static void main(String[] args) {

        Computer pc1 = new Computer(
                50000.0,
                18.0,
                24.0,
                8.0,
                "Gaming",
                null,
                "Intel • Nvidia"
        );

        pc1.turnOn();
        pc1.reset();
        pc1.turnOff();

        Laptop myLaptop = new Laptop(
                "8 hours",
                "Touchpad",
                true,
                "15.6 inches",
                3,
                true,
                true,
                60000.0,
                0.9,
                14.2,
                10.1,
                "Gaming",
                "TUF Gaming A15",
                "Asus"
        );

        myLaptop.turnOn();
        myLaptop.volumeDown();
        myLaptop.brightnessUp();
        myLaptop.screenOff();

        Smartphone myPhone = new Smartphone(
                20.0, 
                6.2, 
                "50 MP", 
                2, 
                true,
                true, 
                1, 
                80000, 
                5.79, 
                2.78, 
                0.3, 
                "Smartphone", 
                "S24",
                "Samsung"
        );

        myPhone.turnOn();
        myPhone.text("Chismis Chismis", "09123456789");
        myPhone.call("0987654321");
        myPhone.screenOff();
    }

}
