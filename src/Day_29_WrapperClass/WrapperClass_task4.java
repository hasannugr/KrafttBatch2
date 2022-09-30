package Day_29_WrapperClass;

public class WrapperClass_task4 {
    public static void main(String[] args) {
        String str = "aksjdaşsdasmHasdjasşdjapsdpaAapsdjapdapsdaSsdajsdoasApampsdjapsdmpaN";
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                str1 += str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
