package arrays;

public class FirstOccurence {
    public static void main(String[] args) {

        //Find First Occurrence
        int[] arr = { 2, 4, 4, 4, 7, 9, 12 };
        int target = 4;
        int ans = occurenceFind(arr, target);
        System.out.println(ans);

    }

    static public int occurenceFind(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int sum = -1;

        while (start <= end) { // (0 <= 6)
            int mid = start + (end - start) / 2; // 3 //1
            if (target == arr[mid]) { // 4 //
                sum = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }

        return sum;

    }

}