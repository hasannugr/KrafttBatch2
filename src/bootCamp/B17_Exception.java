package bootCamp;

public class B17_Exception {
    private static String str;

    //checked and unchecked

    //checked exception --- during compile time

    //unchecked exception : during runtime

    public static void main(String[] args) {


        int[] arr = {5, 7, 9, 10};
//        System.out.println(arr[50]);//runtime time exception--unchecked exception

//        FileWriter writer = new FileWriter("");//checked exception--compile time exception

        String str = null;

        try {
//            System.out.println(str.length());//null pointer exception
//            System.out.println(arr[50]);//Array index out of bound exception
//            Integer.parseInt("iki");//number format exception
//            int i = 55/0;//arithmetic exception

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("hello");
        }
        finally {
            System.out.println("ne olursa olsun yürürüm");
        }


    }

    //**throws key only handle checked exception

    //final vs finally vs finalize

    //final keyword : you know
    //finally is a block can be used with try catch blocks, always get executed
    //finalize : is a method collectors unreferenced object from garbage collection. using with unreferenced object

}
