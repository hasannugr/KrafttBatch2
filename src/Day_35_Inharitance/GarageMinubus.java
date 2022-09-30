package Day_35_Inharitance;

public class GarageMinubus {
    public static void main(String[] args) {
        Minibus minibus=new Minibus();
        minibus.type="Minubus";
        minibus.color="Mavi";
        minibus.seat=14;
        minibus.sellPriceWihtTax(50000);

        minibus.using();
        minibus.toString();



    }
}class  GarageTruck{
    public static void main(String[] args) {
        Truck truck=new Truck();
        truck.color="Volvo";
        truck.color="Blue";
        truck.carryingCapasity=50;
        truck.sellPriceWihtTax(40000);
        truck.type="Kamyon";

        truck.toString();
        truck.carrying();

    }
}
