package Map;

import java.util.TreeMap;

public class SortedMap {
    public static void main(String[] args) {
        java.util.SortedMap<Integer,String> map = new TreeMap<>(); //For Ascending
        map.put(10,"Mayank");
        map.put(9,"Bob");
        map.put(7,"ALice");
        map.put(8,"Vipul");

        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(9)); //Exclude 9
        System.out.println(map.tailMap(7)); //Include 7


        java.util.SortedMap<Integer,String> map1 = new TreeMap<>((a, b)->b-a); //For Descending
        map1.put(10,"Mayank");
        map1.put(9,"Bob");
        map1.put(7,"ALice");
        map1.put(8,"Vipul");

        System.out.println(map1);

        System.out.println(map1.firstKey());
        System.out.println(map1.lastKey());
        System.out.println(map1.headMap(9)); //Exclude 9
        System.out.println(map1.tailMap(7)); //Include 7

    }
}
