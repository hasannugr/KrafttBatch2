package Day_37_Inheritance_Cont_2;

import java.util.Random;

public class Person {
    String name;
    String surName;
    int id;
    double salary;
    Person(){}

    public void createId(){
        Random random=new Random();
        this.id=random.nextInt(100)+1;
    }
}