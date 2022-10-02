package Day_50_CollectionCont;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

public class DequeStudy {
    public static void main(String[] args) {
        Deque<Integer> deq = new ArrayDeque<>();
        deq.push(200);
        deq.push(5);
        deq.push(7);
        deq.push(8);
        deq.push(20);
        deq.push(25);

        System.out.println("deq = " + deq); //[25, 20, 8, 7, 5, 200]

        deq.offerFirst(11);
        deq.offerLast(11);
        System.out.println("deq = " + deq); // [11, 25, 20, 8, 7, 5, 200, 11]

        deq.addFirst(15);
        deq.addLast(30);
        System.out.println("deq = " + deq); // [15, 11, 25, 20, 8, 7, 5, 200, 11, 30]

        deq.addLast(100);
        System.out.println("deq = " + deq);

        while (!deq.isEmpty()){
            System.out.println("deq.pop() = " + deq.pop());
        }


    }
}
