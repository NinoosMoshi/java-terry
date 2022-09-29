package Collection.List.linkedList.eazy;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // add(element), add(index,element), addAll(collection)
        // remove(element), remove(index,element), removeAll(collection)
        // get(index), set(index,element)

        List<String> arr = List.of("77,88,99");

        LinkedList list = new LinkedList();
        list.add(100);
        list.addFirst(50);
        list.addLast(150);
        list.add(2,125);
        list.addAll(arr);

        System.out.println(list);

        Object b = list.get(3);
        System.out.println("the element of index 3 is: "+ b);


    }
}
