import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome.");

        /*
         There is also a print() method, which is similar to println().

        The only difference is that it does not insert a new line at the end of the output
           System.out.print("Hello World!");
            System.out.print("I will print on the same line");
        */

        // You can also use the println() method to print numbers.
        //However, unlike text, we don't put numbers inside double quotes:
        System.out.println(128);
        System.out.println(256);
        System.out.println(512);
        System.out.println(1024);

        // You can also perform mathematical calculations inside the println() method:
        System.out.println(3 + 3);
        System.out.println(10 * 20);

        /*
        Variables are containers for storing data values.

      In Java, there are different types of variables, for example:

      String - stores text, such as "Hello". String values are surrounded by double quotes
      int - stores integers (whole numbers), without decimals, such as 123 or -123
      float - stores floating point numbers, with decimals, such as 19.99 or -19.99
      char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
      boolean - stores values with two states: true or false
         */

        // Declaring (Creating) Variables
        //To create a variable, you must specify the type and assign it a value:

        // To create a variable that should store text, look at the following example:
        String name = "Ahmed";
        System.out.println(name);

        // To create a variable that should store a number, look at the following example:
        int age = 21;
        System.out.println(age);

        // You can also declare a variable without assigning the value, and assign the value later:
        int myNum;
        myNum = 10;
        System.out.println(myNum);

        // Note that if you assign a new value to an existing variable, it will overwrite the previous value:
        myNum = 20;
        System.out.println(myNum);

        /* If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
         final int myNum2 = 50;
         myNum2 = 20; // Will generate an error: java: cannot assign a value to final variable myNum2
        */

        /*
       The println() method is often used to display variables.

       To combine both text and a variable, use the + character:
         */
        System.out.println("Hello " + name);

        String firstName = "Ahmed";
        String lastName = "Elshinnawi";
        System.out.println(firstName + " " + lastName);

        // To declare more than one variable of the same type, you can use a comma-separated list:
        int x = 1, y = 4, z = 7;
        System.out.println(x + y + z);

        // One Value to Multiple Variables
        // You can also assign the same value to multiple variables in one line:

        int a, b, c;
        a = b = c = 10;
        System.out.println(a + b + c);

        /* Identifiers

       All Java variables must be identified with unique names.

       These unique names are called identifiers.

       Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).

       Note: It is recommended to use descriptive names in order to create understandable and maintainable code:
         */
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand
        int m = 60;

        // Real-Life Examples

        // Student data
        String studentName = "Ahmed Elshinnawi";
        int studentID = 1234;
        int studentAge = 21;
        float studentFee = 22.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        /*
         Calculate the Area of a Rectangle
         In this real-life example, we create a program to calculate the area of a rectangle (by multiplying the length and width):
         */

        // Create integer variables
        int length = 7;
        int width = 5;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);

       /* Java Data Types
        As explained in the previous chapter, a variable in Java must be a specified data type:
        */
        int myNum3 = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        /* Data types are divided into two groups:
        Primitive data types - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types - such as String, Arrays and Classes
         */

        /*
        Byte
        The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
         */
        byte myByte = 112;
        System.out.println(myByte);
        
        /*
        Short
        The short data type can store whole numbers from -32768 to 32767
         */
        short myShort = 16384;
        System.out.println(myShort);

        /*
        Int
        The int data type can store whole numbers from  -2147483648 to 2147483647. In general,
        and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
         */
        int myInt = 2147483647;
        System.out.println(myInt);

        /*
        Long
        The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
        This is used when int is not large enough to store the value. Note that you should end the value with an "L":
         */

        long myLong = 1234567891011L;
        System.out.println(myLong);

        /*
        Floating Point Types
        You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
        The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:
         */
        float myFloat = 3.14f;
        System.out.println(myFloat);

        double myDouble = 21.83d;
        System.out.println(myDouble);

        /*
        Scientific Numbers
        A floating point number can also be a scientific number with an "e" to indicate the power of 10:
         */
        float f1 = 35e3f;
        double d1 = 15E5d;
        System.out.println(f1);
        System.out.println(d1);


        /*
        Boolean Types
        Java has a boolean data type, which can only take the values true or false
         */
        boolean isJavaFun = false;
        boolean isSkyBlue = true;
        System.out.println(isJavaFun); // Outputs false
        System.out.println(isSkyBlue); // Outputs true

        /*
        Characters
        The Char data type is used to store a single character. The character must be surrounded with single quotes, like 'A'
         */
        char myGrade = 'B';
        System.out.println(myGrade);

        // Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:
        char myChar1 = 65, myChar2 = 104, myChar3 = 109, myChar4 = 101, myChar5 = 100;
        System.out.print(myChar1);
        System.out.print(myChar2);
        System.out.print(myChar3);
        System.out.print(myChar4);
        System.out.println(myChar5);

        /*
        Strings
        The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
         */
        String greeting = "Hello World!";
        System.out.println(greeting);

        /*
        Java Data Types Example
        Real-Life Example
        Here's a real-life example of using different data types, to calculate and output the estimated earnings
        of world cup final 2022:
         */
        // Create variables of different data types
        float attendance = 88.966f;
        int averageTicketCost = 855;
        float totalTicketEarnings = attendance * averageTicketCost;
        char currency = '$';

        // Print variables
        System.out.println("Number of people in the stadium: " + attendance + " spectators");
        System.out.println("Average cost per ticket: " + averageTicketCost + currency);
        System.out.println("Estimated Match Earnings: " + totalTicketEarnings + currency);




        /*
        Non-Primitive Data Types
        Non-primitive data types are called reference types because they refer to objects.

        The main differences between primitive and non-primitive data types are:
        Primitive types in Java are predefined and built into the language, while non-primitive types are created
        by the programmer (except for String).
        Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
        Primitive types start with a lowercase letter (like int), while non-primitive types typically starts
        with an uppercase letter (like String).
        Primitive types always hold a value, whereas non-primitive types can be null.
        Examples of non-primitive types are Strings, Arrays, Classes etc.
         */


         /*
        Java Type Casting:
        Type casting is when you assign a value of one primitive data type to another type.
        In Java, there are two types of casting:
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double
        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
         */
        // Widening Casting:
        // Widening casting is done automatically when passing a smaller size type to a larger size type:
        int myInt2 = 10;
        double myDouble2 = myInt2; // Automatic casting: int to double

        System.out.println(myInt2);
        System.out.println(myDouble2);

        // Narrowing Casting:
        // Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
        double myDouble3 = 10.234d;
        int myInt3 = (int) myDouble3; // Manual casting: double to int

        System.out.println(myDouble3); // Outputs 10.234
        System.out.println(myInt3); // Outputs 10

        /*
         Real-Life Example
         Here's a real-life example of type casting where we create a program to calculate the percentage of a user's
         final percentage in thanwya 3ama grade.
         We use type casting to make sure that the result is a floating-point value, rather than an integer:
         */

        // Set the max possible grade in the year to 410
        int maxGrade = 410;

        // The actual grade of the user
        int userGrade = 394;

        /* Calculate the percentage of the user's grade in relation to the maximum available grade.
           Convert userGrade to float to make sure that the division is accurate */
        float percentage = (float) userGrade / maxGrade * 100.0f;

        System.out.println(percentage);

        /*
        String Length
        A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:
         */
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        // More string methods

        // toUpperCase()
        String country = "EgyPt";
        System.out.println(country.toUpperCase());

        // toLowerCase()
        System.out.println(country.toLowerCase());

        /*
        Finding a Character in a String
        The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
         */
        String locate = "Hi, my name is, huh? My name is, what? My name is, chka-chka, Slim Shady";
        System.out.println(locate.indexOf("Slim"));

        /*
        Java String Concatenation
        You can use the concat() method to concatenate two strings
         */
        System.out.println(firstName.concat(lastName));



        /*
        Adding Numbers and Strings
        Java uses the + operator for both addition and concatenation.
        Numbers are added. Strings are concatenated.
         */

        // If you add two numbers, the result will be a number:
        int sum = x + y;

        // If you add two strings, the result will be a string concatenation:
        String fullName = firstName + " " + lastName;

        // If you add a number and a string, the result will be a string concatenation:
        String s = "10";
        System.out.println(s+x);

        /*
        Strings - Special Characters
        The backslash (\) escape character turns special characters into string characters:
        */
        // The sequence \"  inserts a double quote in a string:
        String text = "I Just Don't Give a \"Fuck\"";
        System.out.println(text);

        // The sequence \\  inserts a double quote in a string:
        String backSlash = "The character \\ is called backslash";
        System.out.println(backSlash);

        /*
        Java Math
        The Java Math class has many methods that allow you to perform mathematical tasks on numbers
         */

        // Math.max()
        // The Math.max() method can be used to find the highest value of two values
        System.out.println(Math.max(9,3));

        // Math.min()
        // The Math.min() method can be used to find the lowest value of two values
        System.out.println(Math.min(9,3));

        // Math.sqrt(x)
        // The Math.sqrt(x) method returns the square root of x:
        System.out.println(Math.sqrt(100));

        // Math.abs(x)
        // The Math.abs(x) method returns the absolute (positive) value of x:
        System.out.println(Math.abs(-9.3));

        // Random Numbers
        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println(Math.random());


        /*
        Java Booleans
         */

        /*
         Boolean Expression:
         A Boolean expression returns a boolean value: true or false.
        This is useful to build logic, and find answers.
        For example, you can use a comparison operator, such as the greater than (>) operator, to find out if an expression (or a variable) is true or false:
         */
        int randomInt1 = (int) (Math.random() * 100);
        System.out.println(randomInt1);
        int randomInt2 = (int) (Math.random() * 100);
        System.out.println(randomInt2);
        System.out.println(randomInt1 > randomInt2);

        // Real-Life Example
        //  we want to find out if a person is old enough to have a driver license.
        //In the example below, we use the >= comparison operator to find out if the age (25) is greater than OR equal to the age limit, which is set to 18:
        int myAge = 21;
        int driverLicenseAge = 18;
        System.out.println(myAge >= driverLicenseAge);


        /*
        Java If ... Else
         */

        // The if Statement
        if(2000 > 1999){
            System.out.println("2000 is greater than 1999");
        }

        // The else Statement
        int time = 20;
        if(time < 18){
            System.out.println("Good day");
        }
        else{
            System.out.println("Good evening");
        }

        // The else if Statement
        int temp = 32;

        if(temp > 30){
            System.out.println("It is HOT");
        }
        else if (temp <= 30 && temp >= 25){
            System.out.println("It is Warm");
        }
        else{
            System.out.println("It is Cold");
        }

        // Short Hand If...Else (Ternary Operator)
        String result = (time < 18) ? "Good Day" : "Good Evening";
        System.out.println(result);

        // Real-Life Example
        int pinCode = 12123;

        if(pinCode == 12123){
            System.out.println("PIN CODE IS CORRECT");
        }
        else{
            System.out.println("PIN CODE IS INCORRECT");
        }

        // This example shows how you can use if..else to find out if a number is positive or negative:

        int myNum11 = 10;

        if(myNum11 > 0){
            System.out.println("The value is a positive number");
        }
        else if(myNum11 < 0){
            System.out.println("The value is a negative number");
        }
        else {
            System.out.println("The value is 0");
        }

        // Find out if a number is even or odd:
        if(myNum11 % 2 == 0){
            System.out.println("The value is even");
        }
        else {
            System.out.println("The value is odd");
        }


        /* Loops
         Java While Loop
         */
        int q = 0;
        while(q < 5){
            System.out.println(q + "..");
            q++;
        }

       //  Do/While Loop
        do {
            System.out.println(q);
            q++;
        }
        while(q < 5);



        // Real-Life Example
       int dice = 1;
       while(dice <= 6){
           if(dice < 6){
               System.out.println("Nope");
           }
           else {
               System.out.println("YES");
           }
           dice++;
       }



       // Java For Loop
        for (int i = 1 ; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }


        // Java Nested Loops

        // Outer Loop
        for(int i = 1; i<=2; i++){
            System.out.println("Outer " + i);
            for (int j = 1; j <= 3; j++){
                System.out.println("Inner " + j);
            }
        }

        // Java For Each Loop
        String[] cars = {"Audi", "BMW", "Mercedes"};
        for(String i : cars){
            System.out.println(i);
        }


        // Java For Loop Real-Life Examples

        int number = 5;

        // Print the multiplication table for the number 5
        for(int i = 0; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }



        /*
        Java Arrays
        To declare an array, define the variable type with square brackets:
         */
        int[] myArray = {1, 4, 7, 10, 13, 16, 19};

        // Access the Elements of an Array
        System.out.println(myArray[5]); // Outputs 16

        // Change an Array Element
        myArray[5] = 20;
        System.out.println(myArray[5]); // Now outputs 20


        // Array Length
        System.out.println(myArray.length); // Outputs 7

        /*
        Java Arrays Loop:
        Loop Through an Array
         */
        // Using For Loop
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        // Using For-Each
        for(int i : myArray){
            System.out.println(i);
        }
        // If you compare the for loop and for-each loop, you will see that the for-each method is easier to write, it does not require a counter (using the length property), and it is more readable


        // Java Arrays - Real-Life Examples
        // create a program that calculates the average of different ages

        // An array storing different ages
        int[] ages = {65, 64, 62, 61, 35, 33, 28, 25, 23, 22, 21, 20, 17};
        float count = 0;

        // Loop through the elements of the array
        for(int i = 0; i < ages.length; i++){
            count += ages[i];
        }

        // Calculate the average by dividing the sum by the length
        float average =  count / ages.length;

        // Print the average
        System.out.println("The average age is: " + average);


        // create a program that finds the lowest, and highest age among different ages:

        // Create a 'lowestAge' variable and assign the first array element of ages to it,
        // and highestAge and assign zero to it
        int lowestAge = ages[0], highestAge = 0;

        // Loop through the elements of the ages array to find the lowest age, and the highest age
        for (int i : ages){
            // Check if the current age is smaller than the current 'lowest age'
            if(i < lowestAge){
                // If the smaller age is found, update 'lowest age' with that element
                lowestAge = i;
            }
            // Check if the current age is bigger than the current 'lowest age'
            if(i > highestAge){
                // If the highest age is found, update 'lowest age' with that element
                highestAge = i;
            }
        }
        // Output the value of the highest age
        System.out.println("The highest age is: " + highestAge);

        // Output the value of the lowest age
        System.out.println("The lowest age is: " + lowestAge);

        /*
        Java Multi-Dimensional Arrays:
        Multidimensional Arrays
        A multidimensional array is an array of arrays.
        To create a two-dimensional array, add each array within its own set of curly braces:
         */
        int[][] myNumbers = {{1, 7, 13, 19}, {4, 10, 16, 22}};
        // myNumbers is now an array with two arrays as its elements.

        // Access Elements
        System.out.println(myNumbers[1][2]);

        // Loop Through a Multi-Dimensional Array
        for (int i = 0; i < myNumbers.length; i++){
            for (int j = 0; j < myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);
            }
        }
    }


}