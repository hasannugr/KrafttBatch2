package bootCamp.oop;

public class B15_Abstraction {

    //hiding implementation
    //focusing essential, ignore details

    //important point abstraction : abstract method
    //abstract classes don't have body so implementation is not allowed
    //abstract method can not be private-final-static

    //abstraction s two ways:
    //1-abstract class
    //abstract class can not be final because it is parent
    //can not create object from abstract class, can have all types + abstract methods
    //normal/regular class can not have abstract methods

    //2-interface
    //blueprint of class
    //provide additional methods
    //it is not a class, it is pure abstraction
    //cannot create object
    //keyword : implements
    //allows multiple inheritance
    //has one type variable
}
//---------Interface
interface I {

    public static final String name = "Ahmet";//variables in interface public static final as default
    public abstract void test1();

    default void test2(){};
    static void test3(){};
    private void test4(){};


}
//--------abstract class
abstract class Vehicle{
    abstract double price();
}
//--------concrete class
class Car extends Vehicle implements I{

    @Override
    double price() {
        return 0;
    }
    @Override
    public void test1() {

    }
}
