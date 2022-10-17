package bootCamp;

public class B18_Garbage {
    public static void main(String[] args) {
        //two ways
        //1-reassign a object
        String str = "Car";//garbage
        str = "truck";

        //2-assign null
        String str2 = "cat";//garbage
        str2 = null;

        //how/when to send an abject to garbage collection.
        //if an object being without reference it will throw garbage collection.
    }


}
