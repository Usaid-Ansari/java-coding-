import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
         * Synatx of for loops:
         * 
         * for(initialisation; consition; increment/decrement) {
         * // body
         * }
         */
        /* Q: print a number 1 to 5 */
        // for(int num=1; num<=5; num+=2){
        // System.out.println(num);
        // }
        /* Q: print a Number from 1 to N */
        // Scanner in = new Scanner(System.in);
        // System.out.print("Eneter a Number: ");
        // int n = in.nextInt();

        // for (int num = 1; num <= n; num++) {
        // System.out.print(num + " ");
        // // System.out.println("Hello Hammad" );
        // }

        /* While Loops */
        // int num = 1;
        // while (num <= 5) {
        // System.out.println(num);
        // num += 1;
        // }

        /* do while loop */

        int n = 1;
        do {
            System.out.println(n);
        } while (n == 5);
    }

}