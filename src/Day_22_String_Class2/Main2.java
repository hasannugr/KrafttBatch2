package Day_22_String_Class2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//       otuzKez("galatasaray","gs");
//       giveMeWord("Galatasaray");
//       giveMeWord("gal");
//       System.out.println(kelime("kafka"));
//        System.out.println(adSoyad());
//        System.out.println(dize("araba"));
        System.out.println(work13("hasan"));


    }
//    Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
//    defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız


    public static String otuzKez(String str, String str1) {
        if (str.length() > str1.length()) {
            System.out.print(str1 + str1);
            for (int i = 0; i < 30; i++) {
                System.out.print(str);
            }
            System.out.println(str1 + str1);
        } else if (str1.length() > str.length()) {
            System.out.print(str + str);
            for (int i = 0; i < 30; i++) {
                System.out.print(str1);
            }
            System.out.print(str + str);
        }
        return "";

    }
//    Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
//    altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.

    public static String giveMeWord(String str) {
        if (str.length() >= 5) {
            return str.substring(0, 5);
        } else {
            String result = "";
            for (int i = 0; i < 5 - str.length(); i++) {

                result += ".";
            }
            return str + result;
        }


    }

//    Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
//    almıyorsa false yazdırın

    public static boolean kelime(String str) {
        return str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

//    Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
//    Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.

    public static String adSoyad() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adıinizi giriniz: ");
        String ad = scan.nextLine();
        System.out.println("lutfen soyadinizi giriniz: ");
        String soyad = scan.nextLine();
        String a = ad.trim();
        String b = soyad.trim();
        String sonuc = "\"" + a.concat(" " + b) + "\"";
        String sonuc1 = "\"soy isminiz " + b + "dir\"";
        return sonuc + "\n" + sonuc1;


    }

//    Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
//    çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)

    public static String dize(String str) {
        String result = "";
        while (!str.isEmpty()) {
            result += str.charAt(0);
            str = str.replace(str.substring(0, 1), "");
        }
        return result;
    }

//    Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
//    olarak return eden methot yazınız.

    public static String work13(String str) {
        str = str.replace(" ", "");
        String result = "";
        while (!str.isEmpty()) {
            if (str.substring(1).contains(str.substring(0, 1))) {
                result += str.substring(0, 1);
            }
            str = str.replace(str.substring(0, 1), "");
        }
        return result;
    }


}





