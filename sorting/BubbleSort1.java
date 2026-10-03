import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean Swap;
        // run the step n-1 time
        for (int i = 0; i < arr.length; i++) {
            Swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                // swap if item is smaller than previous item
                if (arr[j] < arr[j - 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    Swap = true;
                }
            }
            // The array is sorted stop the program
            if (!Swap) {
                break;
            }
        }

    }
}