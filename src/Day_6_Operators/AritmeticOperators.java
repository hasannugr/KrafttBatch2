package Day_6_Operators;

import java.util.Scanner;

public class AritmeticOperators {
        public static void main(String[] args) {

                int x=5,y=8,z;
                z=x%y;
                System.out.println(z);

                double sayı=3+5/2 *4 %(12-9);
                System.out.println(sayı);
                System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");

                int doğumyılı=1990;
                System.out.println("Alinin yasi:"+ (2022-doğumyılı));
                System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
                int aliYs=2022-1990;
                System.out.println("yas= "+ aliYs);
                int ahmetYas=aliYs-5;
                System.out.println("ahmet yas = "+ahmetYas);

                System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
                final double PI=3.14;
                double r=2;
                double alan=PI*r*r;
                double cevre=2*PI*r;
                System.out.println("alan= "+ 3.14*(2*2));
                System.out.println("cevre="+ 2*3.14*2);
                System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");

                double fahrenheit=300;
                double celsius =(300-32)/1.8;
                System.out.println("celsius =" + celsius);
                System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");


                double fizik =92;
                double kimya=55;
                double mat=89;
                double ortalama=(fizik+kimya+mat)/3;
                System.out.println(ortalama);
                int gecmenotu=80;
                boolean sonuc= ortalama>80;
                System.out.println(sonuc);


                System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
                int sıra=15;
                int koltuk=12;
                int misafir=113;
                int kapesite= sıra*koltuk;
                System.out.println(" Toplam kapesite: "+sıra*koltuk);

                System.out.println(" Bos koltuk: " +(kapesite-misafir));

                int toplamOturulanSıra=(113/12)+1;

                System.out.println(" toplam "+ toplamOturulanSıra+" sirada oturulmaktadir.");

                System.out.println((15-toplamOturulanSıra)+ "sira tamamen bostur.");

                System.out.println(12-(113%12)+ " siradaki bos koltuk");

                System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");


                int saat=31502/3600;
                System.out.println("saat="+saat);
                int dakika= (31502-saat*3600)/60;
                System.out.println("dakika="+ dakika);
                int saniye=31502-(saat*3600)-dakika*60;
                System.out.println("saniye: "+ saniye);

                // 2.çözüm
               /*  int toplamSaniye;
                 toplamSaniye=31502;
                 int saat=toplamSaniye/3600;
                 int dakika=toplamSaniye%3600/60;
                 int saniye=toplamSaniye%60;
                System.out.println(saat+"vsaat "+ dakika+ "dakika "+ saniye+"vsaniye");*/




        }

}
