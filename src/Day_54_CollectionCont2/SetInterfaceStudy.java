package Day_54_CollectionCont2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceStudy {
    public static void main(String[] args) {
        //unique item/no duplicate
        //insertion ordering not preserved
        // primitive tiplerin obje kısmına wrrapper class denir.

        Set<Long> longSet = new HashSet<>();
        System.out.println(longSet.add(7l));//true
        System.out.println(longSet.add(7l));//false // aynı değerler eklendiğinde false döndürür aynı değeri kabul etmez.
        longSet.add(7l);//false
        longSet.add(7l);//false
        System.out.println(longSet.add(70l));//true
        System.out.println(longSet.add(70l));//false

        System.out.println("longSet = " + longSet);//[70, 7]

        for (Long each : longSet ) {
            System.out.println("-->"+each);
        }

        longSet.addAll(Arrays.asList(2l,3l,4l,4l,4l));

        System.out.println("longSet = " + longSet);

        //[2, 3, 4, 70, 7]

        System.out.println("longSet.add(null) = "
                + longSet.add(null));//set içinde null yok o yuzden true döndurdu ilk kez atandığı için
        System.out.println("longSet.add(null) = " + longSet.add(null));//null var false dondurdu
        System.out.println("longSet = " + longSet);   //[null, 2, 3, 4, 70, 7]

        if (!longSet.add(70l)){
            //item varsa false dondürür ! olduğu için true dönüyor if çalışır
            longSet.remove(70l);
        }
        System.out.println("longSet = " + longSet);

    }
}
