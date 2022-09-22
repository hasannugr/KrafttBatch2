package Day_42_OOP_Review;

public class StaticCalısma {
    public static  int x=5;
    public int y=10;

    public void normalMetot(){
        System.out.println(x*10);
        System.out.println(y);
    }
    public static void staticMetot(){
        System.out.println(x);
//        System.out.println(y); static olmayanlar static metot içerisinde kkullanılamazllar.
//        normalMetot();
    }
}
