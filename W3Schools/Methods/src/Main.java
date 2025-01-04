/*
Java Methods
 */

// Create a Method
public class Main {
    static void myMethod() {
        System.out.println("I got executed!");
    }

    // Parameters and Arguments
    static void myMethod2(String firstName) {
        System.out.println(firstName + " Jackson");
    }

    // A Method with If...Else
    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied, You are not old enough!");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    // Return Values
    // use a primitive data type (such as int, char, etc.) instead of void,
    // and use the return keyword inside the method
    static int calcAge(int birthYear){
        return 2025 - birthYear;
    }

    static int calculator(int x, int y, char s){
        int result = 0;
        if(s == 'x'){
            result =  x * y;
        }
        else if(s == '+'){
            result =  x + y;
        }
        else if(s == '-'){
            result = x - y;
        }
        else if(s == '/'){
            result =  x / y;
        }
        return result;
    }

    /*
    Java Method Overloading
    With method overloading, multiple methods can have the same name with different parameters:
     */
    // Instead of defining two methods that should do the same thing, it is better to overload one.
    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x + y;
    }

   
    public static void main(String[] args) {
        myMethod();
        myMethod2("Michael");
        myMethod2("Tito");
        myMethod2("Randy");
        myMethod2("Jackie");
        myMethod2("Jermaine");
        checkAge(18);
        checkAge(12);

        System.out.println(calcAge(2003));

        System.out.println(calculator(5, 6,'+'));
        System.out.println(calculator(12, 7,'-'));
        System.out.println(calculator(9, 5,'x'));
        System.out.println(calculator(9, 3,'/'));

    }

}