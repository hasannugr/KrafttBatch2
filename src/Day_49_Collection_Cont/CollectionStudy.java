package Day_49_Collection_Cont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionStudy {
    public static void main(String[] args) {
//        ArrayList<Integer> lst1 = new ArrayList<>();
//        List<Integer> lst2 = new ArrayList<>();//polymorphic way

        Collection<Integer> col = new ArrayList<>();


        //adding element/object/item
        col.add(5);
        col.add(15);
        col.add(25);
        col.add(20);
        col.add(50);

        System.out.println(col);

        //getting size
        System.out.println("size = " + col.size());

        //remove items
        col.remove(15);
        System.out.println("col = " + col);//[5, 25, 20, 50]
        System.out.println("col.remove(100) = " + col.remove(100));//false
        col.add(5);
        col.add(80);//[5, 25, 20, 50, 5, 80]
        System.out.println("col = " + col);
        col.remove(5);//[25, 20, 50, 5, 80]
        System.out.println("col = " + col);

        //contains item
        System.out.println("contains(50) = " + col.contains(50));//true
        System.out.println("contains(1000) = " + col.contains(1000));//false

        //checking empty or not
        System.out.println("isEmpty() = " + col.isEmpty());//false

        //remove all
//        col.removeAll(col);
//        col.removeAll(Arrays.asList(50,500));//remove yapılmak istenen collcetionın eşleşen elemanları remove edilir.
        System.out.println("col = " + col);

        //adding all
        col.addAll(Arrays.asList(60, 70, 90));//[25, 20, 50, 5, 80, 60, 70, 90]
        System.out.println("col = " + col);

        //contains all
        System.out.println(col.containsAll(Arrays.asList(25, 200)));//true vermesi için yapılan controlde her iki item da bulmalı

        //retains all [25, 20, 50, 5, 80, 60, 70, 90]
//        col.retainAll(Arrays.asList(25,20));  // 25,20 yi alıyor kalanını atıyor.
//        col.retainAll(Arrays.asList(250,200));//eger girilen elemanlar listede yoksa boş bir collection dondurur.
        System.out.println("col = " + col);

        //turning to array [25, 20, 50, 5, 80, 60, 70, 90]
//        Integer[] toArray = col.toArray(new Integer[0]);
        Integer[] toArray = col.toArray(new Integer[11]);//[25, 20, 50, 5, 80, 60, 70, 90, null, null, null]
        System.out.println("array : " + Arrays.toString(toArray));


    }
}
