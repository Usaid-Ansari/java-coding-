package arrays;

public class MulArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 10, 20};
        int result = MultipleofArray(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     ans *= arr[i]; // ans = ans * arr[i];
        // }
        // System.out.println(ans);
        System.out.println(result);
    }

    static int MultipleofArray(int arr[]){
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            ans *= arr[i];
        }
        return ans;
    }
}
