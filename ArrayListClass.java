import java.util.*;

public class ArrayListClass {
    // Private members: numbers will store the inputted integers, and console is used for user input.
    private ArrayList<Integer> numbers;
    private Scanner console;

    // Constructor: initializes the ArrayList and Scanner objects.
    public ArrayListClass() {
        numbers = new ArrayList<Integer>();  // Initialize ArrayList to store integers.
        console = new Scanner(System.in);    // Initialize Scanner for console input.
    }

    // Method to display the menu options to the user.
    public void Display_Menu() {
        System.out.println("*****************************");
        System.out.println("Main Menu");
        System.out.println("0 - Quit");                 // Option 0 to quit the program.
        System.out.println("1 - Input Numbers");        // Option 1 to input numbers into the ArrayList.
        System.out.println("2 - Display Numbers");      // Option 2 to display all the numbers in the ArrayList.
        System.out.println("3 - Search Numbers");       // Option 3 to search for a specific number.
        System.out.println("4 - Delete Numbers");       // Option 4 to clear all numbers from the ArrayList.
        System.out.println("*****************************");
    }

    // Method to input a list of numbers from the user.
    public void Input_Numbers() {
        System.out.println("Input Numbers: ");
        int size, num;
        System.out.print("How many numbers will you input? ");  // Ask the user how many numbers they want to input.
        size = console.nextInt();  // Get the size (number of inputs).
        
        // Loop to input each number.
        for (int i = 0; i < size; i++) {
            System.out.print("Input Number " + (i + 1) + ": ");  // Prompt user for the next number.
            num = console.nextInt();  // Store the user's input.
            this.numbers.add(num);    // Add the number to the ArrayList.
        }
        System.out.println("*****************************");
    }

    // Method to display all numbers stored in the ArrayList.
    public void Display_Numbers() {
        System.out.println("Display Numbers");
        
        // Enhanced for-loop to iterate over all elements in the ArrayList.
        for (int number : numbers) {
            System.out.println(number);  // Print each number.
        }
        System.out.println("*****************************");
    }

    // Method to search for a specific number entered by the user.
    public void Search_Numbers() {
        System.out.println("Search Numbers");
        System.out.print("What number do you want to search for? ");
        int item = console.nextInt();  // Get the number the user wants to search for.
        
        int index = numbers.indexOf(item);  // Use indexOf to find the position of the number (returns -1 if not found).
        
        // If the number is found, display its position.
        if (index != -1) {
            System.out.println(item + " was found at position " + index);
        } else {
            // If the number is not found, inform the user.
            System.out.println("The number that you entered was not found");
        }
        System.out.println("*****************************");
    }

    // Method to clear all numbers from the ArrayList.
    public void Delete_Numbers() {
        numbers.clear();  // Clear the ArrayList.
        System.out.println("All numbers have been deleted");  // Inform the user that all numbers are deleted (BOOPO)
    }

    // Main method: entry point of the program.
    public static void main(String[] args) {
        ArrayListClass app = new ArrayListClass();  // Create an instance of the ArrayListClass.
        int choice;  // Variable to store the user's choice.
        
        // Do-while loop to keep showing the menu until the user chooses to quit (choice 0).
        do {
            app.Display_Menu();  // Display the menu options.
            System.out.print("Enter your choice: ");
            choice = app.console.nextInt();  // Get the user's choice.
            
            // Switch case to handle user's choice.
            switch (choice) {
                case 1:
                    app.Input_Numbers();  // Call the method to input numbers.
                    break;
                case 2:
                    app.Display_Numbers();  // Call the method to display the numbers.
                    break;
                case 3:
                    app.Search_Numbers();  // Call the method to search for a number.
                    break;
                case 4:
                    app.Delete_Numbers();  // Call the method to delete all numbers AHHHH
                    break;
                case 0:
                    System.out.println("Thank you for joining TimTim's Java Castle!");  // Exit message.
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");  // Handle invalid input.
            }
        } while (choice != 0);  // Continue showing the menu until the user enters 0 (to quit).
    }
}
