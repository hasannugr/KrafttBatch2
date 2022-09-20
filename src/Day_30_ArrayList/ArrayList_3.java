package Day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_3 {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();
        names.add("ahmet");
        names.add("mustafa");
        names.add("talip");
        names.add("alparslan");
        names.add("ihsan");
        names.add("talha");
        names.add("bilge");
        names.add("bahar");
        names.add("hatice");
        names.add("cigdem");

        System.out.println("names.size() = " + names.size());

        for (String str: names){
            System.out.print(str+" ");
        }
        System.out.println();
        for (int i = 0; i <names.size() ; i++) {
            System.out.print(names.get(i)+" ");

        }
        System.out.println();
        System.out.println("names.get(5) = " + names.get(5));

        int alparslan= names.indexOf("alparslan");
        System.out.println("alparslan = " + alparslan);

        names.add("hasan");
        System.out.println("names = " + names);

        names.set(3,"hasan");
        System.out.println("names = " + names);

        System.out.println("names.indexof = "+ names.indexOf("hasan"));
        System.out.println("names.lastindexof = " + names.lastIndexOf("hasan"));

        names.remove("hasan");
        System.out.println("names = " + names);
        names.remove("hasan");
        System.out.println("names = " + names);


    }
    }

