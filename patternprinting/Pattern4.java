
public class Pattern4 {

    public static void main(String[] args) {
        star4(5);
    }
    static void star4(int n){
        for(int row = 1; row <= n; row++){

            for(int col = 1; col <= row; col++){
                System.out.print(col + " "); // 1 next line 1 2 next line 1 2 3 next line 1 2 3 4 next line 1 2 3 4 5
            }
            System.out.println();
        }
    }

}