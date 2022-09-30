package Day_34_Static.staticMetot;

import java.util.Random;

public class Geometric {

    static int primeter;

    public static void setPrimeter(int... sides){
        for (int i:sides) {
            primeter+=i;
        }
        System.out.println(primeter);
    }

}class main2{
    public static void main(String[] args) {
        Geometric.setPrimeter(   main2.genarateSide(),main2.genarateSide(),  main2.genarateSide(),  main2.genarateSide());


    }
    public static int genarateSide(){
        Random rm = new Random();
        return rm.nextInt(10);
    }
}
