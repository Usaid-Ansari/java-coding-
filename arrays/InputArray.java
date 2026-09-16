package arrays;

import java.util.Scanner;

public class InputArray {

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        // Input
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("provide value for row = " + i + "provide value for column = " + j);
                arr[i][j] = in.nextInt();
            }
        }

        // Output
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}