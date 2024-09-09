package example.datastructures;

import datastructures.linear.Queue;

public class QueueExample {
    public void demo() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue after enqueues: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        queue.enqueue(100);
        queue.enqueue(200);
        System.out.println("Peek after two enqueues: " + queue.peek());

        queue.dequeue();
        System.out.println("Peek after dequeue: " + queue.peek());
    }
}
