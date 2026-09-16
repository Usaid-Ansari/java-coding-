package arrays;

public class MaxArr {
    public static void main(String[] args) {
        int arr[] = {1, 3, 10, 5, 21};
        // int max = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if(arr[i] > max) {
        //         max = arr[i]; //3 10 21
        //     }
        // }
        // System.out.println(max);
        int result = MaximumNumber(arr);

        System.out.println("Maximum Number is " + result);

    }
    static int MaximumNumber(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
