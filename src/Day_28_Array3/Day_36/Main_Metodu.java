package Day_28_Array3.Day_36;

public class Main_Metodu {
    public static void main(String[] args) {
      /*  Class_B  b_objesi=new Class_B();
        b_objesi.aMetodu();
        Class_C  c_objesi=new Class_C();
        c_objesi.aMetodu();
        System.out.println(c_objesi.a); */

        /*  Class_B bObjesi = new Class_B(5,10);
        bObjesi.aMetodu(); */

        // static metot bellekte bir defa yer tutar ve bu sebeple bir kere değşirse her yerden değişir.
        // bellekte tek yerden değşim olur.
        // static tanımlı olursa sınıfın bir değişkneni olur ve yeni bir obje oluşturmaya gerek kalmadan çağrılabilir.
        // Class_B.a şeklinde çağrılabilir. static olursa.

        // isimler aynı fakat parametleri farklı olan metotlara metod overloading denir.7

        // hepsinin kendisine özel durumları var. ovverrşdşng üzerine yazma işlemi demektir
        //Alt sınıflar özel olduğu için bazı durumlarda alt sınıfların üst sınıflardan miras aldığı metotlar yetersiz
        //gelebilir yada altsınıf için bu metot uygun değildir.
        // Bu nedenle alt sınıfa özel bir metot yazılarak üst sınıfta
        //var olan metot geçersiz kılınır. Bu işleme Overridding işlemi denir.
        // araba start stop ile çalıştı, motor anahtar ile çaıştı, araba kartla çalıştı gibi örnekler.
        // bütün örneklerde arac sınıfından aracın calışması alınıyor ama hepsinin durumu farklı şekilde.
        // baştan alınan metot yetersiz kaldığı için üzerine yazıyoruz.

        /* Cat muezza = new Cat();
        muezza.talk();
        Dog karabas = new Dog();
        karabas.talk(); */


        VanKedisi vanKedisi=new VanKedisi(4,"beyaz",false,true);


    }
}
