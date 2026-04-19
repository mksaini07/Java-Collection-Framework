package Additional;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(3);
        for (int i : list) {
            System.out.println(i);
        }
        //Internal Working of for each loop
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
