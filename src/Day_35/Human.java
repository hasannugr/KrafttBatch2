package Day_35;
// multimate inharitance konusu anlatımı.

public class Human {
    public void name() {
        System.out.println("ismi suleyman cakir olabilir");
    }
}

class Man extends Human {
    public void role() {
        System.out.println("baba olurlar");
    }
}

class Son extends Man {
    public void activity() {
        System.out.println("oyun oynar");
    }
}

class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.name();
        son.role();
        son.activity();
        System.out.println("--------------------------------------------------------------");

        Man man = new Man();
        man.name();
        man.role();
        // man.activity          //erişemez
        System.out.println("---------------------------------------------------------------");
        Human human = new Human();
        human.name();
        // human.role();         //erişemez
        // human.activity();     //erişemez
    }
}
