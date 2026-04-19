package Map;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        //Store key and Values like dictionary
        //Doesn't Maintain Order of Input data
        HashMap<Integer,String> hash = new HashMap<>();
        hash.put(5,"Charlie");
        hash.put(2,"Bob");
        hash.put(3,"Krishna");
        System.out.println(hash);
        System.out.println(hash.get(3));
        System.out.println(hash.containsKey(2)); //T.c=O(1)

        Set<Integer> keys = hash.keySet();
        //Set is just like a ArrayList but doesn't contain duplicate
        for (int i : keys){
            System.out.println(hash.get(i));
        }

    }
}
