/*
The Comparable Interface
The Comparable interface allows an object to specify its own sorting rule with a compareTo() method.

The compareTo() method takes an object as an argument and compares the comparable with the argument to decide which one should go first in a list.

Like the comparator, the compareTo() method returns a number which is:

Negative if the comparable should go first in a list.
Positive if the other object should go first in a list.
Zero if the order does not matter.
 */

import java.util.ArrayList;
import java.util.Collections;

// Define a Car class which is comparable
class Car implements Comparable {
    String brand;
    String model;
    int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    // Decide how this object compares to other objects
    public int compareTo(Object obj) {
        Car other = (Car) obj;
        if (year < other.year) return -1; // This object is smaller than the other one
        if (year > other.year) return 1; // This object is larger than the other one
        return 0; // Both objects are the same
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a list of cars
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 2015));
        myCars.add(new Car("Mercedes", "E180", 2020));
        myCars.add(new Car("Toyota", "Corolla", 2016));

        // Sort the cars
        Collections.sort(myCars);

        // Display the cars
        for (Car car : myCars) {
            System.out.println(car.brand + " " + car.model + " " + car.year);
        }
    }
}