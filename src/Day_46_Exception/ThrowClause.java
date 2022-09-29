package Day_46_Exception;

public class ThrowClause {
    public static void main(String[] args) {


        throwMetot(0);


    }

    public static void throwMetot(int x) {

        System.out.println("program başladı");

        if (x == 0) {
            throw new ArithmeticException("x sıfır olamaz");    //kod bloğu

        }
        System.out.println("program devam ediyor");
    }

}
