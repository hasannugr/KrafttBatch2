package bootCamp.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class B16_Polymorphism {

    //poly morph --- çokca form
    //it is the ability of an object to take many form/ bir nesnenin birden fazla form alma yeteneği
    //there must be is a relation
    //parent/super class or interface bring referenced to the child class


    //parent type decides which can be accessible
    //object type decides which implementation to the executed

    //static polymorphism--compile time polymorphism--method overloading
    //dynamic polymorphism--runtime polymorphism--method overriding

    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();//polymorphic way
        TreeSet<Integer> treeSet = new TreeSet<>();

        //reference type casting
        //upcasting -auto casting --smaller type to larger type--implictly
        List<Integer> list =     (List)       new ArrayList();//upcasting

        //dawncasting --larger to smaller type
        Super sub1 = new Sub();
        sub1.message1();
        ((Sub) sub1).message2();//dawncasting


    }

}
class Super{
    void message1(){
        System.out.println("message from Super");
    }
}
class Sub extends Super{

    @Override
    void message1() {
        System.out.println("message from Sub");

    }
    void message2() {
        System.out.println("message2 from Sub");

    }

}
