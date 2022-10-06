package Day_53_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ManavMain {
    public static void main(String[] args) {
        Map<String,Manav> manav=new TreeMap<>();

        manav.put("02Elma02",new Manav("elma",25.99));
        manav.put("Ayva0204",new Manav("ayva",36.99));

        manav.get("Ayva0204").setFiyat(75.99);
        manav.get("Ayva0204").fiyatArttir(5);
        System.out.println(manav.get("Ayva0204").getFiyat());
        double toplamFiyat=0;
        for (String key: manav.keySet()) {
            toplamFiyat+=manav.get(key).getFiyat();
        }
        System.out.println(Math.round(toplamFiyat));

        Map<String,Integer> map=new HashMap<>();
        map.put("elma", 25);
        map.put("armut", 35);

        int result1 = map.get("armut")+15;
        System.out.println("map.get(\"armut\") = " + map.get("armut"));
        System.out.println("result1 = " + result1);


        int result=0;
        for (String key: map.keySet()) {
            result+=map.get(key);
        }
        System.out.println(Integer.parseInt("1") + 5);  // içerideki veriyi ıntegera çevirir parseInt
        map.forEach((k,v)-> System.out.println(v));


        //lamba ->
        //regex

    }
    }

