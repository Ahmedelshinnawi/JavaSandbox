/*
Java User Input
The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:
 */
import java.util.Scanner; // Import the Scanner class
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter Username");

        String username = scanner.nextLine(); // Read user input
        System.out.println("Username is: " + username);

        // different methods to read data of various types:
        System.out.println("Enter name, age and salary");

        // String input
        String name = scanner.nextLine();

        // Numerical input
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();

        // Output user's input
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age + " years old");
        System.out.println("Salary is: " + salary + "$");

    }
}