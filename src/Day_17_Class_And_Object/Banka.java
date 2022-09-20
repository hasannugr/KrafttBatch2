package Day_17_Class_And_Object;

import java.util.Random;
import java.util.Scanner;

public class Banka {
    int hesapNo;
    String musteriAdSoyad;
    double paraMiktari;
    boolean mobilBankacilik;

    public void hesapAC(){
        Scanner scan=new Scanner(System.in);
        System.out.println("isim: ");
        musteriAdSoyad= scan.nextLine();
        Random random=new Random();
        hesapNo=random.nextInt(100000);
        System.out.println(musteriAdSoyad+ " "+ hesapNo +" nolu hesabiniz "+ "basari ile olusturulmsutr");

    }
    public  void setMobilBankacilikOnay(){
        Scanner scan=new Scanner(System.in);
        System.out.println("mobil bankacilik kullanmak icin lutfen evet yaziniz: ");
        String onay=scan.next();
        if (onay.equals("evet")|| onay.equals("Evet") || onay.equals("EVET")){
            mobilBankacilik=true;
            System.out.println("sayin "+ musteriAdSoyad+" mobil bankacilik kullanabilirsiniz");
        }else {
            System.out.println("sayin "+ musteriAdSoyad+" mobil bankaciliga giris yapamazsiniz.");
        }

    }
    public void paraYatir(double para){
        paraMiktari+=para;
    }
    public void hesapOzeti(){
        System.out.println(musteriAdSoyad+" "+hesapNo+ " nolu hesabinizda "+paraMiktari+ " $ yatirilmistir.");
    }

}
