public class Pattern7{
    public static void main(String[] args) {
        number(5);
    }

    static void number(int n) {
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}