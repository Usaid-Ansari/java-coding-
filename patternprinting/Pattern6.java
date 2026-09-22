
public class Pattern6{
    public static void main(String[] args) {
        number6(5);
    }
    
    static void number6(int n) {
        for(int row = 1; row <= n; row++){

            for (int col = 1; col <= n - row + 1  ; col++){
                System.out.print(col + " ");
            }
            
            System.out.println();
        }
    }
}
