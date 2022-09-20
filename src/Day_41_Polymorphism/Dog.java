package Day_41_Polymorphism;

public class Dog extends Animal {
    int disSayısı;
    int ayakSayisi=4;

    public void voive() {
        System.out.println("hav hav");
    }

    public void speed() {
        System.out.println("dog very fast");
    }
    public void sleep(){
        System.out.println("dog is sleeping");
    }
}
