package arrays;
// https://leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth {
    public static void main(String[] args) {
       int[][]  accounts = {{1,5},{7,3},{3,5}};
       System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            //When you start a new column , take a new sum for tha row 

            int sum = 0;

            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;

    }
}
