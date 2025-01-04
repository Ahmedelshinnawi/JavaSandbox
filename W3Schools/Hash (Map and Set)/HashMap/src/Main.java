/*
Java HashMap
A HashMap, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:
 */

import java.util.HashMap; // import the HashMap class

public class Main {
    public static void main(String[] args) {
       // Create a HashMap object called capitalCities that will store String keys and String values:
        HashMap<String, String> capitalCites = new HashMap<String, String>();

        // Add Items (put() method)
        capitalCites.put("Egypt", "Cairo");
        capitalCites.put("Germany", "Berlin");
        capitalCites.put("USA", "Washington DC");
        capitalCites.put("Syria", "Damascus");
        capitalCites.put("Lebanon", "Beirut");
        System.out.println(capitalCites);

        // Access an Item (get() method)
        System.out.println(capitalCites.get("Egypt"));

        // Remove an Item (remove() method)
        capitalCites.remove("Germany");
        System.out.println(capitalCites);

        // HashMap Size (size() method)
        System.out.println(capitalCites.size());

        // Loop Through a HashMap

        // For-Each Loop
        // Print keys
        for (String key : capitalCites.keySet()) {
            System.out.println(key);
        }
        // Print values
        for(String capital : capitalCites.values()){
            System.out.println(capital);
        }
        // Print keys and values
        for(String country : capitalCites.keySet()){
            System.out.println("Key: " + country + ", value: " + capitalCites.get(country));
        }

        // Other Types
        // Create a HashMap object called Students that will store String keys and Integer values

        // Create a HashMap object called people
        HashMap<String, Integer> students = new HashMap<String, Integer>();

        // Add keys and values (Name, Grade)
        students.put("Ahmed", 4);
        students.put("Mohammed", 2);
        students.put("Ali", 1);
        students.put("Omar", 3);

        for (String student : students.keySet()){
            System.out.println("Name: " + student + ", Grade: " + students.get(student));
        }




    }
}