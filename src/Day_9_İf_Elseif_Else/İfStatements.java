package Day_9_İf_Elseif_Else;

import java.util.Scanner;

public class İfStatements {
    private static String x;

    public static void main(String[] args) {


      int speed= 10;
        boolean isMoving= true;
        if (isMoving);{
            speed++;
        }
        System.out.println("Hiz =" + speed);

        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        // eger x 10 a eşitse y ye 20 atayın.
        int x= 10;
        int y= 0;
        if (x==10){
            y=20;
        }
        System.out.println("y= " + y);
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
// sıcaklık 20 ve 20 derecenin uzerinddeyse kelebekler ucar diye konsola yazdırın.
        int temp=19;
        if (temp>=20){
            System.out.println("Kelebekler ucar");
        }else{
            System.out.println("Kelebekler sogukta ucmaz");
        }
         System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
//        AYSENİN HARCLIGI 5 LİRADAN AZ İSE BBAASU ONA 10 LİRA HARCLIK VERİR.
        int cepHarclıgı=4;
        if (cepHarclıgı<5){

            System.out.println(cepHarclıgı+10);
        }
         System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");

//            Bir program yazın ve balance(para hesabı) isimli double
//           türünde bir değişkenimiz olsun. Suit(takım) in fiyatı blance
//           deki değerden az ise console takımı satın alabilir şeklinde
//           bir ifade yazdıralım

        double paraHesabı=35;
        double takım=40;
        if (paraHesabı>=takım){
            System.out.println("TAKIMI SATIN ALABILIR.");
        }else {
            System.out.println("TAKIMI SATIN ALAMAZ.");
        }




       // System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
       // • Write a program; 2 numara kabul etsin numaraların eşit olup olmadığını döndürsün.
       Scanner scan=new Scanner(System.in);
      int numara1;
      int numara2;
        System.out.println("-----LUTFEN SAYILARI GIRINIZ----- ");
        System.out.print("BIRINCI SAYIYI GIRINIZ: ");
        numara1=scan.nextInt();
        System.out.print("IKINCI SAYIYI GIRINIZ: ");
        numara2=scan.nextInt();
      if (numara1==numara2){
          System.out.println("SAYILAR ESIT ");
      }else {
          System.out.println("SAYILAR ESIT DEGILDIR");
      }
        //  System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        // Bir program yazın 2 tane numara kabul etsin ve büyük olanı versin.
//        Scanner scan=new Scanner(System.in);
//        Scanner scan=new Scanner(System.in);
//        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("-----lutfen sayıları gırınız ");
        System.out.print("bırıncı sayı:");
        num1=scan.nextInt();
        System.out.print("ıkıncı sayı");
        num2=scan.nextInt();
        if (num1>num2){
            System.out.println("birinci sayi buyuktur");
        } else if (num1<num2) {
            System.out.println("ikinci sayi buyuktur");
        }
//        Write a program a,b,c olmak uzere 3 int degişken declare
//        edelim sırasıyla değerler atayalım. a ve b değişkenin
//        toplamı c den fazla ise a ve b nin farkını c ye atasın
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if (a+b>c){
            c=b-a;
            System.out.println("c= "+ c);
        }

        // • Bir sayı declare edin ve bir değer initialize yapın sayı tek mi çift mi console yazdırın.
        System.out.print("----->lutfen sayi giriniz: ");
        int num= scan.nextInt();
        if (num%2==0){
            System.out.println("sayi cift");
        }else {
            System.out.println("sayi tek");
        }


        System.out.println("----->lutfen sayi giriniz: ");

        System.out.println("birinci sayiyi giriniz: ");
       // int num = scan.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        //int num1 = scan.nextInt();
        System.out.print("ucuncu sayiyi giriniz: ");
        //int num2 = scan.nextInt();

        if (num + num1 + num2 == 180) {
            if (num == 90 || num2 == 90 || num2 == 90) {
                System.out.println("Dik ucgendir.");
            } else {
                System.out.println("Bu bir ucgendir.");
            }
        }else{
            System.out.println("BU BIR UCGEN OLAMAZ");
            System.out.println("Cunku ic acilari toplami "+(num+num1+num2)+ " olan bir " + "geometrik sekil ucgen olamaz.");
        }

        System.out.print("-----LUTFEN DERS NOTUNUZU GIRINIZ:  ");
        int dersNotu=scan.nextInt();
        if (dersNotu>=85 && dersNotu==100){
            System.out.println("DERS HARF NOTUNUZ: AA");
        } else if (dersNotu>=70 && dersNotu<=84) {
            System.out.println("DERS HARF NOTUNUZ: BB");
            
        } else if (dersNotu>=55 && dersNotu<=69) {
            System.out.println("DERS HARF NOTUNUZ: CC");

        } else if (dersNotu>=40 && dersNotu<=54) {
            System.out.println("DERS HARF NOTUNUZ: DD");

        }else if (dersNotu<=39){
            System.out.println("DERS HARF NOTUNUZ: FF");
        }else {
            System.out.println("YAZDIGINIZ NOT GECERSIZDIR. KONTROL EDIP TEKRAR GIRINIZ.");
        }


        System.out.println("----->lutfen sayi giriniz:<-----");

        System.out.print("Birinci sayiyi giriniz: ");
        int number = scan.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int number1 = scan.nextInt();
        System.out.print("Ucuncu sayiyi giriniz: ");
        int number2 = scan.nextInt();

        if (number>number2 && number>number1){

            System.out.println("EN BUYUK NUMBER: "+ number);
        } else if (number1>number2 && number1>number) {
            System.out.println("EN BUYUK NUMBER: "+ number1);
        }else if (number2>number && number2> number1){
            System.out.println("EN BUYUK NUMBER: "+ number2);
        }else if (number==number1 && number1==number2){
            System.out.println("SAYILAR ESIT ");
        }else {
            System.out.println("SAYI GECERSIZDIR.");
        }

        System.out.println("----->lutfen sayi giriniz:<-----");

        System.out.print("Sayiyi giriniz: ");
        //int number = scan.nextInt();
        if (number>5 & number<=24){
            System.out.println("SAYI 5 DEN BUYUKTUR.");
        } else if (number>25 && number<=49) {
            System.out.println("SAYI 5 VE 25 DEN BUYUKTUR.");
        } else if (number>50) {
            System.out.println("SAYI 5 , 25 VE 50 DEN BUYUKTUR.");
        }else {
            System.out.println("");
        }

        System.out.println("----->lutfen sayi giriniz:<-----");

        System.out.print("Sayiyi giriniz: ");
        //int number = scan.nextInt();
        if (number > 5) {
            System.out.println("sayi 5 den buyuktur. ");
            if (number > 25) {
                System.out.println("sayi 25 dem buyuktur.");
                if (number > 50) {
                    System.out.println("sayi 50 den de buyuktur.");

                } else {
                    System.out.println("sayi 50 den kucuk");
                }
            } else {
                System.out.println("sayi 25 den kucuk");
            }
        } else {
            System.out.println("sayi 5 den kucuk");
        }








    }

}



