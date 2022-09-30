package Day_35_Inharitance;

public class Vehicle {

    String type;
    double price;
    String color;

    public void sellPriceWihtTax(double price){
        price+=price*0.10;
        System.out.println(price);
    }

}
