package bootCamp;

import java.util.Scanner;

import static java.lang.Math.max;

public class B8_Import {

    //normal
    //import packageName.ClassName;-----any importing
    //import packageName.*;---all classes

    //static import
    //static packageName.ClassName.staticMember;
    //static packageName.ClassName.*;
    //benefit of static import is I can reach static member of library without typing class name
    //faydası : kutuphanelerdeki veya classlardaki
    // satic uyelere class adını yazmadan dogrudan erişim sağlar

    Scanner sc = new Scanner(System.in);//normal import

    public static void main(String[] args) {

        max(5,5);//static import is needed
        max(5,7);

    }

}
