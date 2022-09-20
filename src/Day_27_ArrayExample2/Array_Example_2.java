package Day_27_ArrayExample2;

import Day_26_Arrays_Lab.ArrayExample;

import java.util.Locale;

public class Array_Example_2 {
    // Array içerisindeki en büyük 2. sayıyı bulun. (Array.sort kullanılmayacak)
    public static int enBuyukIkinciSayi(int[] arr) {
        int a = arr[0];
        int b = arr[0];
        for (int sayi : arr) {
            if (sayi > a) a = sayi;
        }
        for (int sayi : arr) {
            if (sayi > b && sayi != a)
                b = sayi;
        }
        return b;
    }

//Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
//[2,3,3,4,5,6,5,6,3]  true
//
//[2,4,5,8,8]  false
//
//[1,2,3]  true
//
//[1,2]  false

//0 1 2  3  4 5
//1 5 4 44 45 46


    public static boolean ardArdaUc(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                return true;
            }
        }
        return false;
    }

    //Array’in içerindeki eşi olmayan yalnız sayıları bulan ve
    // bunları ekrana yazdıran metodu yazınız.
    // (sağında veya solunda aynı sayı yoksa yalnızdır.) (return array)
//[2,3,3,4,5,6,5,6,3]  2,4,5,6,3
//[2,2,5,8,8] 5
//[2,2,3]  3
//[1,2]  1,2


    public static String[] yalnizSayilar(int[] arr) {

        String yalnızSayilar = "";
        if (arr.length == 1) {
            yalnızSayilar += arr[0] + " ";
            return yalnızSayilar.split(" ");
        }

        if (arr[0] != arr[1]) yalnızSayilar += arr[0] + " ";

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                yalnızSayilar += arr[i] + " ";
        }

        if (arr[arr.length - 1] != arr[arr.length - 2])
            yalnızSayilar += arr[arr.length - 1] + " ";


        return yalnızSayilar.split(" ");


    }
//Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız.
// (eşitlik durumda herhangi birini alabilir,1 den  bulunmuyorsa -1 döndürecek)
//[2,3,3,3,6,6,5,6,3]  3
//
//[2,4,5,8,8]  8
//
//[2,4,5,8]  -1


    public static int enCokSayi(int[] arr) {
        int enCok = -1;
        int count;
        int adet = 1;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > adet) {
                enCok = arr[i];
                adet = count;
            }
        }
        return enCok;

    }

//Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız
    //[1,2,8,1]   true
    //[25,89,78,98]   false

    public static boolean dublicateControl(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    //«Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu.
    //     Filin yemek dolu karnı horlarken bir aşağı bir yukarı gidiyordu.
    //     Filin horlama sesini duyan fare yuvasından çıkıp sesin olduğu tarafa gitti,
    //     filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
    //     üzerine oturdu, salıncak gibi bir o yana bir bu yana
    //     sallanırken eğleniyordu.» kelimesinde kaç adet o harfi vardır. (Büyük ve küçük ihmal edilecek)

    public static int findCountLetter(String str, String harf) {
        str = str.toLowerCase();
        String[] arr = str.split("");
        int count = 0;
        for (String harf_1 : arr) {
            if (harf_1.equals(harf)) {
                count++;
            }
        }
        return count;
    }

    public static int findCountLetter_2(String str, String harf) {
        return str.toLowerCase().split(harf).length - 1;
    }

    public static int findCountLetter_3(String str, String harf) {
        return str.toLowerCase().length() - str.toLowerCase().replace("o", "").length();
    }

//Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu yazınız.
// araba ile yola çıktık fakat araba arıza yaptı     true
// araba ile yola çıktık fakat arıza yaptı      false


    public static boolean dublicateControlString(String str) {
        str = str.replace(",", "").replace(";", "").replace(".", "").replace("'", "");

        String[] strArray = str.toLowerCase().split(" ");


        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                if (i != j && strArray[i].equals(strArray[j])) {
                    return true;
                }
            }
        }
        return false;

    }
//Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine
// bu sayıyı atayan diğer indekslere 0 atayan metodu yazınız.
    //   [5,7,1,9]  [1,0,0,0]

    public static int[] enKucukSayiVeSifirAta(int[] arr) {
        int enKucukSayi = arr[0];
        for (int sayi : arr) {
            if (sayi < enKucukSayi) {
                enKucukSayi = sayi;
            }
        }
        int[] yeniArray = new int[arr.length];
        yeniArray[0] = enKucukSayi;
        for (int i = 1; i < yeniArray.length; i++) {
            yeniArray[i] = 0;
        }
        return yeniArray;

    }

    //Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız

    public static int[] degerAtamaKontrol(int[] arr, int ilkDeger, int kontroldegeri, int atanacakSayi) {
        int[] yeniArray = new int[arr.length];

        yeniArray[0] = arr[0];

        for (int i = 0; i < yeniArray.length - 1; i++) {
            if (arr[i] == ilkDeger && arr[i + 1] == kontroldegeri) {
                yeniArray[i + 1] = atanacakSayi;
            } else {
                yeniArray[i + 1] = arr[i + 1];
            }
        }
        return yeniArray;
    }

    public static void main(String[] args) {
        int[] sayilar = {5, 8, 45, 34, 21, 1, -6, -8};

        ArrayExample.arrayYazdir(degerAtamaKontrol(sayilar, 45, 34, 0));

    }

}
