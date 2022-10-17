package bootCamp.oop;

public class B12_MethodOverriding {

    //only happen in subclass
    //method name , return type, parameter must be same
    //access modifier must be same or more visible
    //final-private-static methods can not override

    //benefit of overriding : one method different implementation.

    public void method(){
        System.out.println("from parent");
    }
//    static void method(){}//not override
//    private void method(){}//not override
//    final void method(){}///not override

}

//----child class
class B extends B12_MethodOverriding{
    @Override
    public void method() {
        System.out.println("from child");
    }
}
class test{
    public static void main(String[] args) {
        B b = new B();
        b.method();

        B12_MethodOverriding c = new B12_MethodOverriding();
        c.method();
    }
}
