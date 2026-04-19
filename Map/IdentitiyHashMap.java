package Map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentitiyHashMap {
    public static void main(String[] args) {
        String key1 = new String("Key");
        String key2 = new String("Key");

        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        Map<String,Integer> map = new IdentityHashMap<>();
        //IdentityHashMap Me Hashcode Object ka Execute hoga na ki String ka
        //Every Object ka Hashcode Different Hota hai
        map.put(key1,1);
        map.put(key2,2);
        System.out.println(map);

    }
}
