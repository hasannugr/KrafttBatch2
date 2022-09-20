package Day_29;

public class WrapperClass_task3 {
    public static void main(String[] args) {


        String str = "A number is a mathematical object used to count, measure, and label. T" +
                "he original examples are the natural numbers 1, 2, 3, 4, and so forth";
        String str1 = " ";

        int sum=0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum+=Integer.parseInt(str.charAt(i)+"");
                str1 += str.charAt(i);

            }
        }
        System.out.println(str1);
        System.out.println("sum = " + sum);

    }
}