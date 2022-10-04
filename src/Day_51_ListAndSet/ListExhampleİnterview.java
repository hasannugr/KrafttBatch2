package Day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExhampleİnterview {
    public static void main(String[] args) {
        // interview question
        // List içerisindeki tüm sıfırları listin sonuna yazan metodu yazınız.
        // giriş: 00,2,3,4,5,0,4,5  çıkış: 2,3,5,4,5,0,

        Integer[] arr1 = {0, 2, 0, 4, 5};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr1));
        System.out.println("moveAllZeroAddEnd(list) = " + moveAllZeroAddEnd(list));
        System.out.println("moveAllZeroAddEnd2(list) = " + moveAllZeroAddEnd2(list));

        System.out.println("---------------------------------------------------------");


        String[] arr = {"Mehmet", "Ahmet", "Enes", "Harun", "Mehmet"};
        List<String> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(removeNameListMethods(list2, "mehmet"));


        System.out.println("---------------------------------------------------------------------");

        // "bir berber bir berbere gel beraber bir berber dükkanı açalım demiş:sad asdas sadsa"
        String str = "bir berber bir berbere gel beraber bir berber dükkanı açalım demiş sad asdas sadsa";
        String[] strArray = str.split(" ");
        List<String> strList = Arrays.asList(strArray);
        System.out.println(strList);
    }

    public static List<Integer> moveAllZeroAddEnd(List<Integer> list) {

        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        for (int i = 0; i < (originalSize - newSize); i++) {
            list.add(0);
        }

        return list;
    }

    public static List<Integer> moveAllZeroAddEnd2(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(0)) {
                list1.add(list.get(i));
            }

        }
        int totalSize = (list.size() - list1.size());
        for (int i = 0; i < totalSize; i++) {
            list1.add(0);
        }

        return list1;
    }

//     interview question list içerisinde mehmet olan tüm isimleri silin


    public static List<String> removeNameListMethods(List<String> list, String data) {

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {

            if (iter.next().equalsIgnoreCase(data)) {
                iter.remove();
            }
        }
        return list;

    }

    //ödev-1
    // interviev questions List<String>
    // List içerisindeki polindrom kelimeleri list içerinden silen metodu yazınız.
    //ey,  edip, adanada, pide, ye   ///     çıkış :  ey,  edip,pide, ye

    //ödev-2
    // List içerisindeki polindrom kelimeler varsa list içerinden her iki kelimeyi silen metodu yazınız.
    //ey,  edip, adanada, pide, ye      boş




}

