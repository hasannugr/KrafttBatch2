package Day_36;

public class VanKedisi extends Cat{
    boolean isDifferentAyes;
    public VanKedisi(int foodCount, String  color, boolean isNankor ){
        super(foodCount, color, isNankor);
    }
    public VanKedisi(int foodCount, String  color, boolean isNankor, boolean isDifferentAyes){
        super(foodCount, color, isNankor);
        this.isDifferentAyes=isDifferentAyes;
    }
}
