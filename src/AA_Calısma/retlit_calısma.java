package AA_Calısma;

import java.util.Scanner;

public class retlit_calısma {
    public static void main(String[] args) {
//        int tipte hour,minute,second olarak 3 değişken belirleyin
//        String tipde amOrPm bir değişken belirletyin. "AM" veya "PM" şeklinde degerleri tutabilmesi için.
//        Değişkenlere değerleri konsolda kullanıcıdan alın. Örnekteki sekilde yazdırın.
//            Example : 15:30:11 PM


        String amOrPm = "PM";

        Scanner scan = new Scanner(System.in); //buna dokunmayın
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int second = scan.nextInt();

        System.out.println(hour + ":" + minute + ":" + second+ " " +amOrPm);


        //kod buraya


    }

}

