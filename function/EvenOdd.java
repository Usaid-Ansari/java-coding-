import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = in.nextInt(); 
        boolean ans = EvenoddCheck(n);
        System.out.println(ans);
    }
    static boolean EvenoddCheck(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
