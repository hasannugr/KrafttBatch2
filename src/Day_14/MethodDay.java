package Day_14;

import java.util.Scanner;

public class MethodDay {
    public static void main(String[] args) {
        sum(5,4);
        System.out.println(sum(5,4));
        int sonuc=sum(5,4);
        int yeriSonuc= sonuc+1;
        System.out.println("sonuc= "+ sonuc);
        System.out.println(yeriSonuc);


    }
    public static void avarage(){
        Scanner scan=new Scanner(System.in);
        System.out.println("ortalama icin sayi giriniz: ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();
        int toplam=(sayi1+sayi2+sayi3)/3;
        System.out.println("ortalamaniz: "+ toplam);
    }
    public static void buyukSayi(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayi giriniz: ");
        int sayii1=scan.nextInt();
        int sayii2=scan.nextInt();
        if (sayii1>sayii2){                 // sonuc= sayii1>sayii2 ? sayii1 : sayii2; şeklinde yazılabilir if else kullanmadan.
                                            // sayii 1 > sayii2 ikiden sayii1 i yazdır değilse sayii2 yi yaz anlamında kullanılıyot.
            System.out.println("buyuk olan sayı " +sayii1);
        }else {
            System.out.println("buyuk olan sayı "+ sayii2);
        }


    }
    public static void weight(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilo giriniz: ");
        double kilo=scan.nextInt();
        double okka=1.282;
        double kiloCinsi=kilo/okka;


        System.out.println(kiloCinsi);
    }
    public static void message4(int num){
        System.out.println(num+ " burada");
        System.out.println(num + 3);


    }
    public static void message5(String str, int i ){
        System.out.println("Ayin " + i + " i "+ " persembe dir.");
    }
    public static void year(int born){

        int yil=2022-born;
        System.out.println(yil);

    }
    public static void kuvvet(int num1, int num2){
       double pow= Math.pow(num1,num2);
        System.out.println((int)pow);
    }
    public static void sumOf(int a, int b){
        System.out.println(a + "+" + b + "=" + (a + b));

    }
    public static void hesap(int a, int b, String str){
        if (str.equals("+")){
            System.out.println(a+b);
        }else if (str.equals("-")){
            System.out.println(a-b);
        }else if (str.equals("*")){
            System.out.println(a*b);
        }else if (str.equals("/")){
            System.out.println(a/b);
        }else {
            System.out.println("operator tanimlanmiyor.");
        }

    }
    public static int sum(int a, int b){
//        int toplam;                      bunların yerine return kullandık.
//        toplam=a+b;
        return a+b;
    }




}

