import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Usaid");
                break;
            case 2:
                System.out.println("Salman");
                break;
            case 3:
                System.out.println("Enter the EmpID Number");
                switch (department) {
                    case "CS":
                        System.out.println("CS Department");
                        break;
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    default:
                        System.out.println("Not Enter Any Department");
                }
                break;
            default:
                System.out.println("Enter the Correct empID");
        }
    }
}
