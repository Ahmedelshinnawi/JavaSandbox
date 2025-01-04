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
/*
Java Classes and Objects
Java is an object-oriented programming language.
A Class is like an object constructor, or a "blueprint" for creating objects.
 */
// To create a class, use the keyword class:
public class Main {
    int x = 5;

    // Static vs. Public Methods
    // static method, which means that it can be accessed without creating an object of the class,
    // unlike public, which can only be accessed by objects:

    // Static Method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public Method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }


    // Access Methods With an Object
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    public void speed (int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }

//    Java Constructors
//    A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

    // Create a class constructor for the Main class
    int y;
    public Main(){
        y = 5; // Set the initial value for the class attribute y
    }

    /*
   Encapsulation
   Get and Set
     */
    public static class Person{
        private String name; // private = restricted access

        // Getter
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

    }


    // Main Method
    public static void main(String[] args) {
        // Create an Object
        // In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.
        //To create an object of Main, specify the class name, followed by the object name, and use the keyword new:
        Main myObj = new Main();
        System.out.println(myObj.x);

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        myObj.myPublicMethod(); // Call the public method on the object

        // Inside main, call the methods on the myCar object
        Main Car = new Main();
        Car.fullThrottle();
        Car.speed (100);

        Main myObj2 = new Main(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj2.x); // Print the value of x

        Person person = new Person();
        person.setName("Ahmed");
        System.out.println(person.getName());

        // To use the Scanner class, create an object of the class and use any of the available methods
        // found in the Scanner class documentation. we will use the nextLine() method, which is used to read a complete line
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");

        String userName = scanner.nextLine();
        System.out.println("Username is: " + userName);



    }
}