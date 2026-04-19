package Map;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String key1 = new String("Key");
        String key2 = new String("Key");

        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        Map<String,Integer> map = new HashMap<>();
        map.put(key1,1);
        map.put(key2,2);
        System.out.println(key1.equals(key2));
        System.out.println(map);
        //String Ka HashCode Chalega or
        //String Objects ka hashcode or address same hota hai agr string same ho toh
    }
}
