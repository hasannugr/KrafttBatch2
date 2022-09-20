package Day_7_AllOperators;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
//                                            UNARY İŞELEMLER
        /*  int a=5,b=6;
        int max=(a<=b)? b:a;
        System.out.println(max);*/
//        int a=4;

//        System.out.println(a++);     //4
//        System.out.println(a++);     //5
//
//        System.out.println(++a);       //5
//        System.out.println(a++);       //5
//        System.out.println(a);         //6
//
//        System.out.println(a--);    //4 yazdırdı a=3 oldu.
//        System.out.println(--a);    //2

        //int a=4;

        //a++ a= a+1;
        //++a a=6;

//        boolean sonuc=!(a==4);
//        System.out.println(!sonuc);

//        int i=5,j;
//        j=i++;
//        System.out.println(j);

//        int ornek=5;
//        ornek=ornek++ + --ornek + ++ornek - ornek--;
//              5     +    5   +   6    - 6
//        System.out.println(ornek);

//        double d=1;
//        double j=d++ + --d / ++d * d--;
//        System.out.println(j);

//                                        BİNARY İŞEMLER

      /*  int sayi=20;
        sayi+=5;
        System.out.println(sayi);

        sayi-=10;
        System.out.println(sayi);

        sayi*=2;
        System.out.println(sayi);

        sayi/=3;
        System.out.println(sayi);

        sayi%=3;
        System.out.println(sayi);

        Scanner scan=new Scanner(System.in);
        System.out.print("LUTFEN BIR SAYI GIRINIZ =");
        int sayı=scan.nextInt();
        //int tutulanSayı=(sayı*2+10)/2-sayı;
        int tutulanSayı=sayı;
        System.out.println(tutulanSayı);
        sayı*=2;
        sayı+=10;
        sayı/=2;
        System.out.println(tutulanSayı);*/

        //                     İLİŞKİSEL OPERATORLER/TUNARY

//        boolean a=(5<=6);
//        System.out.println(a);                    //string ifadelerde == ifadesi kullanılmaz.

//     Scanner scan=new Scanner(System.in);
//        System.out.print("LUTFEN SAYI GIRINIZ : ");
//     int sayı1= scan.nextInt();
//        System.out.print("LUTFEN IKINCI SAYI GIRINIZ : ");
//     int sayı2= scan.nextInt();
//     boolean sayılar =sayı1==sayı2;
//        System.out.println(sayılar);


//        Scanner scan=new Scanner(System.in);
//        System.out.print("LUTFEN SAYI GIRINIZ : ");
//        int sayı1= scan.nextInt();
//        System.out.print("LUTFEN IKINCI SAYI GIRINIZ : ");
//        int sayı2= scan.nextInt();
//        boolean sayılar =sayı1>=sayı2;
//        System.out.println(sayılar);
//        int max=(sayı1>=sayı2)? sayı1:sayı2;
//        System.out.println(max);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("FIZIK NOTUNUZU GIRINIZ: ");
//        double fizik = 92;
//        System.out.println("KIMYA NOTUNUZU GIRINIZ: ");
//        double kimya = 55;
//        System.out.println("MATEMATIK NOTUNZU GIRINIZ: ");
//        double matematik = 89;
//        double ortalama = (fizik + matematik + kimya) / 3;
//        System.out.println(ortalama);
//        boolean gecmeNotu = (ortalama >= 80);
//        boolean gecmeNotu2 = (ortalama > 80);
//        boolean gecmeNotu3 = (ortalama == 80);
//        boolean gecmeNotu4 = !(ortalama != 80);
//        System.out.println(gecmeNotu);
//        System.out.println(gecmeNotu2);
//        System.out.println(gecmeNotu3);
//       System.out.println(gecmeNotu4);

        Scanner scan=new Scanner(System.in);
        String a="hasan";
        System.out.println("LUTFEN ADINIIZI GIRINIZ: ");
        String b=scan.nextLine();
        boolean sonuc=b.equals(a);       //== kullanırsak false verir string kullanımda equals kullanılmalıdır.
        System.out.println(sonuc);





    }
}
