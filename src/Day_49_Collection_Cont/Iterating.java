package Day_49_Collection_Cont;

import java.util.*;

public class Iterating {
        public static void main (String[]args){
            Collection<Integer> cll
                    = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 20));
            System.out.println("cll = " + cll);

//        for (Integer each : cll){
//            System.out.println(each);
//            if (each>5){
//                cll.remove(each);
//            }
//        }we can not use remove or update item

            Iterator<Integer> myIter = cll.iterator();
/*
        //next()
        System.out.println("next() = " + myIter.next());   // ilk indexdekini veriyor 3
//        System.out.println("next() = " + myIter.next()); //  ikinci indexdekini veriyor 5
        //remove()
        myIter.remove();//[5, 7, 10, 20]  1. indexteki 3 ü attı.

        myIter.remove();//hata verir. remove() dan once next() yapılmalı.!!!!

        System.out.println("myIter.next() = " + myIter.next());
        myIter.remove();
        System.out.println("cll = " + cll);
 */
//[3, 5, 7, 10, 20]
            System.out.println("myIter.hasNext() = " + myIter.hasNext());

//            iterasyon yapılacak iter var mı ?  sorusunu sorgular.  hasNext

//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());

            while (myIter.hasNext()) {
                Integer next = myIter.next();
                System.out.println(next);
                if (next > 5) {
                    myIter.remove();
                }
            }
            System.out.println("myIter.hasNext() = " + myIter.hasNext());


//        System.out.println("myIter.hasNext() = " + myIter.hasNext());
//        System.out.println("myIter.next() = " + myIter.next());


            // list ıtarator





        }
    }

