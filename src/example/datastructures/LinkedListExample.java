package example.datastructures;

import datastructures.linear.LinkedList;

public class LinkedListExample {
    public void demo() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        System.out.println("LinkedList: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        linkedList.insert(1, "JavaScript");
        System.out.println("After insert:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        linkedList.remove(2);
        System.out.println("After remove:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
