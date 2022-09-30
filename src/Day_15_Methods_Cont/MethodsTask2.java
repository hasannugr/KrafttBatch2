package Day_15_Methods_Cont;

import java.util.Scanner;

public class MethodsTask2 {

        /*
        Düğün kartı bastıran bir program yazın.
        Kullanıcıdan 2 adet kelime isteyen bir metodunuz olsun. Bu metot
        kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun. Eğer
        kullanıcı cümleleri yanlışlıkla aynı girerse. Başka bir metot çağrılsın ve
        kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
        istesin. Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
        bağlayıp(concat) önünü ve arkasını yıldızlarla süsleyip versin.
         */
        public static void main(String[] args) {
            startProcess("Dügün kartınız için gelin ve damadın ismini girin lütfe");
        }

        public static void startProcess(String message) {
            Scanner sc = new Scanner(System.in);
            System.out.println(message);
            String name1 = sc.nextLine();
            String name2 = sc.nextLine();
            if (name1.equals(name2)) {
                goingProcess();
            } else {
                goingProcess(name1, name2);
            }
        }

        public static void goingProcess() {
            String message = "Girmiş oldugunuz isimler aynı lütfen farlı isimler giriniz";
            startProcess(message);
        }

        public static void goingProcess(String str1, String str2) {
            System.out.println("---------------------");
            System.out.println("  ***" + str1 + " & " + str2 + "***");
            System.out.println("Eylülde güzel bir günde ");
            System.out.println("Mutluluğumuza davetlisiniz");
            System.out.println("       ********");
            System.out.println("---------------------");

        }
    }

