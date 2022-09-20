package Day_31_Consturctor2;

public class Main_Day_32 {
    public static void main(String[] args) {
//        Square square_1=new Square();
//        square_1.sideLenght=5;
//        System.out.println("square_1.calculateArea() = " + square_1.calculateArea());
//        System.out.println("square_1.calculatePerimeter() = " + square_1.calculatePerimeter());
//
//        Square square_2=new Square(8);
//        System.out.println("square_2.calculatePerimeter() = " + square_2.calculatePerimeter());
//        System.out.println("square_2.calculateArea() = " + square_2.calculateArea());


      /* Pencil pencil_1=new Pencil("sari",10,true);
        System.out.println(pencil_1.color);
        System.out.println(pencil_1.lenght);
        System.out.println(pencil_1.haveEraser);

        pencil_1.delete();
        pencil_1.write();*/

      /*  pencil_1.color="sari";
        pencil_1.lenght=10;
        pencil_1.haveEraser=true;   // bu şekilde tanımlama yapmadan parametrede tanımlama yapılır.

        Cat muezza =new Cat("yesil","British", false,true);
        Cat minnos= new Cat("yesiş","sokak kedisi", true,  false);
        Cat pamuk= new Cat("ela", "iran",false,true );

        System.out.println("pamuk.eyeColor = " + pamuk.eyeColor);*/
        KraftBank hasan = new KraftBank(154547853, "HASAN HUSEYIN UGUR", true);
        System.out.println(hasan.customerToken);
        System.out.println("hasan.customerAccpunt = " + hasan.customerAccpunt);
        hasan.addMoney(1200);
        System.out.println("hasan.customerAccpunt = " + hasan.customerAccpunt);
        hasan.addMoney(800);
        System.out.println("hasan.customerAccpunt = " + hasan.customerAccpunt);
        System.out.println("hasan.customerFullName = " + hasan.customerFullName);

        System.out.println("changeFullName(hasan,\"Hasan ugur\") = " + changeFullName(hasan, "Hasan ugur"));
//        iki parametre ouşturuyoruz ilkine ismi string prantezi açıpp yeni ismi yazıyoruz.



    }
    //    classları metot içerisiinde cağırma.
    public static String changeFullName(KraftBank kraftBank, String fullName) {
        KraftBank.customerFullName = fullName;
        return fullName;
    }
    public static String changeToken(KraftBank kraftBank, String token) {
        KraftBank.customerToken = token;
        return token;
    }




}
