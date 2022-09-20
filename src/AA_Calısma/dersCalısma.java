package AA_Calısma;

import java.util.Scanner;

public class dersCalısma {
    public static void main(String[] args) {


        String kitap1 = " ";
        String kitap2 = " ";
        String kitap3 = " ";

        // kodu buraya yazın
        Scanner scan = new Scanner(System.in);
        String sc = scan.nextLine();
        System.out.println("kitap1 in ismini ve fiyatını girin:");
        kitap1 = scan.nextLine();
        double fiyat1 = scan.nextDouble();

        Scanner scan1 = new Scanner(System.in);
        String sc1 = scan.nextLine();
        System.out.println("kitap2 in ismini ve fiyatını girin:");
        kitap2 = scan.nextLine();
        double fiyat2 = scan.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        String sc2 = scan.nextLine();

        System.out.println("kitap3 in ismini ve fiyatını girin:");
        kitap3 = scan.nextLine();
        double fiyat3 = scan.nextDouble();

        double toplamFiyat = fiyat1 + fiyat2 + fiyat3;

        System.out.println(kitap1 + "in fiyatı: " + fiyat1);
        System.out.println(kitap2 + "in fiyatı: " + fiyat2);
        System.out.println(kitap3 + "in fiyatı: " + fiyat3);
        System.out.println("toplam fiyat= " + toplamFiyat);


    }
}
