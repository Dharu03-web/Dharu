import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        // Define a string array with names
        String[] names = {"Dharneesh", "Ketan", "Prem", "Bala", "Charen", "Dinesh", "Harshi"};

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name to search for
        System.out.print("Enter a name to search: ");
        String searchName = scanner.nextLine();

        // Perform the search operation
        boolean found = false;
        for (String name : names) {
            if (name.equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println(searchName + " is found in the array.");
        } else {
            System.out.println(searchName + " is not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
