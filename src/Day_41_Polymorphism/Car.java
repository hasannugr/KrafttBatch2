package Day_41_Polymorphism;

public class Car implements IVehicle {

    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");

    }

    @Override
    public int durmaMesafesi() {
        return 20;
    }
}
