package List;


import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list  = new java.util.ArrayList<>();
        list.add(0);
        list.add(20);
        list.add(80);

        System.out.println(list.get(2));
        list.add(2,30);
        System.out.println(list.get(2));
        list.set(2,80);
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.contains(20));
        System.out.println(list.contains(2));

        Object[] array = list.toArray(); // Convert List to Array
        list.toArray(new Integer[0]); //

        Collections.sort(list); // Sorting of List
        System.out.println(list);

    }


}
