package Day_46_Exception;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("sayi: ");
        int x = scan.nextInt();
        System.out.println(faktoriyel_2(x));
    }

    public static int faktoriyel_2(int n) {   //en iyi çözüm
        int result = 1;
        try {
            if (n < 0) throw new Exception("sayı 0 dan küçük olamaz");
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }

        return result;


    }

    public static int faktoriyel(int n) {   //çözüm
        int result = 1;
        if (n < 0) {
            return -1;
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;

    }
}
