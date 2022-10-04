package Day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
// ** COLLECTİONLAR PRİMİTİVE DATA TPYE ALMAZLAR NESNE İLE İŞLEM YAPILIR. örnek: (Integer)!!!


public class ListExhample {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5, 4, 2, 3, 6, 5, 8, 7, 9, 7, 5, 2};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr1));

//        System.out.println("list2.get(0) = " + list.get(0));

        System.out.println("--------------------------------------------------------------------");

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
//        System.out.println("list.get(0) = " + list.get(0));
        List<String> list2 = new ArrayList<>();
        List<Double> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();
        list4.add(list1);
        list4.add(list2);
        list4.add(list3);
        System.out.println("list4.get(0) = " + list4.get(0));

        List<Object> list5 = new ArrayList<>();
        list5.add(list4);
        System.out.println("list5 = " + list5);
        System.out.println("list5.size() = " + list5.size());

        System.out.println("--------------------------------------------------------------------");

        List<Integer> list7 = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(removeListMethod2(list7, 5));
        System.out.println(removeListMethod2(list7, 4));
        System.out.println(removeListMethod3(list7, 3));

        System.out.println("--------------------------------------------------");
        System.out.println("removeListMethod4(list1,5) = " + removeListMethod4(list, 5));
        System.out.println("removeListMethod4(list1,5) = " + removeListMethod4(list, 2));
        System.out.println("removeListMethod4(list1,5) = " + removeListMethod4(list, 7));
        System.out.println("removeListMethod4(list1,5) = " + removeListMethod4(list, 4));


    }

    // bir arrayi list'in içeriisne alan ve list return eden bir methot yazınız.
    public static List<Integer> addListMethod(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public static List<Integer> addListMethod2(Integer[] arr) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(arr);
        return list;
    }

    // İçerisine bir list ve data kabul eden ve bu datayı tüm listeden silen
    // sonucunda bir Integer list döndüren metodu yazınız.

    public static List<Integer> removeListMethod(List<Integer> list, int data) {

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(data)) {
                list2.add(list.get(i));
            }

        }
        return list2;
    }


    public static List<Integer> removeListMethod2(List<Integer> list, int data) {

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(data)) {
                list2.add(list.get(i));
            }

        }
        return list2;
    }


    public static Boolean removeListMethod3(List<Integer> list, int data) {


        return list.retainAll(Arrays.asList(new Integer[]{data}));
    }

    public static List<Integer> removeListMethod4(List<Integer> list, Integer data) {
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            if (iter.next().equals(data)){
                iter.remove();
            }
        }
        return list;

    }
}




