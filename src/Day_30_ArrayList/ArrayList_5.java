package Day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_5 {
//    copy    -- başka bir array listen kopyalama yapar. parametre bölümüne değişken adını yazıyoruz.
//    contains() -- listenin içerisinde varsa true döndürür var mı yok mu kontrolü yapar.
//    containsAll -- iki listin aynı olup olmadığını kontrol eder.
    public static void main(String[] args) {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");


        ArrayList <String> allDays = new ArrayList<>(weekDays);
        System.out.println("allDays.get(0) = " + allDays.get(0));

        allDays.add("Saturday");
        allDays.add("Sunday");
        System.out.println("allDays = " + allDays);

        ArrayList<String> alterDay = allDays;   // direk yeni arrayliste başka bir arraylisti tanımladık.
        alterDay.set(0,"Pazartesi");            // new keyword yok direk aynı referanslara bağlandı. yeni bir şey oluşturmadı.
        System.out.println("allDays.get(0) = " + allDays.get(0));




        System.out.println("allDays.contains(\"Tuesday\") = " + allDays.contains("Tuesday"));
        System.out.println("allDays.indexOf(\"Tuesday\") = " + allDays.indexOf("Tuesday"));
        System.out.println("allDays.get(2)==\"Tuesday\" = " + allDays.get(2) == "Tuesday");  // index numarası doğru değil false
        System.out.println("allDays.get(1).equals(\"Tuesday\") = " + allDays.get(1).equals("Tuesday"));  // String içerigin kontrolü doğru true.

        System.out.println("allDays.containsAll(weekDays) = " + allDays.containsAll(weekDays));
        System.out.println("weekDays.containsAll(allDays) = " + weekDays.containsAll(allDays));


    }
}
