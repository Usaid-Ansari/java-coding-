import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Take input from user till user does not press X or x
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            // Take the operator as input
            System.out.print("Enter the Operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two number
                System.out.print("Enter two Numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                } else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("Invalid operation");
                }
                
            }
            System.out.println(ans);
        
        }
    }
}