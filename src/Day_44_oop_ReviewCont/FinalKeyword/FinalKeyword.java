package Day_44_oop_ReviewCont.FinalKeyword;

public class FinalKeyword {
    static final int f = 10;
    final int n;
    final int l;
    static final int sl;

    public FinalKeyword() {
        n = 10;
        System.out.println("from constructor"+ n);
    }

    {
        l = 20;
        System.out.println("from init block"+ l);

    }

    static {
        sl = 40;
        System.out.println("static block run");

    }

}

class run{
    public static void main(String[] args) {
        FinalKeyword finalKeyword=new FinalKeyword();


    }
}
