package Day_6_Operators;

import java.util.Scanner;

public class ScannerCalısma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime yaziniz: ");
        String text=scan.nextLine();
        System.out.println("girilen kelime: "+ text);

        System.out.println("lutfen bir sayi yaziniz: ");
        int sayı=scan.nextInt();
        System.out.println("girilen sayi:"+sayı);

        System.out.println("lutfen bir double sayı yaziniz: ");
        double doubleSayı=scan.nextDouble();
        System.out.println("girilen sayi:"+doubleSayı);


        Scanner scanner=new Scanner(System.in);
        System.out.print("isminiz:   ");
        String ad= scan.nextLine();
        System.out.print("dogum yiliniz:  ");
        int yil=scan.nextInt();
        System.out.println(ad+"bey/bayan "+(2022-yil)+ " yasindasiniz.");

/*
         Scanner scan=new Scanner(System.in);
        System.out.print("fizik: ");
        int fiz= scan.nextInt();
        System.out.print("kimya: ");
        int kim=scan.nextInt();
        System.out.print("matematik: ");
        double mat= scan.nextDouble();

        double ort=(mat+kim+fiz)/3;
        System.out.println("ortalama "+ ort);

        Scanner scan=new Scanner(System.in);
        System.out.print("LUTFEN BIR SAYI GIRINIZ =");
        int sayı=scan.nextInt();
        int tutulanSayı=(sayı*2+10)/2-sayı;
        System.out.println(tutulanSayı);*/



    }
}
