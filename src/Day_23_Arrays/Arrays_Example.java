package Day_23_Arrays;

import java.util.Random;

public class Arrays_Example {
    public static void main(String[] args) {
        String str[] = new String[5];
        int value[] = new int[5];
        value[0] = 1;
        value[1] = 4;
        value[2] = 5;

        System.out.println(value[0]);
        System.out.println(value[1]);
        System.out.println(value[2]);
        System.out.println(value[3]);
        System.out.println(value[4]);

//         for döngüsünde arrayimizin içerisindeki sayıların tümünün karesini yazdırın.

        for (int i = 0; i < 3; i++) {
            System.out.println(value[i] * value[i]);
        }
        System.out.println("---------------------------------------------------");
//        Bir array oluşturun ve Haftanın günlerini bu array’in içine kaydedin.

        String[] str1 = new String[7];
        str1[0] = "pazartesi";
        str1[1] = "sali";
        str1[2] = "carsamba";
        str1[3] = "persembe";
        str1[4] = "cuma";
        str1[5] = "cumartesi";
        str1[6] = "pazar";
        System.out.println("bugun gunlerden " + str1[2]);

        System.out.println("----------------------------------------------------------------");

//        haftanın ucuncu gunun carsamba olup olmadıgını kontrol edin ve bugun gunlerden carsambadır değilse bugun
//        gunlerden carsamba değildir yazsın.

        if (str1[2].equals("carsamba")) {
            System.out.println("haftanin ucuncu gunu carsambadir.");
        } else {
            System.out.println("haftanin ucunuc gunu carsamba degildir.");
        }
        System.out.println("----------------------------------------------------------------");

//        haftanın gunlerinde cuma var mıdır. varsa true yoksa false seklinde ekran yazdırın.

        for (int i = 0; i < 7; i++) {
            if (str1[i].equalsIgnoreCase("cuma")) {
                System.out.println("true");
                break;
            } else {
                if (i == 6) {
                    System.out.println("false");
                }
            }
        }

        System.out.println("----------------------------------------------------------------");

//        Döngü kullanarak haftanın tüm günlerini yazdırın.

        for (int i = 0; i < 7; i++) {
            System.out.println(str1[i]);
        }

//        String str[]={"pazartesi", "salı", "carsamba","persembe", "cuma", "cumartesi", "pazar"};
//        System.out.println(str[4]);
//        bu sekilde de tanımlama yapılır.

        System.out.println("----------------------------------------------------------------");

//        5 boyutlu bir array oluşturun ve içerisine 5 adet isim atayın içerinde kendi isminizin olup
//        olmadığını kontrol edin. Var ise isminiz grup içerisinde vardır yazdırsın yok ise isminiz
//        grup içerinde yoktur yazdırsın

        String five[] = {"faruk", "ahmet", "emine", "remziye", "hasan"};
        for (int i = 0; i < 5; i++) {
            if (five[i].equalsIgnoreCase("hasan")) {
                System.out.println("isminiz grupta vardir");
                break;
            } else {
                System.out.println("grupta isminiz yoktur.");
            }

        }
        String five1[] = {"faruk", "ahmet", "emine", "remziye", "hasan"};
        int count=0;
        for (int i = 0; i <5 ; i++) {
            if (five1[i].equalsIgnoreCase("hasan")){
                count++;
            }
        }
        if (count>0){
            System.out.println("isminiz grupta vardır");
        }else {
            System.out.println("isminiz grupta yoktur.");
        }




        System.out.println("----------------------------------------------------------------");

//        20 boyutunda bir dizi oluşturun ve her bir index’ine random 0 ile 100 arasın bir değer
//        atayın. Sonrasında 17 index numarasındaki veriyi ekrana yazdırın


        Random random = new Random();
        int x = random.nextInt(100);
        System.out.println(x);

        int[] dizi = new int[20];
        System.out.println(dizi[17]);

        for (int i = 0; i < 20; i++) {
            dizi[i] = random.nextInt(100);
            System.out.println((i) + " sayi : " + dizi[i]);

        }
        System.out.println("17. indexteki sayimiz: " + dizi[17]);

        System.out.println("----------------------------------------------------------------");


//        arrayımızın içindeki çift ve tek sayılarımız kac adettir.

        int tek = 0, cift = 0;
        for (int i = 0; i < 20; i++) {
            if (dizi[i] % 2 == 0) {
                cift++;
            } else {
                tek++;
            }

        }
        System.out.println("tek sayi : " + tek);
        System.out.println("cift sayi: " + cift);


    }
}
