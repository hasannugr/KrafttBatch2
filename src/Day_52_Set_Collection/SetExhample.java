package Day_52_Set_Collection;

import java.util.*;

public class SetExhample {
//    Set interface’i Collection sınıfının subclass’ıdır.

//    Bu nedenle Collection interface’inin bütün metotlarınıkullanır.

//    Yinelenen verileri kabul etmez (dublicates are not allowed)

//     Verilerin ekleme sırasına göre sıralı bir şekilde depolanmaz. (insertion not order preserved)

    public static void main(String[] args) {
          /*  Set<Integer> set=new HashSet<>();
        set.add(5);
        set.add(35);
        set.add(45);
        set.add(26);
        set.add(5);        //    Yinelenen verileri kabul etmez (dublicates are not allowed)
        set.add(26);
        System.out.println(set);

        Set<String> set=new HashSet<>();
        String str=new String("ahmet");
        set.add("ahmet");
        set.add("35");
        set.add("ahmet");  //    Yinelenen verileri kabul etmez (dublicates are not allowed)
        set.add(str);

        System.out.println(set);

        */

        String str2="bugün eve çok geç geldim, ama kendimi çok mutlu hissediyorum";
        //içerisinde hangi harfler geçmektedir.
        str2=str2.replaceAll(" ","");
        str2=str2.replaceAll(",","");
        String[] strArray=str2.split("");

        // "mavi gömle ürün kodu:4325,beyaz gömlek ürün kodu:3652................."
        // ürün kodlarına göre sıralıyın..  (Samsung)

        Integer [] arr={1,2,3,6,8,45,33,69,78,1,2,3,6,8};


        Set<Integer> hashSet=new HashSet<>(Arrays.asList(arr));
        Set<Integer> treeSet=new TreeSet<>(Arrays.asList(arr));

        Set<String> newSet = new HashSet<>();
     //   hashSet.forEach(p-> System.out.println(p));

        System.out.println("hashSet = " + hashSet);
        System.out.println("treeSet = " + treeSet);
        //Verilerin eklenme sırasını korumaz, fakat TreeSet yapısındaki (dahili TreeMap)
        //doğal sıralamaya göre artan sırada saklanır


        /*
        for (int i = 0; i <strArray.length ; i++) {
            newSet.add(strArray[i]);
        }
        System.out.println(newSet);
        List<String> newList=new ArrayList<>(Arrays.asList(strArray));
        System.out.println("list: "+newList);
        Collections.sort(newList);
        System.out.println("list: "+newList);


         */




    }
}
