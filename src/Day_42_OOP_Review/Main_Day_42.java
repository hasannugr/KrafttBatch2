package Day_42_OOP_Review;

public class Main_Day_42 {
    public static void main(String[] args) {
        Daire daire=new Daire();
        Daire daire2=new Daire(2);
        cahngeRadius(daire2,4);
        System.out.println(daire2.getRadius());



        daire.setRadius(5);
        System.out.println(daire.getRadius());
        System.out.println(daire.alan());
    }

    public static void cahngeRadius(Daire daire,double radius){
        daire.setRadius(radius);
    }
    // static metot içerisinde this ve super() keywordları kullanılmaz.




}
