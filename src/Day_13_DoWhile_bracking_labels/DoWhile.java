package Day_13_DoWhile_bracking_labels;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
      /*  int i=1;
        do {
            System.out.println(i+ " nci islem");
            i++;
        }while (i<6);
        System.out.println(i);

//        Örnek: Kullanıcıdan devamlı sayı isteyen ve bu sayıları toplayan
//        programı yazınız. Kullanıcı 0 girdiğinde programdan çıkması
//        sağlanmalıdır.

        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("toplam 0 olunca programdan vcikilacaktir");

            System.out.println("LUTFEN 1.SAYI GIRINIZ: ");
            int a = scan.nextInt();
            System.out.println("LUTFEN 2.SAYI GIRINIZ: ");
            int b = scan.nextInt();
            System.out.println("toplam="+ (a+b));
            if(a+b==0){
                break;
            }

        }while (true);*/

//        Ödev: Random sınıfını kullanarak bilgisayarınızdan 0 ile 50 arasında
//        random bir sayı almasını sağlayın ve bu sayıyı 5 defa deneme
//        yaparak bulmaya çalışın. Bu esnada bilgisayar aşağı yukarı şeklinde
//        size ipucu versin.
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        int i= random.nextInt(50);
        System.out.println(i);
        System.out.println("sayiyi bul bakam sadic");
        int j=1;
        do {
            System.out.println(j+" Tahmin: ");
            int tahmin=scan.nextInt();
            if (tahmin==i){
                System.out.println("Tebrikler sayiyi buldunnn");
                break;
            }else if (tahmin>i){
                System.out.println("Assagi tahminn yapp");
            }else {
                System.out.println("Yukari tahmin yapp");
            }
            j++;
        }while (j<6);
        System.out.println("tuttugum sayi"+i);

















    }
}
