import java.util.Scanner;

public class AreaofTraingle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        int base = in.nextInt();
        System.out.print("Enter the height: ");
        int heigth = in.nextInt();
        int area = base * heigth;
        float AreaofTraingle = area / 2;
        System.out.println("The Area Of Traingle is: "+ AreaofTraingle); 


    }
}
