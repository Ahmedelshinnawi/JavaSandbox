/*
Java Exceptions
When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input,
or other unforeseeable things.

When an error occurs, Java will normally stop and generate an error message.
The technical term for this is: Java will throw an exception (throw an error).
 */

/*
Java try and catch
The try statement allows you to define a block of code to be tested for errors
while it is being executed.

The catch statement allows you to define a block of code to be executed,
if an error occurs in the try block.

The try and catch keywords come in pairs:
 */


public class Main {

    /*
    The throw keyword
    The throw statement allows you to create a custom error.
    The throw statement is used together with an exception type. There are many exception types available in Java:
    ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException...
     */
    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old");
        }
        else {
            System.out.println("Access granted - You are old enough");
        }
    }

    public static void main(String[] args) {
        int[] myNumbers = {1, 4, 7, 10};
        // System.out.println(myNumbers[9]); // error, myNumbers[9] does not exist.

    // If an error occurs, we can use try...catch to catch the error and execute some code to handle it
    try {
        int[] myNumbers2 = {1, 4, 7, 10};
        System.out.println(myNumbers2[9]);
    }catch (Exception e){
        System.out.println("Something went wrong");
    } finally {
        // The finally statement lets you execute code, after try...catch, regardless of the result
        System.out.println("The 'try catch' is finished");
    }

    checkAge(12);
    checkAge(21);


    }
}