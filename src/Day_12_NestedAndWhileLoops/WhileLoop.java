package Day_12_NestedAndWhileLoops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

      /*  int i=0;
        while (i<5){
            System.out.println("Hasan");
            i++;
        }
//     Örnek: ekrana 20 adet alt alta «merhaba dünya» yazdırın.
        int i=0;
        while (i<21){
            System.out.println( i + "- merhaba dunya");
            i++;
        }
//     Örnek: 0 dan 100 e kadar olan sayıları ekrana yazdırın.
        int i=0;
        while (i<101){
            System.out.println(i);
            i++;
        }
//     Örnek: 15 den 100 e kadar olan sayıları ekrana yazdırın
        int i=15;
        while (i<=100){
            System.out.println(i);
            i++;
        }
//     Örnek: 0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. (99 98 97 vs)
        int i=100;
        while (i>0){
            System.out.println(i);
            i--;
        }
//     Örnek: 0 dan 100 e kadar olan çift sayıları ekrana yazdırın.

        int i=0;
        while (i<=100){
            System.out.println(i);
            i+=2;
        }
//    Örnek: 0 dan 100 e kadar olan tek sayıları ekrana yazdırın.
        int i=1;
        while (i<=100){
            System.out.println(i);
            i+=2;
        }
//    Örnek: 10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları ekrana yazdırın
        int i=10;
        while (i<=1000){

            if (i%10==0){
            System.out.print(i);
            i+=10;
        }
//    Örnek: 8 faktöriyel’in sonucu nedir? (6!=6*5*4*3*2*1)
        int i=1,sonuc=1;

        while (i<=8){
            sonuc*=i;
        }
        System.out.println(sonuc);

    }

//     Örnek: 0 ile 20 arasındaki 3 ün katı olan tüm sayılarının küpleri alarak ekrana yazdırın.
         int i=3;
        while (i<20){
            int sonuc=i*i*i;
            System.out.println(i+" kupu: "+ sonuc);
            i+=3;

        }

//  Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit değerlerini ekrana yazdırın. (C=(F-32) / 1.8)


        int i=23;
        int f=50;
        while (i<f){
            int fahrenheit=(int)(i*1.8)+32;
            System.out.println(i+ "C=" + fahrenheit+" fahrenheittir.");
        i++;
        }*/

//   Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
//    girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
//     olan tamsayıların toplamını ekrana yazdıran programı yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.print("LUTFEN 0 ILE 1000 ARASINDA BIR SAYI GIRINIZ: ");
        int sayi=scan.nextInt();
       int sonuc=0;
        for (int i=0; i<=sayi; i++){

            sonuc+=i;
        }  System.out.println(sayi+ " kadar olan toplam: "+sonuc);







        }











    }




