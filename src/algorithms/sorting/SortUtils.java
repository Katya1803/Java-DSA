package algorithms.sorting;

import java.util.Random;

public class SortUtils {
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size); // Giá trị ngẫu nhiên từ 0 đến size
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void measureExecutionTime(Runnable sortAlgorithm, String algorithmName) {
        long startTime = System.nanoTime();
        sortAlgorithm.run();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Tính thời gian bằng milliseconds
        System.out.println(algorithmName + " executed in: " + duration + " ms");
    }
}
