package Day_55_MapInterface;

import java.util.*;

public class MapInterfaceStudy_2 {
    public static void main(String[] args) {
        Map<String,Integer> ageMap = new HashMap<>();

        ageMap.put("Mehmet",25);
        ageMap.put("Hatice",24);
        ageMap.put("Ayşe",22);
        ageMap.put("Metin",50);
        ageMap.put("Osman",37);
        ageMap.put("Zeynep",24);
        ageMap.put("Veli",24);
        ageMap.put("Ahmet",45);

        //how to collect all keys of map
        //set<K>  keySet()
        //Returns a "set view" of the keys contained in the map

        Set<String> stringSet = ageMap.keySet();
        System.out.println("stringSet = " + stringSet);
        //[Ayşe, Ahmet, Veli, Zeynep, Mehmet, Osman, Hatice, Metin]

        //How to remove a key which have specific value
        //how to convert a new map from current map
        //take a new map of person mapped ages should be under 25

        //[Ayşe, Ahmet, Veli, Zeynep, Mehmet, Osman, Hatice, Metin]
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (ageMap.get( next )>25){
                iterator.remove();
            }
        }
        System.out.println("ageMap = " + ageMap);
//        {Ayşe=22, Veli=24, Zeynep=24, Mehmet=25, Hatice=24}

        for (String eachKey : stringSet){
            System.out.println("eachKey = " + eachKey
            +" -->"+ageMap.get(eachKey));
        }

        //Collection<V>   values()
        //Returns a "Collection view" of the values contained in the map
       Collection<Integer> values = ageMap.values();
        System.out.println("values = " + values);
        //[22, 24, 24, 25, 24]

        Iterator<Integer> iterValues = values.iterator();

        //[22, 24, 24, 25, 24]
        while (iterValues.hasNext()){
            Integer next = iterValues.next();
            if (next<24){
                iterValues.remove();
            }
        }
        System.out.println("values = " + values);//[24, 24, 25, 24]
        System.out.println("ageMap = " + ageMap);
        //{Veli=24, Zeynep=24, Mehmet=25, Hatice=24}
        System.out.println("iterValues.hasNext() = "
                + iterValues.hasNext());//false

        Iterator<Integer> iterValues2 = values.iterator();

        System.out.println("iterValues2.hasNext() = "
                + iterValues2.hasNext());
        System.out.println("--------------------------");

        Set< Map.Entry<String, Integer> > entries = ageMap.entrySet();

        for (Map.Entry<String, Integer> eachEntry :entries){
            System.out.println("eachEntry.getKey() = "
                    + eachEntry.getKey()+"--->"+eachEntry.getValue());

            if (eachEntry.getValue()==24){
                eachEntry.setValue(eachEntry.getValue()+10);

            }
        }
        System.out.println("ageMap = " + ageMap);
        //{Veli=34, Zeynep=34, Mehmet=25, Hatice=34}

        ageMap.forEach((K,V)-> System.out.println(K+"-->"+V));


        /////////////////////////////////////////

        NavigableMap<Integer,String> navMap =
                new TreeMap<>();
        navMap.put(25,"Mehmet");
//        navMap.put(24,"Hatice");
        navMap.put(22,"Ayşe");
        navMap.put(50,"Metin");
        navMap.put(37,"Osman");
//        navMap.put(24,"Zeynep");
        navMap.put(24,"Veli");
        navMap.put(45,"Ahmet");

        System.out.println("navMap = " + navMap);
        System.out.println("navMap.descendingKeySet() = "
                + navMap.descendingKeySet());
        //[50, 45, 37, 25, 24, 22]

    }
}
