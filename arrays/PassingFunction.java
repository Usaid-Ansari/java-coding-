package arrays;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] nums){
        nums[1] = 99;
        nums[0] = 88;
        nums[2] = 95;
    }

}
