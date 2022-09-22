package Day_37_Inheritance_Cont_2;

public class Fabrika {

    String personelAdi;
    boolean  isActive;
    private int num;

    /* static {
         System.out.println("static metod çalıştı");
     }
     {
         System.out.println("blok çalıştı");
     }
*/

    public Fabrika(){

    }

    public Fabrika(String personelAdi){
        this.personelAdi=personelAdi;
        System.out.println("constructor çalıştı");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void isBasiSaati(){
        System.out.println("10:00 iş başı yapılır");
    }
}

