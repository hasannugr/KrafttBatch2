package Day_36_Inharitance_Cont;

public class VanKedisi extends Cat{
    boolean isDifferenteyes;


    public VanKedisi(int ayaksayisi,String color,boolean isNankor){
        super(ayaksayisi,color,isNankor);
    }
    public VanKedisi(int ayaksayisi,String color,boolean isNankor,boolean isDifferenteyes){
        super(ayaksayisi,color,isNankor);
        this.isDifferenteyes=isDifferenteyes;
    }
    public VanKedisi(){}
}
