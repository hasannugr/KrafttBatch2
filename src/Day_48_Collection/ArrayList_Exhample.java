package Day_48_Collection;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayList_Exhample {


    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("ahmet");
        arrayList.add("mehmet");
        arrayList.add("ayşe");
        arrayList.add("ahmet");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("ahmet");
        arrayList2.add("mehmet");

//ahmet mehmet ayşe ahmet
        System.out.println("ilk durum:" + arrayList.size());
        System.out.println(arrayList.indexOf("ayşe"));
        System.out.println("son durum durum:" + arrayList.size());
        //System.out.println(arrayList.get(0));


    }
}
