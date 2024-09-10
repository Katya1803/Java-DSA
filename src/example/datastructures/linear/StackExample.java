package example.datastructures.linear;

import datastructures.linear.Stack;

public class StackExample {
    public void demo() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushes: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        stack.push(100);
        stack.push(200);
        System.out.println("Peek after two pushes: " + stack.peek());

        stack.pop();
        System.out.println("Peek after pop: " + stack.peek());
    }
}
