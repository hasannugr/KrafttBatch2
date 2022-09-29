package Day_44_oop_ReviewCont.AccessModifier1;

public class CarTest1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();

        car1.model = "Ford";
        car1.engine = 1.6;
        car1.year = 2020;
//        car1.door=4;  variable is a private

        System.out.println(car1.toString());
        System.out.println(car1);
    }
}
