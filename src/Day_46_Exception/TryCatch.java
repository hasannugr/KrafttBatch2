
package Day_46_Exception;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        System.out.println("program başladı");
        boolean devam = true;

        harun:
        while (devam) {

            try {
                Scanner scan = new Scanner(System.in);
                System.out.print(" sayı : ");
                int x = scan.nextInt();
                System.out.print("bölüm : ");
                int y = scan.nextInt();
                System.out.println("sonuç: " + (x / y));


            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("lütfen tekrar deneyiniz");
                continue harun;
            } finally {
                System.out.println("finally bloğu çalıştı");
            }
            devam = false;
        }

        int z = 5;

        System.out.println("program sonlandı");


    }

}

