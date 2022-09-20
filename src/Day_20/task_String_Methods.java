package Day_20;

import java.util.Scanner;

public class task_String_Methods {
    public static void main(String[] args) {

//        System.out.println(countY("javayi seviyor muyum?"));
//        System.out.println(sesliHarf("wesley sneıjder "));
//task();
//        ucKere("HASAN HUSEYIN UGUR");
//name("hasan huseyin ugur");
//        System.out.println(nameLast("hasan", "ugur"));
//task();

        nameFirst("hasan", "huseyin");
    }

    //    "javayı Seviyor muyum?" ifadesindeki y harfinin sayısını veren bir program yazın.
    public static int countY(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
                count++;

            }
        }
        return count;

    }

//    Aldığınız mesajın sesli harflerini a,e,i formatında konsola yazdırın.

    public static String sesliHarf(String str1) {
        String holder = "";
        for (int i = 0; i < str1.length(); i++) {
            switch (str1.charAt(i)) {
                case 'a', 'e', 'i', 'ü':
                    holder += str1.charAt(i);
                    break;
                default:
            }

        }
        return holder;


    }

    //    Kullanıcıdan çocuk bayramı ile ilgili bir cümle söylemesini
//    isteyin cümle içinde sev köküne sahip bir kelime var ise bir
//    method what a lovely person(ne hoş bir insan) mesajı
//    döndürsün.
    public static void task() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cocuk bayrami ile ilgili soz yaziniz: ");
        String soz = scan.nextLine();
        if (soz.contains("sev")) {
            System.out.println("what a lovely person");
        }


    }

    //    İsminizin son 3 harfini 3 kez yazdıran bir method oluşturun.
    public static void lastThree(String str) {
        for (int i = 0; i < 3; i++) {
            System.out.println(str.substring(str.length() - 3));

        }
    }

    //    1-İsminizin ortadaki 3 harfini veren bir method yazın.
    public static void name(String str) {
        int sayı = (str.length() / 2);
        System.out.println(" ortadaki harfler :" + str.substring(sayı, sayı + 3));

    }
//    2-İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna
//    kısaltın yani fazla karakterleri atın. Ve isminizle soy adınızı birleştirin.

    public static String nameLast(String str, String str1) {
        if (str.length() > str1.length()) {
            return str.substring(0, str1.length()).concat(str1);


        } else if (str1.length() > str.length()) {
            return str1.substring(0, str.length()).concat(str);


        } else {
            return str.concat(str1);

        }

    }
//4-İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname oluşturan bir method yazın.

    public static void nameFirst(String str1, String str2) {
        String empty = "";
        char birincininİlkHarfi = str1.charAt(0);
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != birincininİlkHarfi) {
                empty += str2.charAt(i);
            }
        }
        System.out.println(empty);
    }


}


