package List;

import java.util.Arrays;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        System.out.println(linkedList);
        linkedList.addFirst(0);
        linkedList.addLast(50);
        System.out.println(linkedList);

        linkedList.removeIf(x->x%2==0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat","dog","Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("dog","Lion"));
        animals.removeAll(animalsToRemove);

        System.out.println(animals);
    }

}
