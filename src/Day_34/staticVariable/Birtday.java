package Day_34.staticVariable;

public class Birtday {
    static int cakeSlice=28;

    // static değişken değerini üzerinde tuttar.


    public void takeASlice(){
        cakeSlice--;
    }
    public void takeAslice(int count){
        cakeSlice-=count;
    }
}
class main2{
    public static void main(String[] args) {
        Birtday ıcardı=new Birtday();
        Birtday mertens=new Birtday();
        Birtday ross=new Birtday();
        Birtday wandarana=new Birtday();
        Birtday sacha=new Birtday();
        Birtday muslera=new Birtday();
        Birtday sneıjder=new Birtday();

        ıcardı.takeASlice();
        mertens.takeASlice();
        ross.takeASlice();
        wandarana.takeASlice();
        sacha.takeASlice();
        muslera.takeASlice();
        sneıjder.takeASlice();
        sneıjder.takeASlice();
        wandarana.takeASlice();

        System.out.println(Birtday.cakeSlice);


    }
}