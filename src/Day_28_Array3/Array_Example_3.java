package Day_28_Array3;

public class Array_Example_3 {
    public static void main(String[] args) {

        // StringBuffer stringBuffer=new StringBuffer("Merhaba");
        // stringBuffer.reverse();
        //System.out.println(stringBuffer);

        String str = "ünlü akşam eve giderken onları görmüştü";
        ;
        //          0123456
        System.out.println(yeniKelimeUret(str));
//Dün akşam eve giderken onları görmüştüm.
// Cümlesindeki ü harfinin önünde
// ve arkasında olan harflerden bir string üreten bir method yazın.

    }

    public static String yeniKelimeUret(String str) {
        String result = "";
        //String str="ünlü akşam eve giderken onları görmüştü";
        if (str.substring(0, 1).equals("ü")) result += str.substring(1, 2);


        for (int i = 1; i < str.length() - 1; i++) {

            if (str.substring(i, i + 1).equals("ü")) {
                result += str.substring(i - 1, i);
                result += str.substring(i + 1, i + 2);
            }
        }


        if (str.substring(str.length() - 1).equals("ü")) result += str.substring(str.length() - 2, str.length() - 1);

        return result;

    }

}
