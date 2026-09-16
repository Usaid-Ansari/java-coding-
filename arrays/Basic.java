package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        // Array of primative

        // for(int i = 0; i < arr.length; i++){
        // arr[i] = in.nextInt(); //Take input from user Ex: 10 20 30 40 50
        // }

        // System.out.println(Arrays.toString(arr));
        // for(int i = 0; i < arr.length; i++){
        // System.out.println(arr[i] + " "); // print the array based on indexing
        // }
        // For Each loop
        // for(int num : arr) {
        // System.out.println(num + " ");
        // }

        // array of object
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // modify
        System.out.println("After a modify");
        str[1] = "Usaid";

        System.out.println(Arrays.toString(str));
    }
}
