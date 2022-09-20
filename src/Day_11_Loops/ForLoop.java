package Day_11_Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {


      /* System.out.println("Giris");
        for (int i=0; i<10; i++){
            System.out.println(i + "-Hasan");

        }

        System.out.println("Cikis");


//        Örnek: ekrana 20 adet alt alta «merhaba dünya» yazdırın.

        for ( int t=0; t<20; t++){

            System.out.println(t+"-MERHABA DUNYA");
        }

//        Örnek: 0 dan 100 e kadar olan sayıları ekrana yazdırın.

        for (int sayı=0; sayı<101; sayı++){
            System.out.println(sayı);
        }
//       Örnek: 15 den 100 e kadar olan sayıları ekrana yazdırın.

        for(int sayı1=15; sayı1<101; sayı1++){

            System.out.println(sayı1);
        }
//      Örnek: 0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. )

        for (int i=100; i>0; i--){
            System.out.println(i);
        }
//      Örnek: 0 dan 100 e kadar olan çift sayıları ekrana yazdırın.

        for (int i=0; i<100; i++) {
        i+=2;

            if (100%2==0){
                System.out.println(i);
            }
        }

//     Örnek: 10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları ekrana yazdırın

        for (int i=10; i<=1000; i+=10){
            if(i%10==0)                        // nu şekildde de kulllanılr.
                System.out.println(i+"");
        }
//        Örnek: 6 faktöriyel’in sonucu nedir? (6!=6*5*4*3*2*1)

        Scanner scan=new Scanner(System.in);
        System.out.println("Faktoriyeli girilecel rakami yaziniz: ");
        int faktoriyel=6;
        for (int i=6; i>0; i--){
            int sonuc=1;
            sonuc=sonuc*i;
            System.out.println("6!="+sonuc);
        }
//         Örnek: 0 ile 20 arasındaki tüm sayılarının küpleri alarak ekrana yazdırın.

        for (int i=0; i<20; i++){
            int sonuc=1;
            sonuc=i*i*i;
            System.out.println(i+" nin: "+ sonuc);
        }
//    Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit değerlerini ekrana yazdırın. (C=(F-32) / 1.8)

        for (int i=23; i<50; i++){
            int fahrenheit=(int)(i*1.8)+32;
            System.out.println(i+ "C=" + fahrenheit+" dir");

        }
//          Örnek: Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini sorun .
//           Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar ekrana yazdırın.

      //  Scanner scan=new Scanner(System.in);
        System.out.print("LUTFEN KELIME GIRINIZ: ");
        String ad=scan.nextLine();
        System.out.print("LUTFEN SAYI GIRINIZ: ");
        int say=scan.nextInt();

        for (int i=0; i<say; i++){
            System.out.println(ad);
        }

//    Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın girdiği sayı dahil
//    0 dan başlayarak kullanıcının girdiği sayıya kadar olan tamsayıların toplamını ekrana yazdıran programı yazınız.
       Scanner scan=new Scanner(System.in);
        System.out.print("LUTFEN 0 ILE 1000 ARASINDA SAYI GIRINIZ: ");
        int sayi=scan.nextInt();
        int sonuc=0;
        for (int i=0; i<=sayi; i++){

            sonuc+=i;
        }  System.out.println(sayi+ " kadar olan toplam: "+sonuc);

//        Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
//        girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
//        tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
//        yazınız.


        Scanner sc=new Scanner(System.in);
        System.out.print("LUTFEN 0 ILE 1000 ARASINDA SAYI GIRINIZ: ");
        int sayı =scan.nextInt();
        int tekSayi=0;
        int ciftSayi=0;
        for  (int i=0; i<=sayi; i++){
            if (i%2==0){
                ciftSayi+=i;

            }else {
                tekSayi+=i;
            }
        }
        System.out.println("TEK SAYILAR TOPLAMI: "+tekSayi);
        System.out.println("CIFT SAYILAR TOPLAMI: "+ ciftSayi);


//        Örnek: Kullanıcıdan taban ve kuvvet bilgilerini alarak ekrana sonucu
//        yazdıran programı yazdırınız.(2 üzeri 4 =16)

      //  Scanner scan=new  Scanner(System.in);

        System.out.print("taban giriniz: ");
        int taban=scan.nextInt();
        System.out.print("üs giriniz: ");
        int ust=scan.nextInt();

        int sonuc1=1;
        for(int i=0; i<ust; i++){
            sonuc1*=taban;
        }
        System.out.println(sonuc);

//        Örnek: a dan z ye kadar olan harfleri ekrana yazdırın.


        char i;
        for ( i='a'; i<='z'; i++){
            System.out.print(i);

        }

//        Örnek: 9 sayısının çarpım tablosunu yazdırınız.

        for (int i=0; i<=10; i++){
            int carpma=i*9;
            System.out.println("9 ile "+ i+ " carpimi: "+ carpma);
        }


//        Örnek: Şifre tanımlayın ve kullanıcıya ekrandan 3 defa şifreyi
//        girmesini isteyin şifreyi bulursa «tebrikler şifre doğru» bulamaz ise
//        şifre yanlış ikazı versin.

        Scanner scan=new Scanner(System.in);
        int sifre=1071;
        for(int i=0; i<3; i++){
            System.out.print("lutfen sayi giriniz : ");
            int kullanıcıSifre=scan.nextInt();
            if (kullanıcıSifre==sifre){
                System.out.println("tebrikler sifreyi buldunuz");
                break;
            }else {
                System.out.println("sifre hatali.");
            }
        }if (sifre==3){
            System.out.println("sifreniz bloke olmustur.");
        }*/





    }
}
