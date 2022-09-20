package Day_9_İf_Elseif_Else;
import java.util.Scanner;
public class OdevCalısması {
    public static void main(String[] args) {

//        • Konsoldan sayı alarak bir sayı tahmin programı
//        yazın. Nested if yapısı kullanın. Tahmin sayıdan
//        küçük ama yakınsa(sayının yarı değerinden daha yakın) veya
//        çok küçükse uygun bir mesaj versin. Tahmin sayıdan
//        büyük, ancak yakın veya uzak ise buna uygun
//        mesajlar versin. Elbette isabetli tahmin de bir tebrik
//        mesajı yazdırın.(ev ödevi)


        Scanner scan=new Scanner(System.in);
        System.out.println("----->lutfen  tahmin sayisi giriniz:<-----");
        int gercekSayı=50;
        System.out.print("Tahmin edilen sayiyi giriniz: ");
        int tahminSayısı = scan.nextInt();
        if (tahminSayısı<gercekSayı){
            if (tahminSayısı>gercekSayı/2){
                System.out.println("yaklastin biraz daha buyuk sayi giriniz");
            } else if (tahminSayısı<gercekSayı/2) {
                System.out.println("yakin ddegilsiniz daha buyuk sayi giriniz");

            }else {
                System.out.println("pek yakin sayilmazsin");
            }


        } else if (tahminSayısı>gercekSayı) {
            if (tahminSayısı<gercekSayı+gercekSayı/2){
                System.out.println("Tatmininiz yakın ancak daha kucuk bir sayi soylemelisiniz");
        }else if (tahminSayısı>gercekSayı+gercekSayı/2){
                System.out.println("cok buyuk bir sayi soyledin daha kucuk bir tahminde bulunuzu");
            }else {
                System.out.println("pek yakin degilsin biraz daha kucuk sayi giriniz");
        }


    }else {
            System.out.println("tahmininiz dogrudur.");
        }
}
}
