package Day_34.Class_Object;

public class Vehicle {
// fields
    String type;
    String color;
    int tires;
    int price;


//    methots
    public void getİnfo(){
        System.out.println("Vehicle {type: "+ type+ "color: "+ color+ "tires: "+ tires+ "pirice:"+tires+"price:"+price+ "}");
    }
    public  void setWinter(){
        System.out.println(color+ " "+ type+ "icin "+ tires+ " adet kislik lastik lazim. " );
    }
    public  void forRent(){
        System.out.println(color+ " "+ type + "icin bir gunluk kiralama bedeli "+ price+ " tl dir.");
    }
    public void forRentOtion( int daycount){
        System.out.print("\r***"+color+ " renkli "+ type+ " icin "+daycount+ " gunluk kiralama bedeli "+ price*daycount+ "Tl dir.");
    }
}
