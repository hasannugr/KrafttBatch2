package Day_44_oop_ReviewCont.FinalKeyword;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalArrayAndArrayList {
    public static void main(String[] args) {
//   index içerisinde değişiklik yapılabilir ancak referansı değiştiremeyiz.
        final String[] BATCH2={"Talip", "Alparslan"};
       BATCH2[0]="ibrahim";
        System.out.println(Arrays.toString(BATCH2));

//        BATCH2=new String[]{"Ali", "Mehmet"}; //  bacht2 final olduğundan referansı değiştirilemez yapılamaz


        System.out.println("-------------------------------------------------------------------");

        final ArrayList<String> NAME= new ArrayList<>();
        NAME.add("ihsan");
        NAME.add("Hasan");

//        NAME =new ArrayList<>();   final olduğundan yapılamaz.
    }


}
