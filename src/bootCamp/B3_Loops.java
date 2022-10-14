package bootCamp;

import java.util.Scanner;

public class B3_Loops {
    public static void main(String[] args) {
        //fori
        //iteration number is fixed
        //track index
        //for( initialization; condition; iterator){}

        //while
        //iteration is not fixed
        //do not track if index
        //while(condition){}

        //do while
        //one time execute even condition is false
        //do{}while(condition);

        String message = "Welcome to bootcamp";
        //how to reverse last word of message?
        String reverse = "";
        //1-tersden dondureyim
        //2-ilk boşlukta kodum kesilmeli
        int i = message.length()-1;

        for (i = i; i>=0 ; i--) {
            if (message.charAt(i)==' '){break;}
            if (message.charAt(i)!=' '){
                reverse+=message.charAt(i);
            }
        }
        System.out.println("reverse = " + reverse);
        System.out.println("reverse.length() = " + reverse.length());

        message = "Welcome to bootcamp";
        i=message.length()-1;
        reverse = "";
        while (message.charAt(i)!=' '){
           reverse+= message.charAt(i);//pma
            i--;
        }
        System.out.println("reverse = " + reverse);

        //---------------

        String color = "red";
        int count=0;
        do{
            count++;
            System.out.println(count +"--->do it");
        }while (color.equals("mavi") &&  count<10);

        //break and continue

        //kullanıcan bir sayı aralığı alalım
        //1-  7 ye tam bolunen sayıya kadar azalan şekilde yazıralım.
        //2-  7 ye tam bolunenleri yazdıran artan sekilde yazdırın

        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        //1
        for (int j = Integer.max(i1,i2); j >=Integer.min(i1,i2) ; j--) {
            if (j%7==0)break;//true oldugu anda donguyu keser loop un dısına cıkar
            System.out.print(" " + j);
        }
        System.out.println();
        //2
        for (int t = Integer.min(i1,i2); t<=Integer.max(i1,i2) ; t++) {
            if (t%7!=0)continue; //true ise devam etme altta ki satırları yazmadan for un başına dön
            System.out.println(t+" ");
        }

        //label works with break and continue
        //verilen aralıktaki prime numberları bulunuz.

        //1-prime number sadece 1 e ve kendine bolunen sayılar.
        //2-hersayı 1 e bolunebilir loop 2 den başlamalı
        //3-iç içe 2 loop olmalı dıstak sayı aralıığını tek tek gezmeli gezmeli
        //4-içdeki loop dışrakinden gelen her sayıyı 2 dahil son sayıya kadar tüm sayılara bolmeli ve tam bir bolum olup olmadıgını denetlemeli

        //7 8 9 10 11 12 13 14
        System.out.println("----------");
        label : for (int j = Math.min(i1,i2); j <=Math.max(i1,i2); j++) {
//            7---2,3,4,5,6
//            8---2,3,4,5,6,7
            for (int k = 2; k < j; k++) {
                if (j%k==0){
                    continue label;
                }
            }
            System.out.println(j+" ");
        }




    }

}
