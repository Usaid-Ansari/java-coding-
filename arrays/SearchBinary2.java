package arrays;

public class SearchBinary2{
    public static void main(String[] args) {
      int[] arr = {2, 5, 8, 12, 16, 23, 38, 56};
      int target = 23;
      int ans = searchbianry(arr, target);
      System.out.println(ans);
    }
    
    static int searchbianry(int arr[], int target){

        int start = 0;
        int end = arr.length - 1; // 7 
        while(start <= end) { // (0<7==true)
            int mid = start + (end - start) / 2; // 3
            if(target == arr[mid]){ // (23==12 =false)
                return mid;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            }
        }
        return - 1 ;
    }
}