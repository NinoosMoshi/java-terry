package Collection.List.arrayList;


import java.util.*;


public class Main {
    public static void main(String[] args) {

// Collections: add(), addAll(), remove(), removeAll(), retainAll() -> remove all except retain objects,
// clear(), isEmpty(),size(), contains(), containsAll(), toArray(), get(), set(index, element)
// List: indexOf,

        List<Integer> listC = Arrays.asList(8,7,9);

        List<Integer> list = new ArrayList<>();
        // 1- add(element)
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        System.out.println(list);   // [3, 2, 1, 4]
        // 2- add(index,element) with index
        list.add(2,9);
        System.out.println(list);   // [3, 2, 9, 1, 4]

        // 3- addAll(index,Collection) with index and newCollection
        list.addAll(0,listC);
        System.out.println(list);   // [8, 7, 9, 3, 2, 9, 1, 4]

        // 4- size()
        System.out.println(list.size()); // 8

        // 5-remove()
//        list.remove(0);
//        System.out.println(list);  // [7, 9, 3, 2, 9, 1, 4]


        // 6- removeAll()
        list.removeAll(listC);  // it will remove listC from list
        System.out.println(list);   // [3, 2, 1, 4]

        // 7- set(index, element) // it will do update
        // [3, 2, 1, 4]
        list.set(0,33);
        System.out.println(list); //  [33, 2, 1, 4]

        // 8- get(index)
        System.out.println(list.get(0));  // 33

        // 9- contain(elements)
        System.out.println(list.contains(33));  // true

        // 10- isEmpty()  it will check the list is empty or not
        System.out.println(list.isEmpty());  // false

        // 11- Collections.shuffle(list) -> it will shuffle(randomly) elements
        Collections.shuffle(list);
        System.out.println("this is shuffle: "+ list);

        // 12- Collections.sort(list)
        Collections.sort(list);
        System.out.println(list);  // [1, 2, 4, 33]

        // 13- indexOf()
        List<String> names = List.of("ninos", "nahrain", "matthew", "daniel");
        System.out.println(names.indexOf("matthew"));  // 2


        // 14- retainAll(Collection)  -> it will check out to common between two list
        ArrayList<String> languages1 = new ArrayList<>();
        languages1.add("c++");
        languages1.add("Python");
        languages1.add("Java");

        ArrayList<String> languages2 = new ArrayList<>();
        languages2.add("English");
        languages2.add("Java");
        languages2.add("Python");

        languages1.retainAll(languages2);
        System.out.println("Common Elements: " + languages1);  // Common Elements: [Python, Java]




    }
}

