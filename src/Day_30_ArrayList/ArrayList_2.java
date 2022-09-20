package Day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_2 {
//    remove
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(10);
        nums.add(100);
        nums.add(101);
        nums.add(190);
        nums.add(5);
        nums.add(55);
        System.out.println("nums = " + nums);
//        Remove metodu girilen index numarasındaki değeri siler, kaybeder.
        nums.remove(1);
        System.out.println("nums = " + nums);
        nums.remove(1);
        System.out.println("nums = " + nums);

        nums.add(60);
        nums.add(200);
        System.out.println("nums = " + nums);
        System.out.println("nums.size() = " + nums.size());

        int num = 5;
        Integer NUM = 5;  // Interger şeklinde tanımladığımız için sayı olarak 5 i kaldırır

//        nums.remove(num);   // bu şekilde tanımlarsak index numarasına göre kaldırma yapıyor.

        nums.remove(NUM);


        System.out.println("nums = " + nums);


    }
}
