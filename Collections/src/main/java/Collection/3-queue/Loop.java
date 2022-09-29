package Collection.List.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Loop {
    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue();
        queue.add("A");
        queue.add("C");
        queue.add("B");
        queue.add("C");
        System.out.println(queue);              // [A, C, B, C]

        Iterator it = queue.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");  // A C B C
        }

        System.out.println();

        for (Object temp: queue){
            System.out.print(temp + " ");      // A C B C
        }


    }
}
