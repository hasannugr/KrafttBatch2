package Day_8_AllOperators_2;

public class LogıcOperators {
    public static void main(String[] args) {
        //                                   && - &  VEVE - VE OPARATORLERİ


        //  ve operatorunde bir yerde false varsa sonuc her zaamn false olur.
        //  FALSE VARSA HER ZAMAN FALSE BROOOOOO :)

     /*   boolean sonuc= (5>=4)&&(4==4);
                        true   true   true
        boolean sonuc= (5>=6)&&(4==4);
                         false    false
        boolean sonuc= (5>=6)&&(4==3);
        boolean sonuc= (false)&&(false);     //false tek & kullanırsak ikisinide kotrol ediyor.

        boolean sonuc= (false)&&(false);    = false
        boolean sonuc1= (true)&&(false);    = false
        boolean sonuc2= (false)&&(true);    = fals                                                      e
        boolean sonuc3= (true)&&(true);     = true


        System.out.println("sonuc: "+ sonuc);*/


        //                                          ||   VEYA OPARATORLERİ


        // tek karakter kullanılırsa ikisinide konrol ediyor. çift karakter kullanılırsa ilkini kotrol
        // edip daha sorna ikincisini kotrol ediyor.
        // eğer bir yerde true varsa direk true olarak yazar.
        /*


        boolean sonuc= (false)||(false);    = false
        boolean sonuc1= (true)||(false);    = true
        boolean sonuc2= (false)||(true);    = true
        boolean sonuc3= (true)||(true);     = true

        //
        boolean sonuc4= (false)||(false);
        //                  false   false         = false
        boolean sonuc5= (true)||(false);
        //                true  ....(ikincisine bakmaz) =true
        boolean sonuc6= (false)|(true);
        //               true    false               = true
        boolean sonuc7= (true)&&(true);
        System.out.println(sonuc); */




          //                     ^     YADA OPERATORÜ.


       /* boolean sonuc6= (true)^(true); // = false
        boolean sonuc6= (false)^(false);//  = false
        boolean sonuc6= (true)^(false); //  = true
        boolean sonuc6= (false)^(true);//   = true   */

        /*int a=5,b=10,c=10;
        boolean sonuc =a>b || b>=c;
        System.out.println(sonuc);*/


       /* int a=5,b=10,c=10;
        boolean sonuc= a>b || b>=c && a<=b;
        System.out.println(sonuc);*/

      /*  int a=5,b=10,c=10;
        boolean sonuc = !(a>b || b>=c && !(a>c));        // false
        System.out.println(sonuc);

        int a=5,b=10,c=10;
        boolean sonuc = !(a>b || b>=c || !(a>c));
        System.out.println(sonuc);

        int a=5,b=10,c=10;
        boolean sonuc = !(a>b || b>=c || !(a>c));
        System.out.println( sonuc);*/


        int a=5;
        boolean sonuc = a++==5 && --a == 11%6;
        System.out.println(sonuc);
    }
}
