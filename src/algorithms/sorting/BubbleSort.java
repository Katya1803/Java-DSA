package algorithms.sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length -1;
        boolean swapped;
        for (int i = 0; i <= n; i++){
            swapped = false;
            for (int j = 0; j < n - i; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[i];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void demo() {
        int[] arr = SortUtils.generateRandomArray(10000);
        SortUtils.measureExecutionTime(() -> bubbleSort(arr), "Bubble Sort");
        // Uncomment để in kết quả nếu cần
        // SortUtils.printArray(arr);
    }
}
