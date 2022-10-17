package bootCamp.oop;

public class B11_Inheritance {

    //is A relationship between parent/child
    //keyword extends ------child/subClass extends super/parentClass
    //can not inheritance from subClass/ subClass methodlarını ve değişkenlerini superClass kullanamz
    //a class can not extends more than one super class
    //a super class can be extended more than one class/subclass

    //benefits  : inheritance prevent code duplication
    //          : provide easy maintaining
    //example: basePage or testBase class in automation framework
    public static void main(String[] args) {
        Child ahmet = new Child();
        Child ayşe = new Child("ayşe",5);
    }

}
///-----Parent Class
class Parent{
    String name;
    int age;

    public Parent() {
        System.out.println("from parent class constructor");
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("from parent class parameterized constructor");
    }
}
//------Child class
class Child extends Parent{
    public Child() {
//        super()//compiler put super() keyword automatically and implicit
        System.out.println("from child constructor");
    }

    //if there is a parameterized constructor in parent class
    //we must put super() with parameter in child class
    public Child(String name, int age) {
        super(name, age);
        System.out.println("from child class parameterized constructor");
    }
}
