package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {
        Map<String,Integer> map  =new HashMap<>();
        map.put("A", 1);
        map.put("B",2);
        Map<String,Integer> map1 = Collections.unmodifiableMap(map);
        System.out.println(map1);
//        map1.put("C",3); Throw Exception

        Map<String, Integer> map3 = Map.of("Shubham", 98, "Vivek", 89); //Add 10 entries only
//        map3.put("Akshit", 88); throw exception not engter data later
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Akshit", 99), Map.entry("Vivek", 99)); //Add greter than 10 entries

    }
}
