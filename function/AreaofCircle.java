import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Radius: ");
        int radius = in.nextInt();
        double ans = AreaofCircle(radius);
        System.out.println(ans);

    }

    static double AreaofCircle(int radius) {
        double pi = 3.14;
        double ans = pi * radius * radius;
        return ans;
    }

}
