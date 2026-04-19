package Queue;

import com.sun.source.tree.WhileLoopTree;

public class PriorityQueue {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customised ordering
        // does not allow null elements
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq); //Not Sorted
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        // internal working
        // PriorityQueue is implemented as a min-heap by default (for natural ordering)
    }
}
