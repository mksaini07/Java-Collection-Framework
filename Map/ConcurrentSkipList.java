package Map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipList {
    /* Skiplist :- It is efficient in search , insertion and deletion
                   It store date in sorted layers which access fast
                   It is Probalistic Data Structure

                   layer 2: [1,5,9] search 2 in this list so goes to the 5
                   layer 1: [1,3,5,7,9] search here goes to the 3
                   layer 0: [1,2,3,4,5,6,7,8,9] finally find


      ConcurrentSkipList :- Key and values stored in Skiplist Data structure (thread safe)
                            It Extends ConcurrentNavigableMap > NavigableMap


*/
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer,String> concurrentSkipList = new ConcurrentSkipListMap<>();
        concurrentSkipList.put(1,"Mayank");
        concurrentSkipList.put(2,"Bob");
        concurrentSkipList.put(3,"Charlie");

        System.out.println(concurrentSkipList.ceilingEntry(2));
        System.out.println(concurrentSkipList.containsKey(4));
    }

}
