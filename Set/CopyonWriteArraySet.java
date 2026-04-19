package Set;

import java.lang.foreign.MemorySegment;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyonWriteArraySet {
    public static void main(String[] args) {
//         Thread Safe
//         COpy-om-write Mechanism
//         Np duplicate Elemets
//         Iterators Do not Reflect Modifications

        Set<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        Set<Integer> ConcurrentSkipset = new ConcurrentSkipListSet<>();

        for (int i= 0;i<=5;i++){
            copyOnWriteArraySet.add(i);
            ConcurrentSkipset.add(i);
        }
        System.out.println("Intial COpywriteSet: "+copyOnWriteArraySet);
        System.out.println("Intial ConcurrentSKipSet: "+ConcurrentSkipset);
        for (int num:ConcurrentSkipset){
            System.out.println("Reading on copyonwriteset: "+num);
            //Attempting to modify set during iterate
            ConcurrentSkipset.add(6);
        }
        System.out.println("\n ");
        for (int num:copyOnWriteArraySet){
            System.out.println("Reading on copyonwriteset: "+num);
            //Attempting to modify set during iterate
            copyOnWriteArraySet.add(6);
        }
    }
}
