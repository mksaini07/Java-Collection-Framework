package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        // Vector is Synchronized and Thread Safe
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        System.out.println(vector.capacity()); //Default capacity 10 and 2x after full default

        vector.remove(3);
        System.out.println(vector.indexOf(30));
        System.out.println(vector);

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        Vector<Integer> vector1 = new Vector<>(linkedList);
        System.out.println(vector1);


    }
}
