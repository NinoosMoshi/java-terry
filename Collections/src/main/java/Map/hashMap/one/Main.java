package Map.hashMap.one;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // no duplicate, and sort is allow based on value

        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "ninos");
        map.put(200, "nahrain");
        map.put(300, "matthew");
        map.put(400, "daniel");
        map.put(100,"wilson");

        System.out.println(map);             // {400=daniel, 100=ninos, 200=nahrain, 300=matthew}
        System.out.println(map.entrySet());  // {400=daniel, 100=ninos, 200=nahrain, 300=matthew}

        System.out.println(map.get(200));    // nahrain
        System.out.println(map.containsKey(300));  // true
        System.out.println(map.containsValue("matthew")); // true
        System.out.println(map.isEmpty());  // false

        System.out.println(map.keySet());   // [400, 100, 200, 300]
        System.out.println(map.values());   // [daniel, wilson, nahrain, matthew]




    }
}
