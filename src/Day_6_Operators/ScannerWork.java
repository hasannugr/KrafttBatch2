package Day_6_Operators;
import java.util.Scanner;
public class ScannerWork {
    public static void main(String[] args) {
      /*  Scanner scan=new Scanner(System.in);
       final double pI=3.14;
        System.out.print("Yari cap:   ");
        double yarıcap=scan.nextDouble();
        System.out.println("Dairenin alani2: "+pI*(yarıcap*2));
        System.out.println("Dairenin ccevreni: "+ (2*pI*yarıcap));

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Fahrenheit degerinde sicaklik giriniz: ");
        double fahrenheit=scan.nextDouble();
        System.out.println("Calsius : "+(fahrenheit-32)/1.8);*/


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen istenilen rakamlari giriniz: ");
        System.out.print("Her sirada olan toplam koltuk: ");
        int koltuk =scan.nextInt();

        System.out.print("Toplam sira sayisi: ");
        int sıra= scan.nextInt();

        System.out.print("Toplam katilimci sayisi: ");
        int katılımcı=scan.nextInt();

        System.out.println("Toplam kapesite = "+ (koltuk*sıra));

        System.out.println("Bos koltuk = " + ((koltuk*sıra)-katılımcı));
        int oturulanSıra=(katılımcı/koltuk);

        System.out.println("Oturulan sira= "+(katılımcı/koltuk));
        System.out.println("Bos olan sira sayisi="+(sıra-oturulanSıra));
        System.out.println("Oturulan siralardaki bos koltuk ="+ (sıra-(katılımcı%koltuk)));


        /*Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen saniye giriniz:");
        int girilenSaniye= scan.nextInt();
        int saat= girilenSaniye/3600;
        int dakika=saat%3600/60;
        int saniye=girilenSaniye%60;
        System.out.println(saat  +"saat "+  dakika + "dakika "+  saniye +"saniye");

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sampiyonluk sayisi giriniz: ");
        int sampiyonluk=scan.nextInt();
        int yıldızSayısı=sampiyonluk/5;
        System.out.println("yildiz sayisi="+yıldızSayısı);*/












    }
}
