package emailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Prompt user for last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Create an Email object using the inputted first and last names
        Email em1 = new Email(firstName, lastName);

      
        
        // Close the scanner
        scanner.close();
    }
}
