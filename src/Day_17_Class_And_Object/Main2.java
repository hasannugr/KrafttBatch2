package Day_17_Class_And_Object;

public class Main2 {
    public static void main(String[] args) {
        DaireNew daire_1=new DaireNew();
        daire_1.yarıcap=10;

        DaireNew daire_2=new DaireNew();
        daire_2.yarıcap=15;
        daire_1=daire_2;
        daire_2.yarıcap=80;

    }
}
