package Day_45_OOP_ReviewCont;

public class YourCar extends MyCar{
    public static  boolean haveSunroof(){
        return true;

    }
    public void getMyCarSunroofStatus(){
        System.out.println("Your car have sunroof: "+ haveSunroof());
    }
}
