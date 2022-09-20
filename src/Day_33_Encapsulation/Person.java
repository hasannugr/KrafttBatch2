package Day_33_Encapsulation;

public class Person {

    public String name;
    public int id;



    public Person(){
        this.id=5000;
    }

    public Person(String name){
        this();
        this.name=name;
    }
    public Person(String name, int id){
        this();
        this.name=name;
        this.id=id;
    }
}
