package Day_34_Static.staticClass;

public class Outer {


    static class nested {
        public static void message1() {
            System.out.println("selam static class dan");
        }
    }

    class inner {

        public void message2() {
            System.out.println("selam inner class dan");
        }
    }

    class Main {
        public static void main(String[] args) {

            Outer.nested.message1();

            Outer outer = new Outer();

//            Outer.inner inner=new  Outer.new inner();

            Outer.inner selam = new Outer().new inner();

            selam.message2();


        }
    }

}
