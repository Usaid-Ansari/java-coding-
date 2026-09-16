package arrays;

public class NumberRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 8};
        int target = 18;
        System.out.println(SearchinArray(arr, target, 1, 4));
    }
       // Find the target In the given Range
    static int SearchinArray(int[] arr, int target, int start, int end) {
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end; index++) {
            //check for every element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    } 
}
