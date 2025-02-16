import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        
        // Create an empty string to store the reversed version
        String reversed = "";
        
        // Loop through the original string in reverse order and build the reversed string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
        
        // Close the scanner
        scanner.close();
    }
}
