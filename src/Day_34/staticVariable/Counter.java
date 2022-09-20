package Day_34.staticVariable;

public class Counter {
   static int counter; // 1.nesnede değer 1 oldu -> 2.nesnede değer 2 oldu. static farkı ile....

    public Counter() {
        counter++;
        System.out.println(counter);
    }
}

    class main{
        public static void main(String[] args) {
            Counter ct1=new Counter();
            Counter ct2=new Counter();
            Counter ct3=new Counter();
            Counter ct4=new Counter();
            Counter ct5=new Counter();
            Counter ct6=new Counter();
            Counter ct7=new Counter();
        }
    }

