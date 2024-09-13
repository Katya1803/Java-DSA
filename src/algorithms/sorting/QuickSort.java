package algorithms.sorting;

public class QuickSort {
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);  // Sắp xếp các phần tử bên trái pivot
            quickSort(arr, pivotIndex + 1, high); // Sắp xếp các phần tử bên phải pivot
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Chọn phần tử cuối cùng làm pivot
        int i = low - 1;  // Chỉ số của phần tử nhỏ hơn pivot

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);  // Đưa phần tử nhỏ hơn pivot về phía bên trái
            }
        }

        // Đưa pivot về vị trí chính xác
        swap(arr, i + 1, high);

        return i + 1;  // Trả về chỉ số của pivot
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void demo() {
        int[] arr = SortUtils.generateRandomArray(10000);
        SortUtils.measureExecutionTime(() -> quickSort(arr), "Quick Sort");
        // Uncomment để in kết quả nếu cần
        // SortUtils.printArray(arr);
    }
}
