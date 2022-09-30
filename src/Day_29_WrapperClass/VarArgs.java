package Day_29_WrapperClass;

public class VarArgs {

    public static void main(String[] args) {

        sum(5, 10);
        sum(5, 10, 15);
        sum(5, 10, 15, 20, 25, 30);
        sum(5, 10, 15, 20, 25, 30, 100, 133);

        concat("ja", "va", " ", "insanlari");
        System.out.println(concat1("JAVA", "PHYTON", "C++"));
    }

    public static void sum(int... sayilar) {  //variable arguments
        int sum = 0;
        for (int i : sayilar) {
            sum += i;
        }
        System.out.println("girilen " + sayilar.length + " nin toplami : " + sum);
    }

    public static void concat(String... strs) {
        String empty = "";
        for (String s : strs) {
            empty += s;
        }
        System.out.println(empty);
    }

    public static String concat1(String... strs) {
        String empty = "";
        for (int i = 0; i < strs.length; i++) {
            empty += strs[i].charAt(0);
        }
        return empty;
    }


}




