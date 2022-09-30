package Day_29_WrapperClass;

public class WrapperClass_task {
    public static void main(String[] args) {

        String str = "^+!j4546*/-a_|v-:!a ???()&+";

        String empty = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))  // isAlphabetic metodu ile deyapılabilir.
                empty+=str.charAt(i);
        }
        System.out.println("empty = " + empty);

    }
}
