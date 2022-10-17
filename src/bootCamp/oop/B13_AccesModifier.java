package bootCamp.oop;

public class B13_AccesModifier {
        //private : visible/reachable only within class
        //protected : visible/reachable in same package,...
                    //..and reachable outside if there is inheritance
        //default : reachable in same package
        //public : reachable everywhere

        //**private constructor role**
        //you can not create the instance out of class
        public static void main(String[] args) {
//            Restricted s = new Restricted();// you can not create an object from private constructor
        }
}
class Restricted{

    private Restricted() {
    }
}

