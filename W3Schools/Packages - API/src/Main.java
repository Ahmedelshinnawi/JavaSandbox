/*
      Built-in Packages
      The Java API is a library of pre-written classes, that are free to use,
      included in the Java Development Environment.

      The library contains components for managing input, database programming,
      and much, much more

      The library is divided into packages and classes. Meaning you can either import
      a single class (along with its methods and attributes), or a whole package that contain
      all the classes that belong to the specified package.

      To use a class or a package from the library, you need to use the import keyword:
       */
        /*
        Import a Class
        */
import java.util.Scanner;
//  In the example above, java.util is a package, while Scanner is a class of the java.util package.

public class Main {
    public static void main(String[] args) {
        // To use the Scanner class, create an object of the class and use any of the available methods
        // found in the Scanner class documentation. we will use the nextLine() method, which is used to read a complete line
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");

        String userName = scanner.nextLine();
        System.out.println("Username is: " + userName);
    }
}