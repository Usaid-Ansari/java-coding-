//Find unique element in an array
public class Problem1{
    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 4, 2, 6, 4};
        int uniqueElement = findUnique(arr);
        System.out.println("Unique Element is : " +  uniqueElement);
    }

    static int findUnique(int[] arr){
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }

        return unique;
    }
}