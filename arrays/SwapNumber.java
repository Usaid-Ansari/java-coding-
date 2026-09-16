package arrays;
import java.util.Arrays;
public class SwapNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 90, 60};
        SwapNumber(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void SwapNumber(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
