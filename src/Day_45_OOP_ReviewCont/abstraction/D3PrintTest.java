package Day_45_OOP_ReviewCont.abstraction;

public class D3PrintTest {
    public static void main(String[] args) {
        Mod1 toy = new Mod1("ToyCar", "STL");
        System.out.println("------------------------");
        Mod1 toy1 = new Mod1("doll", "OBJ");
        System.out.println("----------------------------");
        Mod1 toy2 = new Mod1("ToyTruck", "stl");
        System.out.println("----------------------------");
        Mod1 toy4 = new Mod1("toyMONKEY", "OBJ");
        System.out.println("----------------------------");
        Mod1 toy5 = new Mod1("TOYcARD", "OBJ");
       // mod1.extrude(); mod1.polish();

    }
}
