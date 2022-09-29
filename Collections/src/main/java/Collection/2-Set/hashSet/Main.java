package Collection.List.Set.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    // add(element), addAll(collection), remove(element), removeAll(collection)
    // contains(element), isEmpty()

        HashSet hs = new HashSet<>();

        hs.add(3);
        hs.add(5);
        hs.add(2);
        hs.add(1);
        hs.add(4);
        hs.add(2);
        System.out.println(hs);

        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        hs
                .stream()
                .forEach(h -> System.out.print(h + " "));


    }
}
