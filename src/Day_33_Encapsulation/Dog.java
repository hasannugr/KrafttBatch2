package Day_33_Encapsulation;

public class Dog {
    private String name;
    private String breed;
    private  boolean isBlack;
    private  int age;
    public static int food=4;
    // statik değişkenleri normal metotlarda kullanabiliriz.
    // ancak statik tanımlanmayanları static içerisinde kullanamayız.
    //statik olunca food ornegindeki gibi her yerden ulaşılır ve değiştirilir. ancak final kullansaydık değiştiremezdik.
    // statik metot içerisinde statik olmayan bir metot çağırılamaz. statik metot sınıfın metotodur.
    // statik olmayan bir metotun içerisnde statik olan değişkeni kullanabiliriz. ancak staik olan metodun içerisinde
    // statik olmayan bir metot çağrılamaz.

    public Dog() {
    }
    public String getName (){
        return this.name;
        // get metodu karsı tarafın ismi ookumasıı  saglar. başka bir sey yapamaz.
        // field ismilye çağırılır getName seklinde
    }
    public void setName (String name){
        this.name=name;
        // set metodu ismi düzenler.
    }
    public  String getBreed(){
        return  this.breed;
    }
    public void  setBreed(String breed){
        this.breed=breed;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public void setBlack(boolean black) {
        isBlack = black;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
