package Day_29;

public class WrapperClass {
    public static void main(String[] args) {

        Byte B = new Byte((byte) 127);
        Byte B2 = new Byte("127");

        System.out.println("B = " + B);
        System.out.println("B2 = " + B2);

        Short S = new Short((short) 1000);
        Short S2 = new Short("1000");

        Integer I = new Integer(10000);
        Integer I2 = new Integer("10000");

        Long L = new Long(1000000);
        Long L2 = new Long("1000000");

        Float F = new Float(1.2);
        Float F2 = new Float("1.2");

        Double D = new Double(3.14);
        Double D2 = new Double("3.14");

        Character C = new Character('a');

//        new classla olusturursak string şeklind ede oluşturuluyor.


        //Autoboxing and unboxing

        int i = 10;
        Integer x = i;//autoboxed

        Integer x1 = new Integer(5);
        int i1 = x1; //unboxed

        Double db = new Double(10.0);

        double dbl = db;//unboxed
        double bdl1 = new Double(3.14);//unboxed

//                                                    valueOf
//        Method, String ve int parametre kabul eder.
//        Çağrıldığı wrapper class için object döndürür.

        String s2 = "10";
        Integer integer = Integer.valueOf(s2);
        System.out.println("integer = " + integer);
        Integer integer1 = Integer.valueOf(10);
        System.out.println(integer + integer1);

        Boolean Bl = Boolean.valueOf("true");
        Boolean Bl1 = Boolean.valueOf(true);
        Character ch = Character.valueOf('a');

        System.out.println("Bl = " + Bl);
        System.out.println("Bl1 = " + Bl1);
        System.out.println("ch = " + ch);

//        Integer integer2 = Integer.valueOf("");
//        Integer integer3 = Integer.valueOf("ten");

//                                            parse
//     String argumanı kabul ediyor ve bunu ilgili primitive data tipine convert ediyor.
        String tring = "100";
        int y = Integer.parseInt(tring);
        Integer buObject = y;

        int i2 = buObject + 10;//unboxed
        Integer baskaBirNesne = buObject + 10;//autoboxed


        //soldakilerin tipinde oluyor =//sagdakiler

        System.out.println(buObject + y);
        System.out.println(tring + 2);
        System.out.println(Integer.parseInt("100") + 2);

        System.out.println("y = " + y);
        int y1 = Integer.parseInt("-100");
        int y2 = Integer.parseInt("+100");

        String s3 = "1000";

        Double dble = Double.parseDouble(s3);
        Boolean bl = Boolean.parseBoolean("true");
        System.out.println("dble = " + dble);
        System.out.println("bl = " + bl);


        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);

//        int y3 = Integer.parseInt("100b");                   HATALI KULLANIM
//        int y4 = Integer.parseInt("100-");                   HATALI KULLANIM
//        int y5 = Integer.parseInt("a100");                   HATALI KULLANIM
//        int y6 = Integer.parseInt(" ");                      HATALI KULLANIM
//        System.out.println("y3 = " + y3);
//        System.out.println("y4 = " + y4);
//        System.out.println("y5 = " + y5);
//        System.out.println("y6 = " + y6);


    }
}


