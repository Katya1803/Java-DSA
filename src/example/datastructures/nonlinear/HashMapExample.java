package example.datastructures.nonlinear;

import datastructures.nonlinear.hash.HashMap;

public class HashMapExample {
    public void demo() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        System.out.println("HashMap elements:");
        for (int i = 1; i <= map.size(); i++) {
            System.out.println("Key: " + i + ", Value: " + map.get(i));
        }

        System.out.println("\nContains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));

        System.out.println("\nRemoving key 2");
        map.remove(2);

        System.out.println("HashMap after removal:");
        for (int i = 1; i <= map.size(); i++) {
            System.out.println("Key: " + i + ", Value: " + map.get(i));
        }
    }
}
