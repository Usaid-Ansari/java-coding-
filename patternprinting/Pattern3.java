
public class Pattern3 {
    public static void main(String[] args) {
        star3(5);
    }

    static void star3(int n) {
        // for(int row = n; row >= 1; row--){

        // for(int col = 1; col <= row ; col++){

        // System.out.print("* "); //* * * * *

        // }
        // System.out.println();
        // }
        // }

        // One another method to print the same pattern

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}