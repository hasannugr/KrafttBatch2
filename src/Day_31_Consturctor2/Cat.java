package Day_31_Consturctor2;

public class Cat {

//    Örnek-3
//    Cat adında bir class oluşturun, eyeColor, breed, isFat, isPet adında fields tanımlayın
//     constructors (5 adet), sleep, food, run metodları oluşturarak main metodunda bu class dan
//bir obje oluşturun.
    public  String eyeColor;
    public  String breed;
    public  boolean isFat;
    public  boolean isPet;

    public Cat() {
    }

    public Cat(String eyeColor, String breed) {
        this.eyeColor = eyeColor;
        this.breed = breed;
    }

    public Cat(String eyeColor, String breed, boolean isFat) {
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.isFat = isFat;
    }


    public Cat(String eyeColor, String breed, boolean isFat, boolean isPet) {
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.isFat = isFat;
        this.isPet = isPet;
    }
    public void  sleep(){
        System.out.println("uyuyorum");
    }
    public void  food(){
        System.out.println("yemek yiyorum");
    }
    public void run(){
        System.out.println("kosuyorum");
    }

}
