public class Pattern11 {
    public static void main(String[] args) {
        Traingle(9);
    }

    static void Traingle(int n) {
        for (int i = 5; i >= 1; i--) {
            for (int space = n; space > i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}