/*
Java HashSet
A HashSet is a collection of items where every item is unique, and it is found in the java.util package
 */

import java.util.HashMap;
import java.util.HashSet; // Import the HashSet class

public class Main {
    public static void main(String[] args) {
        HashSet<String> brands = new HashSet<String>();

        // Add items (add() method)
        brands.add("Gucci");
        brands.add("Zara");
        brands.add("Nike");
        brands.add("CAT");
        brands.add("American Eagle");
        brands.add("Zara");
        System.out.println(brands);
        // even though Zara is added twice it only appears once in the set because every item in a set has to be unique.

        // Check If an Item Exists (contains() method)
        System.out.println(brands.contains("Nike"));

        // Remove an Item (remove() method)
        brands.remove("American Eagle");
        System.out.println(brands);

        // HashSet Size (size() method)
        System.out.println(brands.size());

        // Loop Through a HashSet
        for (String brand : brands) {
            System.out.println(brand);
        }

        // Other Types

        // Create a HashSet object called ages
        HashSet<Integer> ages = new HashSet<Integer>();

        // Add values to the set
        ages.add(64);
        ages.add(48);
        ages.add(23);
        ages.add(21);

        // Get the Max Age in the set
        int maxAge = 0;
        for(int age : ages) {
            if(age > maxAge) {
                maxAge = age;
            }
        }
        System.out.println(maxAge);

    }
}