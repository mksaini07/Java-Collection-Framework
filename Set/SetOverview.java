package Set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        //  Set is a collection that cannot contain duplicate elements
        // faster operations
        // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(1);
        set.add(1);
        set.add(32);
        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(1);
        set1.add(3);
        System.out.println(set1);


        NavigableSet<Integer> set2 = new TreeSet<>(); //Sorted set and Extends Navigable
        set2.add(12);
        set2.add(1);
        set2.add(1);
        set2.add(67);
        System.out.println(set2);
        System.out.println(set2.contains(12));
        System.out.println(set2.remove(67));
        System.out.println(set2);
        set2.clear();
        System.out.println(set2.isEmpty());



        // for thread safety
        Set<Integer> set3 =  new ConcurrentSkipListSet<>();

        // unmodifiable
        Set<Integer> integers = Set.of(1, 2, 3,4,5,6,7,8,9,54,4323,545,4545);


    }
}
