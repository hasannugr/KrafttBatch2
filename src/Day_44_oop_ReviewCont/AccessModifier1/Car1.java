package Day_44_oop_ReviewCont.AccessModifier1;

public class Car1 {


    String model;
    public int year;
    private int door;
    protected double engine;

    void metot1() {}

    public void metot2() {}

    private void metot3() {}

    protected void metot4() {}

    @Override
    public String toString() {
        return "Car1{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }

    public Car1() {
    }

    public Car1(String model, int year, int door, double engine) {
        this.model = model;
        this.year = year;
        this.door = door;
        this.engine = engine;
    }

}
