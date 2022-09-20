package Day_21_String_Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(firstThree("abc"));
//        System.out.println(boslukKaldır("merhaba nasilsin bilader hasan"));
//        System.out.println(ikinciYari("hasann"));
//       System.out.println(changeWord("merhaba", "a", "i"));
//        System.out.print(kelime("hasan"));
//        System.out.println(adet("HASAN", "A"));
//        System.out.println(backWord("hasan", "a"));
//        System.out.println(controlSentence("merhaba dunya", "mer"));


    }

    //    Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 harften az
//    ise inputu döndüren bir metot yazınız.
    public static String firstThree(String str) {
        if (str.length() < 3) {
            return str;
        } else {
            return str.substring(0, 3);
        }

    }

    //    Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
    public static String boslukKaldir(String str) {
        return str.replace(" ", "%");
    }
//    Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir progra yazdırın.

    public static String ikinciYari(String str) {

        return str.substring(str.length() / 2);
    }
//    Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
//alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu yazınız.

    public static String changeWord(String str, String old, String new1) {
        return str.replaceFirst(old, new1);
//        relaceFirst metodu ilk once stringi aldı daha sonra tanımlanan old harfini aradı ve
//        daha sonra o harfe new de atanan harfi atadı. eger sadece replace kuullanssaydık butun a lara i
//        olarak tanımlama yapardı.
    }

//    Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.

    public static String kelime(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(str.charAt(i));
            }
        }
        return result;
    }
//    Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
//    kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)

    public static int adet(String str, String str1) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase(str1)) {   // ıgnorcase kucukbuyuk harfi gozardı eder.
                count++;
            }
        }
        return count;
    }

    //    Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
//    kaldırılmış şekilde string döndüren programı yazınız.
    public static String backWord(String kelime, String harf) {
        return kelime.replace(harf, "");
    }

    //    Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
//    gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    public static boolean controlSentence(String kelime, String control) {
        if (kelime.substring(0, control.length()).equalsIgnoreCase(control) || kelime.substring(1, 1 + control.length()).equalsIgnoreCase(control)) {
            return true;
        }
        return false;
    }


}
