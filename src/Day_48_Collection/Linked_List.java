package Day_48_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Linked_List {
    public static void main(String[] args) {
        /*
        ArrayList<String> arrayList=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("ahmet");
        linkedList.add("mehmet");
        linkedList.add("ayşe");
        linkedList.add("Alpaslan");
        System.out.println(linkedList.size());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(2)); */

        Vector<String> vector = new Vector<>();
        //  System.out.println(vector.size());
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("Alpaslan");
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("Alpaslan");
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("Alpaslan");
        System.out.println(vector.size());


    }
}
