package Day_54_CollectionCont2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NevigableSetStudy {
    public static void main(String[] args) {
//        SortedSet<Integer> intSortedSet = new TreeSet<>();
//        Set<Integer> intSortedSet = new TreeSet<>();
        NavigableSet<Integer> intSortedSet = new TreeSet<>();

        intSortedSet.add(35);
        intSortedSet.add(2);
        intSortedSet.add(2);
        intSortedSet.add(10);
        intSortedSet.add(40);
        intSortedSet.add(20);
        intSortedSet.add(50);
        intSortedSet.add(30);
        System.out.println("intSortedSet = " + intSortedSet);
        //[2, 10, 20, 30, 35, 40, 50]

        //lower()
        System.out.println("intSortedSet.lower(35) = "
                + intSortedSet.lower(35));//30  verir girielen değerin bir  düşüğünde olan değeri döndürür.
        //higher()
        System.out.println("intSortedSet.higher(35) = "
                + intSortedSet.higher(35));//40 girielen değerin bir  üstünde olan değeri döndürür.


        //floor()
        System.out.println("intSortedSet.floor(35) = "
                + intSortedSet.floor(34));//30 girilen değer aynıysa aynısını değilse bir alt değerini döndürür.
        //ceiling()
        System.out.println("intSortedSet.ceiling(34) = "
                + intSortedSet.ceiling(34));//35  girilen değer aynıysa  bir üstüdndeki değeri döndürür.

        //pollFirst  ilk elemanı siler ve kalan elemanları geri döndürür.
//        intSortedSet.clear();
        System.out.println("intSortedSet = " + intSortedSet);

        //[2, 10, 20, 30, 35, 40, 50]

        System.out.println("intSortedSet.first() = " + intSortedSet.first());
        System.out.println("intSortedSet = " + intSortedSet);
        System.out.println("intSortedSet.pollFirst() = " + intSortedSet.pollFirst());
        System.out.println("intSortedSet = " + intSortedSet);//[10, 20, 30, 35, 40, 50]

        //pollLast() son  elemanı siler ve kalan elemanları geri döndürür.
        System.out.println("intSortedSet.pollLast() = " + intSortedSet.pollLast());
        System.out.println("intSortedSet = " + intSortedSet);
        //[10, 20, 30, 35, 40]

        //descendingSet() azalan
        intSortedSet.addAll(Arrays.asList(30,60,70,80));
        System.out.println("intSortedSet = " + intSortedSet);
        //[10, 20, 30, 35, 40, 60, 70, 80]
        System.out.println("intSortedSet.descendingSet() = "
                + intSortedSet.descendingSet());//[80, 70, 60, 40, 35, 30, 20, 10]

        //subSet() //[10, 20, 30, 35, 40, 60, 70, 80]
        System.out.println("intSortedSet.subSet(30,true,70,false) = "
                + intSortedSet.subSet(30, true, 70, false));
        //[30, 35, 40, 60] ------------> 30 dahil 70 dahil değil.

        //headSet()  --------------------> 40 a kadar olanlar.
        System.out.println("intSortedSet.headSet(40,false) = "
                + intSortedSet.headSet(40, false));//[10, 20, 30, 35]

        //tailset() ---------------------------------> 40 dahil değil ve 40 dan sonrasını yaz.
        System.out.println("intSortedSet.tailSet(40,false) = "
                + intSortedSet.tailSet(40, false));//[60, 70, 80]

        System.out.println("intSortedSet = " + intSortedSet);
        //          [10, 20, 30, 35, 40, 60, 70, 80]



        //iterator
        Iterator<Integer> iterator = intSortedSet.iterator();
        while (iterator.hasNext()){
            Integer next =iterator.next();
            if (next>39) {
                iterator.remove();
            }
        }
        System.out.println("intSortedSet = "
                + intSortedSet);//[10, 20, 30, 35]
    }
}
