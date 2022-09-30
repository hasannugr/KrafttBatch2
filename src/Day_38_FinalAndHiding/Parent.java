package Day_38_FinalAndHiding;

import Day_37_Inheritance_Cont_2.Person;

public class Parent {
    protected int num = 100;
    static int x;

    /* static {System.out.println("static initalize metod çalıştı");}
     {x++;System.out.println("Instance initalize metod çalıştı");}
     {System.out.println("2.Instance initalize metod çalıştı");}
 */
    Parent() {

    }


    private static void run() {
        System.out.println("Parent runs");
    }
}
