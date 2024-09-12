package example.algorithms.searching;

import algorithms.searching.LinearSearch;

public class LinearSearchExample {
    public static void demo() {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int result = LinearSearch.search(arr, target);

        if (result != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Phần tử " + target + " không có trong mảng");
        }
    }
}
