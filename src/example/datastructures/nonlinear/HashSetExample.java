package example.datastructures.nonlinear;

import datastructures.nonlinear.hash.HashSet;

public class HashSetExample {
    public void demo() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");  // Thêm phần tử trùng lặp

        System.out.println("HashSet elements:");
        for (String fruit : new String[]{"Apple", "Banana", "Orange"}) {
            if (set.contains(fruit)) {
                System.out.println(fruit);
            }
        }

        System.out.println("\nContains 'Banana'? " + set.contains("Banana"));

        System.out.println("\nRemoving 'Orange'");
        set.remove("Orange");

        System.out.println("HashSet after removal:");
        for (String fruit : new String[]{"Apple", "Banana", "Orange"}) {
            if (set.contains(fruit)) {
                System.out.println(fruit);
            }
        }
    }
}
