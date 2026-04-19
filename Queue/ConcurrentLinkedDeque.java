package Queue;

public class ConcurrentLinkedDeque {
    public static void main(String[] args) {
        //non blocking ,thread safe double ended queue
            java.util.concurrent.ConcurrentLinkedDeque<String>deque = new java.util.concurrent.ConcurrentLinkedDeque<>();
            deque.add("Element 1");
            deque.addFirst("Element 0");
            deque.addLast("Element 3");
        System.out.println(deque);
    }
}
