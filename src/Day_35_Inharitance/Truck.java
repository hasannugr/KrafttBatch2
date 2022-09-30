package Day_35_Inharitance;

public class Truck extends Vehicle {
    // Truck is a vehicle


    int carryingCapasity;

    public void  carrying(){
        System.out.println(color+ " "+ type+ " "+ carryingCapasity+ " yuk tasır.");
    }


    public String toString() {
        return "Truck{" +
                "carryingCapasity=" + carryingCapasity +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
    class GarageTruck{
        public static void main(String[] args) {
            Truck truck=new Truck();

            truck.carryingCapasity=16000;
            truck.type="kamyon";
            truck.color="morcivent";
//            truck.sellPriceWithTax(120000);

            truck.carrying();
            truck.toString();

        }
    }
}
