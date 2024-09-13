package algorithms.sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        //arr = [24, 27 , 35 , 4, 2, 17, 46, 64, 19]
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int pos = i - 1;
            while (pos >= 0 && arr[pos] > key){
                arr[pos+1] = arr[pos];
                pos--;
            }
            arr[pos+1] = key;
        }
    }

    public static void demo() {
        int[] arr = SortUtils.generateRandomArray(10000);
        SortUtils.measureExecutionTime(() -> insertionSort(arr), "Insertion Sort");
        // Uncomment để in kết quả nếu cần
        // SortUtils.printArray(arr);
    }
}
