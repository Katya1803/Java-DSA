import example.datastructures.linear.ArrayListExample;
import example.datastructures.linear.LinkedListExample;
import example.datastructures.linear.QueueExample;
import example.datastructures.linear.StackExample;
import example.datastructures.nonlinear.AVLExample;
import example.datastructures.nonlinear.BSTExample;

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

        System.out.println("BST Example:");
        BSTExample bstExample = new BSTExample();
        bstExample.demo();

        System.out.println("\nAVL Example:");
        AVLExample avlExample = new AVLExample();
        avlExample.demo();
    }
}
