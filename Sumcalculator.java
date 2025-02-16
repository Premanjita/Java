import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking first number as input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        // Taking second number as input
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Calculating the sum
        int sum = num1 + num2;
        
        // Printing the sum
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Closing the scanner
        scanner.close();
    }
}
