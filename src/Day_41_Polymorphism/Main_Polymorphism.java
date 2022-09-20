package Day_41_Polymorphism;

public class Main_Polymorphism {
    public static void main(String[] args) {

        // sağ tarafa parent class sol tarafa child class tanımlanarak polymorphism yapılır.
//        Animal karabas=new Dog();
      /*  Dog karabas =new Dog();
        karabas.voive();
        karabas.speed();
        Animal akbas=new Dog();
        akbas.voice();
        akbas.sleep();*/

        SporCar kirmiziMelek=new SporCar();
       /* kirmiziMelek.start();
        kirmiziMelek.speed();
        kirmiziMelek.stop();*/

        Car beyazMelek=new SporCar();
       /* beyazMelek.start();
        beyazMelek.stop();
        beyazMelek.durmaMesafesi();*/

        IVehicle sariMelek=new SporCar();
        /*sariMelek.start();
        sariMelek.stop();
        System.out.println(sariMelek.tekerSayisi());
        System.out.println(kirmiziMelek.getClass().getName());*/

        Kus limon=new Kanarya();
        Kus mavis=new Muhabbet();

//     İnstanceof (örnek) Objenin belirli bir sınıfın örneği olup olmadığını kontrol eder.

      /*  System.out.println(mavis instanceof  Muhabbet); // true

        if (limon instanceof  Kanarya){
            System.out.println(" limon kanaryanin ornegi");
        }
        */


//   parent class child class gibi davranması gerekiyor.( casting için )
        // bu sebeple dog gibi davranması gerekiyor. new Dog (); şeklinde kulanılması gerekir.

        Animal animal=new Dog();
        Dog dog2=(Dog) animal;
        System.out.println(dog2.ayakSayisi);
        dog2.voice();
        dog2.sleep();
        dog2.speed();
        dog2.eat();


    }
}

//getClass() objenin bulunduğu sınıf bilgilerini getirir.
//class package.className
//get.class().getName() objenin bulunduğu sınıf bilgilerini getirir.
//package.className
//get.class().getSimpleName() objenin bulunduğu sınıf bilgilerini getirir.
//className
//getClass().getConstructors().length Contructor adedini verir


//İnstanceof (örnek)
//    Objenin belirli bir sınıfın örneği olup olmadığını kontrol eder.