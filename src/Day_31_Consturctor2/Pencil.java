package Day_31_Consturctor2;

public class Pencil {
//    Pencil adında bir class oluşturun, color, lenght, haveEraser adında fields tanımlayın,
//   constructors (4 adet) , write ve delete metodları oluşturarak main metodunda bu class dan
//bir obje oluşturun.(this() metodu kullanılacak)


    public String color;
    public  int lenght;
    public boolean haveEraser;

    public Pencil(){

    }
    public Pencil(String color, int lenght){
        this.color=color;
        this.lenght=lenght;

    }
    public  Pencil(int lenght, boolean haveEraser){
        this.lenght=lenght;
        this.haveEraser=haveEraser;
    }
    public  Pencil (String color, int lenght, boolean haveEraser){
        this.color=color;
        this.lenght=lenght;
        this.haveEraser=haveEraser;
    }
    public  void  write(){
        System.out.println("kalem yaziyor");
    }
    public void delete(){
        System.out.println("kalem siliyor");
    }
}
