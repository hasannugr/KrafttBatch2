package Day_19_StringClass;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
//                                     LENGTH METODU
//   Boşluklar dahil 2 çift tırnak arasındaki karakter sayısını verir. Eğer empty bir string ise değer 0 dır.
//        Length boşluklarıda karakter olarak sayar.
        String str = "Galatasaray";
//        System.out.println(str.length());
//        değişkene atayıp da consola yazdırabiliriz.
        int i = str.length();
        System.out.println(i);


        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
//   toLowerCase() →String değerde büyük küçük harf ayrımı yapmadan tüm string i küçük harfli hale dönüştürür.
//   toUpperCase() →String değerde büyük küçük harf ayrımı yapmadan tüm string i büyük harfli hale dönüştürür.


        String str3 = "IMPARATOR FATIH TERIM";
        System.out.println("str3.toUpperCase() = " + str3.toUpperCase());
        System.out.println("str3.toLowerCase(Locale.ROOT) = " + str3.toLowerCase(Locale.ROOT));
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
//                                      CHATAT METODU
//        Girilen index numarasındaki char değeri döndürür. İndex 0 dan başlar.
//        Örnekteki string de ilk karekter ‘j’ dir ve index numarası 0 dır.
//        Dolayısıyla son karakter de length()-1 olacaktır.

        System.out.println("str.charAt() = " + str.charAt(10));
//        GALATASARAY STRİNGİNİN SON KARAKTERİ 11 LAKİN CHAR AT MERHODUNDA -1 YAPARAK SON KARAKTERİ BULURUZ.
        String str4 = "Dfile.encoding=UTF-8 -classpath C:UsersCasperKraftBatch2KrafttBatch2out";
        System.out.println("str4.length() = " + str4.length());

        System.out.println("str4.charAt(str4.length()-1) = " + str4.charAt(str4.length() - 1));
        System.out.println("str4.charAt() = " + str4.charAt(70));

        char ch = str4.charAt(0);
        System.out.println(ch);  // değişkene atayarakta consola yazdırabilirz.
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
//                                           CONCAT METODU
//        İlk string e concat() ile çağrılan ikinci string i ekler. Ve 2 stringin birleşmiş halini döndürü

        String str5 = "e biz bosuna mi burdayiz ";
        String str6 = "baba yigit";
        System.out.println("str5.concat(str6) = " + str5.concat(str6));
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
//                                         CONTAİNS METODU
//        Bir string değer içinde başka bir string değeri aratırken
//        kullanabileceğimiz bir method dur. Boolean değer döndürür. Eğer
//        aratılan string değeri bulursa true bulamazsa false döndürür

        String str7 = "selam arkadaslar   ";
        String str8 = "seviyorum";
        String str9 = str7.concat(str8);                         // concat ile birleştirme yapıldı.
        System.out.println(str9.contains("seviyorum"));        // contains ile icinde var olup olmadıgını  aradık.
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
//                                     TRİM MEDODU
//        String değerin önündeki ve arkasındaki boşlukları alır. Ve stringin yeni halini
//        döndürür. Dikkat edin! String in önünde ve arkasında bir boşluk varsa length
//        kısalacaktır. Ancak string değerin ilk ve son karekteri arasındaki boşlukları almaz.
        System.out.println("str8.trim() = " + str7.trim());
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
//                                      RAPLECE METODU
//        Bir string değerdeki char değeri yada bir substring i değiştirir. Dönen
//        string değişimden sonraki yeni string dir.

        System.out.println(str7.replace("selam", "merhaba"));
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
//                                         İNDEXOF METODU
//        Bir string değer içinde başka bir string değerin ilk karakterinin index
//        numarasını döndürür. Döndürülen değer int tipindedir. Eğer bulamazsa -1 döndürür.

        System.out.println(str7.indexOf("arkadaslar"));


        //String str1=new String("java");     new keyword ile üretilen sitring objesi.
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");


    }


}
