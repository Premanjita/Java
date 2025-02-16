import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
