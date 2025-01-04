/*
Java Sort a List
Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tesla");

        // Sort an ArrayList of Strings alphabetically in ascending order
        Collections.sort(cars);

        for (String car : cars) {
            System.out.println(car);
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(4);
        numbers.add(13);
        numbers.add(10);
        numbers.add(1);

        // Sort an ArrayList of Integers numerically in ascending order
        Collections.sort(numbers);
        for(int number : numbers) {
            System.out.println(number);
        }

        // Reverse the Order
        // You can also sort a list in reverse order, by using the reverseOrder() method
        System.out.println("----------------------------------");
        Collections.sort(numbers, Collections.reverseOrder());
        for(int number : numbers) {
            System.out.println(number);
        }
    }
}