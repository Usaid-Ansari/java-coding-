package arrays;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class CountEvenDigit {
    public static void main(String[] args) {
    int[] nums = {12,345,2,6,7896};
    //  System.out.println(findNumbers(nums));

    System.out.println(digits2(-345678));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    //Function to check the number is given to even and odd
    static boolean even(int nums){
        int numberofDigits = digits(nums);
        // if(numberofDigits % 2 == 0) {
        //     return  true;
        // }
        // return false;

        return numberofDigits % 2 == 0;
    }
    
    static int digits2(int nums){
         if(nums < 0){
            nums = nums * -1;
        }

        return (int)(Math.log10(nums)) + 1;
    }

    static int digits(int nums){
        if(nums < 0){
            nums = nums * -1;
        }

        if(nums == 0){
            return 1;
        }

        int count = 0;
        while (nums > 0) {
            count++;
            nums /= 10;
        }
        return count;
    }
    
}
