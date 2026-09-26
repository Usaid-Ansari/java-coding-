public class Pattern9 {
    public static void main(String[] args) {
        traingle(5);
    }
    static void traingle(int n){
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n - i + 1 ; j++) { 
                System.out.print(" "); 
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
