/*
 Java Dates
 Java does not have a built-in Date class, but we can import the java.time package to
 work with the date and time API. The package includes many date and time classes.

 LocalDate -> Represents a date (year, month, day (yyyy-MM-dd))
 LocalTime -> Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
 LocalDateTime -> Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
 DateTimeFormatter -> Formatter for displaying and parsing date-time objects
 */

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.LocalTime; // import the LocalTime class
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // Display Current Date
        LocalDate myDate = LocalDate.now(); // Create a date object
        System.out.println(myDate); // Display the current date

        // Display Current Time
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        // Display Current Date and Time
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);

        // Formatting Date and Time
        // The "T" in the example above is used to separate the date from the time. You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects. The following example will remove both the "T" and nanoseconds from the date-time:
        System.out.println("Before formatting: " + myDateTime);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String myFormattedDate = myDateTime.format(myFormatter);
        System.out.println("After formatting: " + myFormattedDate);
    }
}