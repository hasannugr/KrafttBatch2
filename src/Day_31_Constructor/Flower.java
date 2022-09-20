package Day_31_Constructor;

public class Flower {
    // 1. ismi sınıf ismi ile aynı olmalıdır
    // 2. retrn type yok
    // 3. oluşturulmaz ise boş olarak atama yapıyor
    // 4. sınıfın özel bir metodu
    // 5. ilk olusturma esnasındda constructor cağırılır

    public String renk;
    public  int boy;
    boolean diken;



    public  Flower(String renk){
    this.renk=renk;

    }
    public  Flower(String renk, int boy){
        this.renk=renk;
        this.boy=boy;
    }
    public  Flower(String renk, int boy, boolean diken){
        this.renk=renk;
        this.boy=boy;
        this.diken=diken;
    }



//    public Flower(String renk1,int boy1, boolean diken1){
//       this keywordu sınıfların içerisindeki fieldlarına işaret eder.
//
//        this.renk=renk;
//        this.boy=boy;
//        this.diken=diken;
//
//    }
//
//    public  void setRenk(String renk1){
//        renk=renk1;
//    }

}
