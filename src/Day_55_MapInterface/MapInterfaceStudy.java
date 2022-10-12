package Day_55_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceStudy {
    public static void main(String[] args) {
        Map<String,Integer> ageMap = new HashMap<>();
        //Map<K,V>
        //put()
        ageMap.put("Mehmet",25);
        ageMap.put("Ahmet",24);
        ageMap.put("Ayşe",22);
        //size()
        System.out.println("ageMap.size() = "
                + ageMap.size());

        //get(K)
        System.out.println("ageMap.get(Mehmet) = "
                + ageMap.get("Mehmet"));
        int ageOfMehmet = ageMap.get("Mehmet");//unboxed

        //containsKey()  // boleann bir değer döndürür. mehmet var mı yok mu ?
        System.out.println("ageMap.containsKey(Mehmet) = "
                + ageMap.containsKey("Mehmet"));

        //remove()
        System.out.println("ageMap.remove(Mehmet) = "
                + ageMap.remove("Mehmet"));
        System.out.println("ageMap = " + ageMap);

        //putAll()
        Map<String,Integer> ageMap2 = new HashMap<>();
        ageMap2.put("Metin",null);
        ageMap2.put("Osman",37);
        ageMap2.put("hakan",24);
        ageMap2.put("Ahmet",24);
        ageMap2.put("Ahmet",25);
        System.out.println("ageMap2 = " + ageMap2);
        //{Ahmet=25, Ayşe=22, hakan=24, Osman=37, Metin=null}
        // dublicate veri kabul etmez ama son girilen değer neyse o değeri alır.
        // map ozelliginden değil put metotdundan dolayı değeri aldı

        ageMap.putAll(ageMap2);
        System.out.println("ageMap = " + ageMap);
        //{Ahmet=22, Ayşe=22, hakan=24, Osman=37, Metin=null}

        //clear()
        ageMap2.clear();
        System.out.println("ageMap2 = " + ageMap2);//{}
        System.out.println("ageMap = " + ageMap);
//        {Ahmet=25, Ayşe=22, hakan=24, Osman=37, Metin=null}
        // agaMap2 silinse bile agaMap 2 den gelenler silinmez agaMapin içerisini temizleir.

        //putIfAbsent()
        //{Ahmet=25, Ayşe=22, hakan=24, Osman=37, Metin=null}
        System.out.println("ageMap.putIfAbsent(Osan,38) = "
                + ageMap.putIfAbsent("Osman", 38));//37

        // osman yoksa yerine koy. eğer değer doğruysa değeri döndürür yanlışsa yine doğruyu döndüürür.
        Integer integer = ageMap.putIfAbsent("Osman", 37);//37
        System.out.println("ageMap.putIfAbsent(Metin,23) = "
                + ageMap.putIfAbsent("Metin", 23));
        System.out.println("ageMap = " + ageMap);
        // değer nullsa yeni değeri ona gönderir.


        //getOrDefault(9   // çok onemli değil
        System.out.println("ageMap.getOrDefault(Ayşem,22) = "
                + ageMap.getOrDefault("Ayşem", 23));

        Integer ayşe = ageMap.getOrDefault("Ayşem", 22);

        System.out.println("ageMap = " + ageMap);
        if (ageMap.getOrDefault("Ayşe",22)==22){
            System.out.println("Ayşes ' s age "
            + ageMap.getOrDefault("Ayşe",22));
        }

        //replace()
        System.out.println("ageMap.replace(Ayşe,24) = "
                + ageMap.replace("Ayşe", 24));//Ayşe=24
        System.out.println("ageMap = " + ageMap);
        //{Ahmet=25, Ayşe=24, hakan=24, Osman=37, Metin=23}
        // çıktıda eski yaşı gönderir tekrar yazdırırsak yeni değeri dönürür.

        System.out.println("ageMap.replace(Ayşe,24,25) = "
                + ageMap.replace("Ayşe", 23, 25));
        System.out.println("ageMap = " + ageMap);
        // ayşenin yaşı yanlış girildiği için bir değiştirme yapmayacak false

        System.out.println("ageMap.replace(Ayşe,24,25) = "
                + ageMap.replace("Ayşe", 24, 25));
        // ayşenin yaşı doğru girildiği için yeni dğer döndürecek true

        System.out.println("ageMap = " + ageMap);
        //{Ahmet=25, Ayşe=25, hakan=24, Osman=37, Metin=23}

    }
}
