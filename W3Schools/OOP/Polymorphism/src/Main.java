/*
Java Polymorphism:
Polymorphism means "many forms", and it occurs when we have many classes that are related
to each other by inheritance.

let's inherit attributes and methods from another class.
Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound().
Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation
of an animal sound (the pig oinks, and the cat meows, etc.):
 */

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: how how");
    }
}

class cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says: Meow Meow");
    }
}

class Main {
    public static void main(String[] args) {
        // Now we can create Dog and Cat objects and call the animalSound() method on both of them:

        Animal myAnimal = new Animal(); // Create an Animal object
        Animal myDog = new Dog(); // Create a Dog object
        Animal myCat = new cat(); // Create a Cat object
        myAnimal.animalSound();
        myDog.animalSound();
        myCat.animalSound();
    }
}