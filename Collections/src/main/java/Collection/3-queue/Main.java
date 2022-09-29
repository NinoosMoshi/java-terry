package Collection.List.queue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        // 1- Adding
        // add() -> if successful adding return true, if not return Exception,
        // offer() -> if successful adding return true, if not return null
        PriorityQueue q = new PriorityQueue();
        q.add("A");
        q.add("C");
        q.add("B");
        q.offer("C");
        System.out.println(q);  // [A, C, B, C]   not sorting and duplicates are allowed
        //.............................................................................................................

        // 2- return the head
        // element() -> if there is no head will return exception
        // peek() -> if there is no head will return null

        System.out.println(q.element());  // A
        System.out.println(q.peek());      // A

        //.............................................................................................................

        // 3- removing
        // remove() -> if queue is empty and trying to return head will give an exception
        // poll() -> if queue is empty and trying to return head will give null
        System.out.println(q.remove());  // A
        System.out.println(q);           // [B, C, C]
//      System.out.println(q.poll());






    }
}
