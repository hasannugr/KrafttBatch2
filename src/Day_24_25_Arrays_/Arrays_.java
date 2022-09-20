package Day_24_25_Arrays_;
import java.util.Arrays;
public class Arrays_ {
    public static void main(String[] args) {
        int[] iArry= new int[5];
        iArry[0]=10;
        iArry[1]=20;
        iArry[2]=30;
        iArry[3]=40;
        iArry[4]=50;
        for (int i :iArry) {
            System.out.println(i);
        }
        for (int i = 0; i <iArry.length ; i++) {
            System.out.println(iArry[i]);
        }
        String[] sArry= new String[3];
        sArry[0]="hasan";
        sArry[1]="huseyin";
        sArry[2]="ugur";

        System.out.println(sArry[0].length());
        System.out.println(sArry[0]);
//        Bu method vasıtası ile array in elemanlarını consola [] içerisinde yazdırabiliriz.

        System.out.println(Arrays.toString(sArry));
        System.out.println(Arrays.toString(iArry));






        String str ="merhaba java insanlari";
         String [] arry= str.split(" ");
        System.out.println(arry[0]);


    }


}
