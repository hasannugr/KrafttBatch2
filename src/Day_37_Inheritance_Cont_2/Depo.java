package Day_37_Inheritance_Cont_2;


public class Depo extends Fabrika {
    int kapasite;

    public Depo() {


    }

    public Depo(String personelAdi) {
        super(personelAdi);

    }

    public void isBasiSaati() {

        System.out.println("7:30 iş başı yapılır");
    }
}