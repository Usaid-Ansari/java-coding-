package arrays;

public class SumArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int FinalSum = SumofArray(arr);
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i]; //
        // }
        // System.out.println(sum);
        //
        System.out.println(FinalSum);

    }
    static int SumofArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }
}