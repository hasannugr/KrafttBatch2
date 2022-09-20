package Day_4_Review;

import javax.sound.midi.Soundbank;

public class TypeCasting {

    public static void main(String[]args){
        // Type casting
        //widenning
        // -widenning casting (casting up) otamatik olur küçük olandan büyük olana doğru olan shorttan inte gibi
        // implicit conversion/ casting up : kapalı dönüştürme java kendisi yapar

        int myAge =8;
        double myDouble=myAge;
        System.out.println(myDouble);

        int version = 2;
        double ver =version;              // float da kullanılır.
        System.out.println(ver);

        long uzun =3;
        ver= uzun;
        System.out.println(ver);

        float kayan =uzun;
        System.out.println(kayan);

        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");


        //Norrawing
        //- norrowing casting büyük olanı küçük olana koymak doubledan floatta atama manuel yaparız.
        // içine atayacağımız data tipini yazıyoruz. (int) ( sayı1+sayı2+sayı3)+sayı4;//aynı olan data tipi dışarda kalır.
        //exlipcit conversion -açıktan dönüştürme( casting down ) (narrowing casting de data kaybı olabilir.double d=9.78;
       double d =9.78;
       int i=(int)d;
       System.out.println(i);

        //2.3 , 4.1 ,5 sayılarını uygun typelara atayın ve sayıların toplamını tam sayı olarak yazdırın.

        double num1=2.3;
        double num2=4.1;
        int    num3=5;
        int    sum =(int)(num1+num2)+num3;
        System.out.println(sum);

        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");


        //2.3 , 4.4, 5.3 , 5   sayılarını uygun type lara atayın ve sayıların toplamını tam sayı olarak yazdırın.

        double num4=2.3;
        double num5=4.4;
        double num6=5.3;
        int    num7=5 ;
        //         2+4+5+5 = 16                 küsüratları toplamadı.    // DOĞRU DEĞİL YANLIŞ KULLANIM. DATA KAYNI YAŞANIYOR.
         int toplam = (int)num4+(int)num5+(int)num6+num7;
         //        2.3 +4.4 +5.3 +5 = 17       küsüratları topladı.
         int toplam2= (int)(num4+num5+num6)+num7;          // EN DOĞRU OLAN ŞEKİL BU ŞEKİL.

        System.out.println(toplam);
        System.out.println(toplam2);








    }
}
