package bootCamp;

public class B19_Ternary {

    public static void main(String[] args) {


        //which one big?
        int x = 5000, y= 100, z = 15;

        System.out.println(x > y ? (x > z ? x : z) : (y > z ? y : z));

        //which one have the longest char sequences?
        String s1 = "Ahmet", s2 = "Mehmet", s3 = "Ercument";
        System.out.println(s1.length() > s2.length() ? (s1.length() > s3.length() ? s1 : s3)
                : (s2.length() > s3.length() ? s2 : s3));


        //swaping
        int a = 10;
        int b = 20;

        int temp;
        System.out.println(a+" <--> "+b);

        temp = a;
        a=b;//a-->20
        b=temp;//b-->10

        System.out.println(a+" <--> "+b);

    }




}
