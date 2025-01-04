/*
Another way to achieve abstraction in Java, is with interfaces.

An interface is a completely "abstract class" that is used to group related methods with empty bodies.
 */

// interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}
/*
To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:
 */
// Dog "implements" the Animal interface
class Dog implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The dog says: how how");
    }
    public void sleep(){
        System.out.println("Zzz");
    }
}

/*
Notes on Interfaces:
Like abstract classes, interfaces cannot be used to create objects
(in the example above, it is not possible to create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
However, it can be achieved with interfaces, because the class can implement multiple interfaces.
Note: To implement multiple interfaces, separate them with a comma .
 */

// Multiple Interfaces
interface FirstInerface {
    public void myMethod(); // interface method
}

interface SecondInerface {
    public void myMethod(); // interface method
}

class DemoClass implements FirstInerface, SecondInerface {
    public void myMethod() {
        System.out.println("My First Interface Text...");
    }

    public void myMethod2() {
        System.out.println("My Second Interface Text...");
    }
}


class Main{
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Dog object
        myDog.animalSound();
        myDog.sleep();

        DemoClass myDemoClass = new DemoClass();
        myDemoClass.myMethod();
        myDemoClass.myMethod2();

    }
}