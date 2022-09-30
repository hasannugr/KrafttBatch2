package Day_34_Static.staticBlocks;

public class BlocksVs {
    int i;

    public BlocksVs(int i) {
        this.i = i;
        System.out.println("constructor calisti");
    }
    static {
        System.out.println("satatik block calisti");
    }
    {
        System.out.println("intance blok calisti");
    }

}

