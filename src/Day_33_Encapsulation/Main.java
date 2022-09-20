package Day_33_Encapsulation;

public class Main {
    public static void main(String[] args) {
       /* Person person = new Person("Hasan",500);
        System.out.println("person.id = " + person.id);

        Person person1=personCreate("Mario icardi",2022);
        System.out.println("person1.name = " + person1.name);
        Person mertens= personCreate(" dires mertens",2023);
        System.out.println("mertens.name = " + mertens.name);
*/

       /* Dog karabas=new Dog();
        System.out.println("karabas.getName() = " + karabas.getName()); // null
        karabas.setName("karabas");
        System.out.println(karabas.getName());  //  cıktı karabas
        karabas.setName("boncuk");
        System.out.println(karabas.getName().substring(0,3).toUpperCase());*/ // BON çıktısı alınır.


//        Dog.food=5;
//        System.out.println(Dog.food);
//
//        Circle circle_1=new Circle(5);


//        System.out.println(Math.PI*Math.pow(circle_1.getRadius(),2));
//        System.out.println(circle_1.getRadius());
//        circle_1.setRadius(12);
//        System.out.println(circle_1.getRadius());


        KraftBankCustomer1 hasan =new KraftBankCustomer1(1453,"Hasan Huseyin ugur",false);
        System.out.println(hasan.getCustomerToken());
        hasan.setCustomerFullName("1453Ha12","hasan ugur");
        System.out.println(hasan.getCustomerFullName());
        hasan.addMoney(500);
        hasan.setIsSms(true);
        System.out.println(hasan.getCustomerAccount());


    }

    public  static  Person personCreate(String name, int id){
        Person person= new Person(name, id);
        return person;
    }
    public  static  Person personChange(Person person, String name,int id){
        person.name=name;
        person.id=id;
        return person;
    }

}
