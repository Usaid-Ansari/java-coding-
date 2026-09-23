public class Pattern5 {
    public static void main(String[] args) {
        star(5);
    }

    static void star(int n){
        for(int row = 1; row <= n; row++){

            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}