package Queue;

import java.util.concurrent.BlockingQueue;

public class SynchronousQueue {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new java.util.concurrent.SynchronousQueue<>();
        Thread producer = new Thread(() -> {
            try {
                System.out.println("Producer is waiting to transfer...");
                queue.put("Hello from producer!");
                System.out.println("Producer has transferred the message.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Producer was interrupted.");
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumer is waiting to receive...");
                String message = queue.take();
                System.out.println("Consumer received: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Consumer was interrupted.");
            }
        });
        producer.start();
        consumer.start();


    }
}
