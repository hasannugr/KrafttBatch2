package bootCamp;

public class B9_ObjectAndClass {

    //class is template of object-----What properties an behavior the object have
    // class objetin bir örnegi  ------
    //class bir şablondur, nesnenin şablonudur. ----- nesneye ait davranış ve ozellikler class dan gelir

    //object : comes from class---instance of class
    //nesne class ın bir orneği

    //fields--instance
    String name;

    //fields ---static
    static String schoolName = "KRAFT";

    //behavior --method--instance
    void action(){
        System.out.println("action of " +name);
    }
    //behavior-- static
    static void status(){
        System.out.println("student");
    }


}class test{
    public static void main(String[] args) {
        //object comes from class---instance of class
        B9_ObjectAndClass copy = new B9_ObjectAndClass();
        copy.name="name1";
        copy.action();

        B9_ObjectAndClass copy2 = new B9_ObjectAndClass();
        copy2.name="name2";              // objeya ait.
        copy2.action();

        //instance vs static
        //instance--belongs to the object --each object has its own copy
        //static --belongs to class ---only one copy for all object

        //we can use static and nun static elements in regular method
        //we can use static elements in static method

        B9_ObjectAndClass.schoolName="superKraft";  // clasa ait
        B9_ObjectAndClass.status();


    }
}
