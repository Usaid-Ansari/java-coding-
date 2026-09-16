import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        // String fruit = in.next();

        // switch (fruit) {
        // case "Mango":
        // System.out.println("The king of Fruit");
        // break;
        // case "Apple":
        // System.out.println("This is red");
        // break;
        // default:
        // System.out.println("Not like fruit");
        // }

        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("None of the above");
        }
    }
}
