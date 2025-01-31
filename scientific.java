import java.util.Scanner;
import java.lang.Math;

public class scientific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Exit");
            int choice = sc.nextInt();

            if (choice == 10) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers:");
                    double a1 = sc.nextDouble();
                    double b1 = sc.nextDouble();
                    System.out.println("Result: " + (a1 + b1));
                    break;
                case 2:
                    System.out.println("Enter two numbers:");
                    double a2 = sc.nextDouble();
                    double b2 = sc.nextDouble();
                    System.out.println("Result: " + (a2 - b2));
                    break;
                case 3:
                    System.out.println("Enter two numbers:");
                    double a3 = sc.nextDouble();
                    double b3 = sc.nextDouble();
                    System.out.println("Result: " + (a3 * b3));
                    break;
                case 4:
                    System.out.println("Enter two numbers:");
                    double a4 = sc.nextDouble();
                    double b4 = sc.nextDouble();
                    if (b4 != 0) {
                        System.out.println("Result: " + (a4 / b4));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                case 5:
                    System.out.println("Enter a number:");
                    double a5 = sc.nextDouble();
                    System.out.println("Result: " + Math.sqrt(a5));
                    break;
                case 6:
                    System.out.println("Enter the base and exponent:");
                    double base = sc.nextDouble();
                    double exponent = sc.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                    break;
                case 7:
                    System.out.println("Enter an angle in degrees:");
                    double angle1 = sc.nextDouble();
                    System.out.println("Result: " + Math.sin(Math.toRadians(angle1)));
                    break;
                case 8:
                    System.out.println("Enter an angle in degrees:");
                    double angle2 = sc.nextDouble();
                    System.out.println("Result: " + Math.cos(Math.toRadians(angle2)));
                    break;
                case 9:
                    System.out.println("Enter an angle in degrees:");
                    double angle3 = sc.nextDouble();
                    System.out.println("Result: " + Math.tan(Math.toRadians(angle3)));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
