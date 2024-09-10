package example.datastructures.linear;

import datastructures.linear.ArrayList;

public class ArrayListExample {
    public void demo() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        System.out.println("ArrayList: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.insert(1, "JavaScript");
        System.out.println("After insert:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(2);
        System.out.println("After remove:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
