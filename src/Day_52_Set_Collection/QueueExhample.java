package Day_52_Set_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExhample {
    public class QueueExample {
        public static void main(String[] args) {

//        FİFO KURALI VARDIR. İLK GELENE İLK ÇIKAR. FİRST İN FİRST OUT.
            Queue<Integer> queue = new PriorityQueue<>();
            queue.add(5);
            queue.add(8);
            queue.add(12);
            System.out.println(queue.poll());
            System.out.println(queue);

        }
    }
}
