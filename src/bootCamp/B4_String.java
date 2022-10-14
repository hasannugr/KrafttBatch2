package bootCamp;

public class B4_String {
    public static void main(String[] args) {

        //String is sequences of char value

        //String immutable
        String str = "Big";

        str.concat("Man");
        //if it is not reassign to str. str always return original value.
        // str'ye yeniden atanmazsa str her zaman orijinal değeri döndürür.
        System.out.println("str = " + str);

        str = str.concat("Man");
        //concat and reassign ---> we created a new string and pointed to new string
        // yeni bir değişkene atayıp concat metottunu çağırırsak yazdırır.

        System.out.println("str = " + str);

        //heap
//        ------------------------
//        |                       |
//        |    big                |
//        |                       |
//        |   BigMan -------------|--------str
//        |                       |
//        --------------------------

        //--------

        //we can create string by two way
        //String literal
        String literal = "KRAFT";

        //By new keyWord
        String byNew = new String("BootCamp");

        //StringBuilder and StringBuffer mutable/değişken

        StringBuilder strBld = new StringBuilder("Boot");//is not immutable
        //concat()---append()
        strBld.append("Camp");

        System.out.println("strBld = " + strBld);//BootCamp

        //method of String class
        //charAt()--length()--concat()--equals()--substring()--replace()--lowerCase()--upperCase()--
        //trim()


    }
}
