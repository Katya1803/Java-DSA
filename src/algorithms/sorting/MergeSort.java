package algorithms.sorting;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // Nếu mảng có ít hơn 2 phần tử, không cần chia nữa
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Chia mảng thành 2 phần
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left); // Đệ quy cho mảng con bên trái
        mergeSort(right); // Đệ quy cho mảng con bên phải

        merge(arr, left, right); // Hợp nhất các mảng
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Hợp nhất các phần tử của mảng left và right vào mảng arr
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Sao chép các phần tử còn lại của mảng left (nếu có)
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Sao chép các phần tử còn lại của mảng right (nếu có)
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void demo() {
        int[] arr = SortUtils.generateRandomArray(10000);
        SortUtils.measureExecutionTime(() -> mergeSort(arr), "Merge Sort");
        // Uncomment để in kết quả nếu cần
        // SortUtils.printArray(arr);
    }
}
