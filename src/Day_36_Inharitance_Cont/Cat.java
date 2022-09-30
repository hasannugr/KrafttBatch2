package Day_36_Inharitance_Cont;

public class Cat extends Anımal{
    boolean isNankor;

    public Cat(int ayaksayisi,String color,boolean isNankor){
        super(ayaksayisi,color);
        this.isNankor=isNankor;
    }

    public Cat(){}

}
