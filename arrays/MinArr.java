package arrays;

public class MinArr {

    public static void main(String[] args) {
        int arr[] = {11, 20, 21, -5, 3};
        int result = MinimumElement(arr);
        //int min = arr[0]; 

        // for (int i = 1; i < arr.length; i++) {
        //     if(arr[i] < min){ // 11 -5 
        //        min = arr[i];
        //     }
        // }
        // System.out.println(min);
        System.out.println(result);
    }

    static int MinimumElement(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i]; 
            }
        }
        return min;
    }
}