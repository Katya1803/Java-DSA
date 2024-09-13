package algorithms.sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void demo() {
        int[] arr = SortUtils.generateRandomArray(10000);
        SortUtils.measureExecutionTime(() -> selectionSort(arr), "Selection Sort");
        // Uncomment để in kết quả nếu cần
        // SortUtils.printArray(arr);
    }
}
