package bootCamp;

public class B7_MethodAndConstructor {

    //method : code fragment which can perform task
    /// bazı görevlri yerine getiren kod yapıları

    //Access modifier return type name(parameter){implementation/body/code}


    //method overloading
    //same method name different parameter in same class
    //return type no effect method overloading
    public static void message(String str){
        System.out.println(str);
    }
    public static void message(){
        System.out.println("hello");
    }
    public static void message(String str,int a){}
    public static void message(String str,int a,double b){}
    public static void message(int a,double b,String str){}
    public static void message(double b,int a,String str){}
    public static void message(double b){}
    public static void message(int a){}

    public static void main(String[] args) {
        message("hello");
        message();
        message(5,10.0,"hello");
//        ---------
//      this object create from parameterazed constructor
        Test test = new Test("hello");

        test.str="Big World";
        test.any();

    }
    //constructor
    //special method
    //used for creating object ---- kullanıcı obje üretirken
    //constructor name must be same with class name-- consturactor class ismiyle aynı olmak zorundadır.
    //doesn't have any return type  ---- rtrun typları yoktur.
    //if we don't put any constructor, always there is a default constructor as implicit
    //if we put a parameterized constructor there is no default constructor.

}
class Test{

    String str;

    //no default constructor here
    //constructor
    public Test(String str){
        System.out.println(str);
    }
    //constructor
    public Test(String str,int i){

    }
    //method
    public void any(){
        System.out.println(str);
    }

}
