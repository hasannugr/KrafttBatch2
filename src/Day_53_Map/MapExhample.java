package Day_53_Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapExhample {
    public static void main(String[] args) {


        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(671, "harun");
        map.put(471, "hasan");
        map.put(978, "htu");
        map.forEach((k, v) -> System.out.println(k + "  -->" + v));
        System.out.println("map.get(471) = " + map.get(471));
        System.out.println("map.size() = " + map.size());
        System.out.println("map.toString() = " + map.toString());
        System.out.println("map.toString().toUpperCase() = " + map.toString().toUpperCase());
        System.out.println("map.remove(671) = " + map.remove(671));
        System.out.println("map = " + map);
        System.out.println("map.containsValue(\"hasan\") = " + map.containsValue("hasan"));
        // var mı yok mu kontrol ediyor. (String)
        System.out.println("map.containsKey(456) = " + map.containsKey(456)); // var mı yok mu kontrol (Integer)
        System.out.println("map.replace(978,\"talha\") = " + map.replace(978, "talha"));
        System.out.println("map.keySet() = " + map.keySet()); // içerisindeki Integer sayıları çeker.
        System.out.println("map.values() = " + map.values()); // içerisidneki Stringleri döndürür.

        for (Integer num : map.keySet()) {
            System.out.println("map.get(num) = " + map.get(num));

        }

        Map<Integer, String> fenA = new LinkedHashMap<>();
        fenA.put(671, "Harun");
        fenA.put(995, "mehmet");
        fenA.put(895, "ahmet");
        fenA.put(423, "ayşe");


        Map<Integer, String> fenB = new LinkedHashMap<>();
        fenB.put(888, "enes");
        fenB.put(9225, "beytullah");
        fenB.put(8295, "bahar");
        fenB.put(4223, "umut arslan");

        List<Map<Integer, String>> okul = new ArrayList<>();
        okul.add(fenA);
        okul.add(fenB);
        System.out.println("okul.size() = " + okul.size());
        System.out.println("okul.toString() = " + okul.toString());

        System.out.println("fenB.get(4223) = " + fenB.get(4223));
        System.out.println("okul.get(1).get(4223) = " + okul.get(1).get(4223));

      /*  for (Map<Integer,String> sinif:okul){
            for(Integer key:sinif.keySet()){
                System.out.println(sinif.get(key));
            }

       */

        for (int i = 0; i < okul.size(); i++) {
            for (Integer key : okul.get(i).keySet()) {
                System.out.println(okul.get(i).get(key));
            }

        }
    }
}
