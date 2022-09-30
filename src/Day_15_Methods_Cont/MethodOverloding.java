package Day_15_Methods_Cont;

public class MethodOverloding {
    public static void main(String[] args) {
//              calculateArea(15);
//              calculateArea(14,12.5);
              concat(5,"HASAN",false);
       // concat("Galatasaray",5);


    }


//        CalculateArea isminde 2 method yazın ve overload
//         olsunlar. Birincisi kare-dikdörtgen alanını hesaplasın.
//          İkincisi dairenin alanını hesaplasın. PI: 3,147

    public static void calculateArea(double a, double b) {
        double alan = a * b;
        System.out.println("daire alani: " + alan);
    }

    public static void calculateArea(int b) {
        int r;
        double pı = 3.14;
        r = b;
        System.out.println("kare alan: " + (pı * r * r));
    }


//    Bir method yazın 3 parametreli olsun. İnt ve String type
//    ve birde boolean. Boolean true ise int ve String değeri
//    concat yapsın. False ise başka bir methodu çağırsın ve
//    String değeri int kadar yazdırsın.

    public static void concat(int i, String str, boolean bl) {

        if (bl) {
            System.out.println(str + i);
        } else {
            concat(str, i);   // buraya bir method cagıracagım.
        }

    }

    public static void concat(String kelime, int c) {
        for (int t = 0; t < c; t++) {
            System.out.println("MERSTENS SAPLA FENERE OLSUN DERS");
        }
    }
}










