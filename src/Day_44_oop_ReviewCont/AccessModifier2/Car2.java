package Day_44_oop_ReviewCont.AccessModifier2;

import Day_44_oop_ReviewCont.AccessModifier1.Car1;

public class Car2  extends Car1 {
    @Override
    public void metot2() {
        super.metot2();
    }

    @Override
    protected void metot4() {
        super.metot4();
    }

    public  Car2(){
        super();       // get automatic for java
//        model="Ford";
          engine=1.6;
          year=2020;
 //       door=4 variable is a private

    }

//    private class inner{}
}
