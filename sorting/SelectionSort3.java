import java.util.Arrays;

public class SelectionSort3 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        sortTheArr(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    static void sortTheArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int lastIndex = arr.length - i - 1;
            int maximumIndex = maxIndex(arr, 0, lastIndex);
            swapArray(arr, lastIndex, maximumIndex);
        }
    }

    static void swapArray(int[] arr, int first, int Last) {
        int temp = arr[first];
        arr[first] = arr[Last];
        arr[Last] = temp;
    }

    static int maxIndex(int[] arr, int start, int end) {
        int maxElement = start;
        for (int i = start; i <= end; i++) {
            if (arr[maxElement] < arr[i]) {
                maxElement = i;
            }
        }
        return maxElement;
    }

}