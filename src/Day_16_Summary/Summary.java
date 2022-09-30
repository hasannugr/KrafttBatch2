package Day_16_Summary;

import java.util.Scanner;

public class Summary   {


    public static void main(String[] args) {
      //  fibonacci(3);

        ebob(50,60);

//        Kullanıcıdan alınan sayının kaç basamaklı olduğunu bulan metodu yazınız



       Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayi giriniz: ");
        int sayi=scan.nextInt();
        int basamak=0;
        while (sayi>0){
            sayi/=10;
            basamak++;
        }
        System.out.println(basamak);

//        Kullanıcı dan 2 sayı alın. İlk sayı taban, ikinci sayı ise üs olsun mathPow metodu
//        oluşturun işlemler bu metodun içerisinde yapılsın.
//        (Math sınıfının pow metodunu siz yapacaksınız)


//        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen 1. sayiyi  giriniz: ");
        int sayi1=scan.nextInt();
        System.out.print("lutfen ust sayiyi  giriniz: ");
        int sayi2=scan.nextInt();
        int i=1;
         int sonuc=1;
        while (i<=sayi2){
            sonuc= sonuc* sayi1;

            i++;
        }

        System.out.print("sonuc :" + sonuc);
        }



//        100 ile 999 arasındaki tüm Armstrong sayılarını yazdıran bir program yazın. Sayının her basamağının
//        küplerinin toplamı sayının kendisine eşitse bu sayı Armstrong sayısı olarak adlandırılır.

        public static void  amstrongTree (int start, int end){
            for(int i=start; i<end; i++){
                int x,y,z,sonuc;

                x=i/100;
                y=i%100/10;
                z=i%10;
                sonuc=x*x*x+y*y*y+z*z*z;
                if (i==sonuc){
                    System.out.println(sonuc+ " ");
                }

            }

        }




    // Kullanıcı tarafından girilen n terimli Fibonacci dizisini yazdıran bir program yazın: 0 1 1 2 3 5 8 13 2

    public static void fibonacci(int adet){
        int x=0,y=1;
        for (int i=2,z; i<adet; i++){
            z=y+x;
            System.out.print(""+ z);
            x=y;
            y=z;

        }
    }

//    Kullanıcıdan 2 sayı alın ve bu iki sayının en büyük ortak bölenini ekrana yazdırı. 1 ile 7 sonuc 1 6-12(6)

    public static int ebob(int x, int y){
        int sonuc=1;
        for (int i=1; i<=Math.max(x,y); i++){
            if (x%i==0 && y%i==0){
                sonuc=i;
            }
        }

        return sonuc;
    }








}