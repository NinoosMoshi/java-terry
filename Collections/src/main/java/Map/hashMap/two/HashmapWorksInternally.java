package Map.hashMap.two;

import java.util.HashMap;

public class HashmapWorksInternally {
    public static void main(String[] args) {

        String name = "MAX";
        System.out.println(name.hashCode());




        HashMap<String,String> map = new HashMap<>();
        map.put("TOM","ninos");
        map.put("MAX","nahrain");
        map.put("JACK","mathew");
        map.put("LIO","daniel");


        for (String key : map.keySet()){
            System.out.println(key.hashCode() % 4 + ":" + key + " " + map.get(key));
        }


    }
}
