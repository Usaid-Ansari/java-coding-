import java.util.Scanner;

/*Q: Find the largest Number */
public class LargeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = in.nextInt();
        System.out.println("Enter Second Number: ");
        int b = in.nextInt();
        System.out.println("Enter Third Number: ");
        int c = in.nextInt();

        // int max = a;

        // if (b > max) {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        
        // }

        int max = Math.max(c,Math.max(a, b));
        System.out.println("The Maximum number is: " + max);

    }
}
