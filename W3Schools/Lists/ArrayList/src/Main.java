/*
Java ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
 */

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections; // Import the Collections class

public class Main{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Ford");
        System.out.println(cars);

        // You can also add an item at a specified position by referring to the index number:
        cars.add(2,"Toyota");
        System.out.println(cars);

        // Access an Item (get() method)
        System.out.println(cars.get(3));

        // Remove an Item (remove() method)
        cars.remove(1);
        System.out.println(cars);

        // To remove all the elements in the ArrayList, use the clear() method
        // cars.clear();

        // ArrayList Size (size() method)
        System.out.println(cars.size());


        // Loop Through an ArrayList
        // For Loop
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("-----------------");
        // For-Each Loop
        for(String car : cars){
            System.out.println(car);
        }

        /*
        Other Types
        Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String".
        Remember that a String in Java is an object (not a primitive type). To use other types, such as int,
        you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean,
        Character for char, Double for double.
         */

        // Create an ArrayList to store numbers (add elements of type Integer)
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(4);
        myNumbers.add(1);
        myNumbers.add(10);
        myNumbers.add(7);
        myNumbers.add(13);

        for (int number : myNumbers){
            System.out.println(number);
        }

        // Sort an ArrayList

        // Sort an ArrayList of Strings
        Collections.sort(cars); // Sort cars
        for(String car : cars){
            System.out.println(car);
        }


        // Sort an ArrayList of Integers
        Collections.sort(myNumbers);

        for(int number : myNumbers){
            System.out.println(number);
        }

    }
}
