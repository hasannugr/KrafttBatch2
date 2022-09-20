package Day_8_AllOperators_2;

import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {


        /*ödev: Scanner sınıfını kullanarak kullanıcıdan 10 ile 100 arasında bir rakam aldırın;
        Bu sayıyı operatör kullanarak 5 ile çarpın;
        Çıkan sonucu operatör kullanarak 2 ye bölün;
        Çıkan sonucu operatör kullanarak 1 arttırın;
        Çıkan sonucu operatör kullanarak 4 e göre modunu alın;
        Çıkan sonucu operatör kullanarak 1 azaltın;
        Çıkan sonucu ekrana yazdırın*/



        /*System.out.print("LUTFEN 10 ILE 100 ARASINDA BIR SAYI GIRINIZ: ");
        Scanner scan=new Scanner(System.in);
        int sayı= scan.nextInt();
        int sayıCarpma=sayı*5;
        int sayıBolme=sayıCarpma/2;
        int sayıArttırma=++sayıBolme;
        int sayıMod=sayıBolme%4;
        int sayıAzaltma=--sayıMod;
        System.out.println(sayıAzaltma);*/

        /*ödev:
        Kullanıcıdan double araba fiyatı ,KDV , ÖTV oranını alın. Araba fiyatı üzerinden KDV miktarını
        hesaplayın . Hesapladığınız toplam tutar (araba +KDV miktarı) üzerinden ÖTV oranındaki artışı
        toplam tutara ekleyerek hesaplayın. Çıkan sonuç 700.000 ve üzeri ile 1.000.000 (bir milyon)
        arasında ise ekrana true yazdırın;*/


       /* System.out.print("LUTFEN ARABA FIYATINI GIRINIZ: ");
        Scanner scan=new Scanner(System.in);
        double arabaFıyatı=scan.nextDouble();
        System.out.print("LUTFEN KDV ORANINI GIRINIZ: ");
        double kdv=scan.nextDouble();
        System.out.print("LUTFEN OTV ORANINI GIRINIZ: ");
        double kdvTutrarıhesaplama=arabaFıyatı+100*kdv;
        double otv=scan.nextDouble();
        double otvHesaplama= arabaFıyatı*100/otv;
        System.out.println("ARABANIN OTV LI TUTARI :" + otvHesaplama);
        System.out.println("ARABANIN KDV LI TUTARI: " + kdvTutrarıhesaplama);
        double toplamTutar=kdvTutrarıhesaplama+otvHesaplama;
        System.out.println("TOPLAM TUTAR :" + toplamTutar);
        boolean sonuc=toplamTutar>=700000 && toplamTutar<=1000000;
        System.out.println("TR DE ARABA ALINMAZ :"+ sonuc);*/

        /* Ödev:
           Scanner sınıfını kullanarak kullanıcıdan önce String türünde kullanıcının ismini alın ardından
           double türünde 0-100 arasında 3 sayı alın ;
           Bu verileri kullanarak
            1. Ortalama 70 ile 80 arasında ise ekrana true;
            2. Ortalama 80 ve üzeri ile 90 arasında ise false;
            3. 90 ve üzeri 100 arasında ise true;
            4. Tam 100 ise ekrana false yazdırın.*/


        Scanner scan=new Scanner(System.in);
        System.out.print("LUTFEN ADINIZI GIRINIZ: ");
        String name=scan.nextLine();
        System.out.println("------LUTFEN 0 ILE 100 ARASINDA NOTLARINI GIRINIZ------");
        System.out.print("LUTFEN BIRINCI NOTU GIRINIZ: ");
        double not1=scan.nextDouble();
        System.out.print("LUTFEN IKINCI NOTU GIRINIZ: ");
        double not2=scan.nextDouble();
        System.out.print("LUTFEN UCUNCU NOTU GIRINIZ: ");
        double not3=scan.nextDouble();
        double ortalama=(not1+not2+not3)/3;
        System.out.println("GENEL NOT ORTALAMASI: " + ortalama);
        boolean sonuc= ortalama>=70 & ortalama<80;
        System.out.println("ORTLAMA HESAPLAMASI 70 ILE 80 ARASINDA: "+ sonuc);
        boolean sonuc1= ortalama>=80 & ortalama<90;
        System.out.println("ORTLAMA HESAPLAMASI 80-90 ARASINDA: "+ sonuc1);
        boolean sonuc2= ortalama>=90 & ortalama<100;
        System.out.println("ORTALAMA HESAPLAMASI 90 ILE 100 ARASINDA: " + sonuc2);
        boolean sonuc3= !(ortalama==100);
        System.out.println("ORTALAMA 100 PUAN: " + sonuc3);
        System.out.println("SAYIN "+ name + "NOTLARINIZ YUKARIDAKI GIBIDIR." );



    }

}
