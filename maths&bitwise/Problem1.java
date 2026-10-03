//Find unique element in an array
public class Problem1 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 3, 4, 2, 6, 4 };
        int uniqueElement = findUnique(arr);
        System.out.println("Unique Element is : " + uniqueElement);
    }

    static int findUnique(int[] arr) {
        int unique = 0;
        //Linear Search Approach
        // int target = 6;
        // for (int i = 0; i < arr.length; i++) {

        //     if (target == arr[i]) {
        //         return target;
        //     }
        // }
        // return -1;

        for (int n : arr) {
        unique ^= n;
        }

        return unique;
    }
}