/*
Java LinkedList
The LinkedList class is almost identical to the ArrayList
 */

import java.util.LinkedList; // Import the LinkedList class

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Honda");
        cars.add("Mercedes");
        System.out.println(cars);

    /*
    ArrayList vs. LinkedList
    The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

    The LinkedList class has all the same methods as the ArrayList class because they both implement the List interface.
    This means that you can add items, change items, remove items and clear the list in the same way.
    However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.

    How the ArrayList works
    The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough,
    a new, larger array is created to replace the old one and the old one is removed.

    How the LinkedList works
    The LinkedList stores its items in "containers." The list has a link to the first container and each container
    has a link to the next container in the list. To add an element to the list, the element is placed into a new container
    and that container is linked to one of the other containers in the list.
     */

        // LinkedList Methods
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        cars.removeFirst();
        System.out.println(cars);
        cars.removeLast();
        System.out.println(cars);
   }
}