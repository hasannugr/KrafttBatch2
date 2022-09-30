package Day_36_Inharitance_Cont;

import Day_37_Inheritance_Cont_2.Fabrika;

public class Vehicle {

    int model;
    static String color;
    int speed;

    public void start() {
        System.out.println("araç çalıştı");
    }

    public void stop() {
        System.out.println("araç durduruldu");
    }

}
