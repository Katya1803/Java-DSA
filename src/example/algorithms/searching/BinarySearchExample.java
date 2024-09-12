package example.algorithms.searching;

import algorithms.searching.BinarySearch;

public class BinarySearchExample {
    public static void demo() {
        int[] arr = {10, 20, 30, 40, 50};  // Mảng phải được sắp xếp
        int target = 40;

        int result = BinarySearch.search(arr, target);

        if (result != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Phần tử " + target + " không có trong mảng");
        }
    }
}
