import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a radius : ");
        int radius = in.nextInt();
        double pi = 3.14;
        // Area Of Circle  =  Pi * radius * raduis 
        System.out.println("The Area of Circle is: "+ pi * radius *radius);  
    }
}
