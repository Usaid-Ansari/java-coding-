package arrays;

public class Target {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 14, 21, 25};
        int target = 21;
        int result = targetFind(arr, target);
        System.out.println(result);
    }
    static int targetFind(int arr[], int target) {
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
