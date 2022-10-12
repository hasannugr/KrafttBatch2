package bootCamp;

public class B2_Operators {
    public static void main(String[] args) {
        //Arithmetic operators
        //* / + -
        int i = 5+3/2+1-1;//6
        System.out.println("i = " + i);
        i=5+3*2+2-1;//12
        System.out.println("i = " + i);
        i=5+(int)3.1+2-1;//9
        System.out.println("i = " + i);
        System.out.println("--------");
        i= (int)3.4+(int)6.6;
        System.out.println("i = " + i);
        i= (int)(3.4+6.6);               // veri kaybı olmaması için bu yaklaşım daha doğru
        System.out.println("i = " + i);

        i= (int)(4.5+(double)(5/2));//6
        System.out.println("i = " + i);

        i= (int)(4.5+(double)5/2);//7
        System.out.println("i = " + i);

        int s = (int)(10.5+12.7);//23
        System.out.println("s = " + s);


        //unary operators
        //+ - ++ -- !

        int value = 0;
        value++;//postfix increment
        System.out.println("value = " + value);
        ++value;//prefix increment
        System.out.println("value = " + value++);

        int i1 = value + 0;
        System.out.println("i1 = " + i1);


        //The assignment operators
        //The equality and relational operators
        //The conditional/logical operators

    }
}
