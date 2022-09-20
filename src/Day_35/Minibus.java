package Day_35;

public class Minibus extends Vehicle {
    // minibus is a vehicle

    int seat;

    public void using (){
        System.out.println(color+" "+ type+ " "+ seat+" yolcu tasır.");
    }


    public String toString() {
        return "Minibus{" +
                "seat=" + seat +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
