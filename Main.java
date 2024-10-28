import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 to Add, 2 to Subtract, 3 to Multiply, 4 to Divide: ");
        int operation = scanner.nextInt();
        // รับค่าตัวเลขแรก
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // รับค่าตัวเลขที่สอง
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

    
        switch (operation) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Error");
                break;
        }

        scanner.close();
    }
}
