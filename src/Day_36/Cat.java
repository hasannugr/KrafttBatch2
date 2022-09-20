package Day_36;

public class Cat extends Animal{
//    int foodCount;
    boolean isNankor;
    public  Cat (int foodCount, String color, boolean isNankor){
        super(foodCount,color);
        this.isNankor=isNankor;
    }






   /* public void talk(){
        System.out.println(super.foodCount);
        System.out.println("miyav miyav");
    }
    public int speed(){
        return 20;
        // this dersek sınıfın variableını super dersek de parent sınfının variablını kullanmıs oluruz.
    }*/
}
