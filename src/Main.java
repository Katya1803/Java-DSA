import example.datastructures.ArrayListExample;
import example.datastructures.LinkedListExample;
import example.datastructures.QueueExample;
import example.datastructures.StackExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running ArrayListExample:");
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.demo();

        System.out.println("\nRunning LinkedListExample:");
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.demo();

        System.out.println("\nRunning StackExample:");
        StackExample stackExample = new StackExample();
        stackExample.demo();

        System.out.println("\nRunning QueueExample:");
        QueueExample queueExample = new QueueExample();
        queueExample.demo();
    }
}
