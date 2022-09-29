package Map.hashTable;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        // no duplicate and sort is not allow based on value

        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(100, "ninos");
        map.put(200, "nahrain");
        map.put(300, "matthew");
        map.put(400, "daniel");
//        map.put(100,"wilson");

        System.out.println(map);             // {400=daniel, 300=matthew, 200=nahrain, 100=wilson}
        System.out.println(map.entrySet());  // {400=daniel, 300=matthew, 200=nahrain, 100=wilson}

        System.out.println(map.get(200));    // nahrain
        System.out.println(map.containsKey(300));  // true
        System.out.println(map.containsValue("matthew")); // true
        System.out.println(map.isEmpty());  // false

        System.out.println(map.keySet());   // [400, 300, 200, 100]
        System.out.println(map.values());   // [daniel, matthew, nahrain, wilson]


    }
}
