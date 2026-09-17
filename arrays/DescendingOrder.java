package arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {90, 80, 60, 52, 40, 10};
        int target = 40;
        int ans = descendingOrder(arr, target);
        System.out.println(ans);
    }

    static int descendingOrder(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find array is ascending and descending
        boolean isAsc = arr[start] < arr[end]; // 90 < 10 false
        
        while(start <= end) {
            int mid = start + (end - start) / 2; // 2 ,3 , 4

            if(arr[mid] == target){ // 60 == 40 false , 52 == 40 false, 40 == 40 true
                return mid; //40
            }
            if(isAsc){     // if array is Ascending so Execute this part
                if(target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]){ //40 > 60 = false
                    start = mid + 1;
                }
            } else{  // If array is Descending so execute this
                if(target > arr[mid]) { // 40 > 60 false
                    end = mid - 1;
                } else if(target < arr[mid]) { // 40 < 60 true
                   start = mid + 1; // 3
                }
            }
        }
        return -1;

    }
}
