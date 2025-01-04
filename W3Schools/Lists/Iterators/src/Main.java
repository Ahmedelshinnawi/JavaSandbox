/*
Java Iterator
An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.
To use an Iterator, you must import it from the java.util package.
 */

// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> brands = new ArrayList<String>();
        brands.add("Nike");
        brands.add("Gucci");
        brands.add("American Eagle");
        brands.add("Zara");

        // Get the iterator
        Iterator<String> iterator = brands.iterator();

        // Print the first item
        System.out.println(iterator.next());

        /*
        Looping Through a Collection
        To loop through a collection, use the hasNext() and next() methods of the Iterator:
         */
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*
        Removing Items from a Collection
        Iterators are designed to easily change the collections that they loop through. The remove() method can remove items from a collection while looping.
         */
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       numbers.add(1);
       numbers.add(4);
       numbers.add(7);
       numbers.add(10);

       Iterator<Integer> iterator2 = numbers.iterator();
       while (iterator2.hasNext()){
           if (iterator2.next() == 10){
               iterator2.remove();
           }
       }
       System.out.println(numbers);
    }

}