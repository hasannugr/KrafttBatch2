package Day_29_WrapperClass;

public class WrapperClass_2 {
    public static void main(String[] args) {
//
//
//                                           typeValue
//        Bir wrapper class nesnesinin primitive değerini döndürür.
        Integer I = 10;
        int i = I.intValue();
        System.out.println("i = " + i);

        Byte B = 100;
        byte b = B.byteValue();
        System.out.println("b = " + b);

        Boolean Bl = true;
        boolean bl = Bl.booleanValue();
        System.out.println("bl = " + bl);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Integer.sum(10,20) = " + Integer.sum(10, 20));

        System.out.println("Double.max(10,20) = " + Double.max(10, 20));


        char a = 'a';

//        digit ingilizce rakam demektir. digit a a rakam mı analamı taşımaktadır.


        System.out.println("Character.isDigit('a') = " + Character.isDigit(a));
        System.out.println("Character.isDigit('9') = " + Character.isDigit('9'));
        System.out.println("Character.isLetter('4') = " + Character.isLetter('4'));//
        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));//
        System.out.println("Character.isAlphabetic('a') = " + Character.isAlphabetic('a'));
        System.out.println("Character.isAlphabetic('8') = " + Character.isAlphabetic('8'));
        System.out.println("Character.isUpperCase('a') = " + Character.isUpperCase('a'));
        System.out.println("Character.isUpperCase('A') = " + Character.isUpperCase('A'));
        System.out.println("Character.isLowerCase('b') = " + Character.isLowerCase('b'));
        System.out.println("Character.isLowerCase('B') = " + Character.isLowerCase('B'));

    }

}
