package Day_35;

public class Vehicle {

    String type;
    double price;
    String color;

    public void sellPriceWihtTax(double price){
        price+=price*0.10;
        System.out.println(price);
    }

}
