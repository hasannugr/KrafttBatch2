package Day_30_ArrayList;
import java.util.ArrayList;

public class ArrayList_ {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("FATIH");
        names.add("SULTAN");
        names.add("MEHMET");
        names.add("KANUNI");

        System.out.println("names.size() = " + names.size());
        System.out.println("names.toString() = " + names.toString());
        System.out.println("names = " + names);

        //  SET MEDODU İÇİNE İNDEX NUMRASIN GİREREK İLGİLİ İNDEXSİ DEĞİŞTİREBİLİYORUZ
        names.set(3,"YILDIRIM");
        System.out.println("names = " + names);

        // ADD METODU İNDEX NUMARASINI VEREREK ARRAYLİSTE EKLEME YAPAR.
        names.add(3,"KANUNI");
        System.out.println("names = " + names);

        // CLEAR METODUN İÇERİSİNİ KOMPLE TEMİZLER.
        names.clear();

        // isempty methodun boş olup olmadığını kontrol eder. boşşa true döndürür.
        System.out.println("names.isEmpty() = " + names.isEmpty());
        System.out.println("(names.size()==0) = " + (names.size() == 0)); // BU ŞEKİLDE DE KONTROL EDİLEBİLİR. SİZE ARRAYLİSTTE UZUNLUK ÖLCER.


    }

}