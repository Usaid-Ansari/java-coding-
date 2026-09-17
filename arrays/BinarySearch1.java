package arrays;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = { -21, 5, 6, 8, 41, 52, 83, 92, 95, 100 };
        int target = 95;
        int ans = binarySearch(arr, target);
        System.out.println("The target index is : " + ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2; //
            if(target == arr[mid]){
                return mid;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } 

        }
        return -1;
    }

}
