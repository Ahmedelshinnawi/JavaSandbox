/*
Java Regular Expressions
What is a Regular Expression?
A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text,
you can use this search pattern to describe what you are searching for.

A regular expression can be a single character, or a more complicated pattern.

Regular expressions can be used to perform all types of text search and text replace operations.

Java does not have a built-in Regular Expression class, but we can import the java.util.
regex package to work with regular expressions. The package includes the following classes:

Pattern Class - Defines a pattern (to be used in a search)
Matcher Class - Used to search for the pattern
PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("cooked", Pattern.CASE_INSENSITIVE); //  the pattern is created using the Pattern.compile() method.
        // The first parameter indicates which pattern is being searched for and the second parameter has a flag to indicates
        // that the search should be case-insensitive. The second parameter is optional.

        Matcher matcher = pattern.matcher("We are COOKED!"); // The matcher() method is used to search
        // for the pattern in a string. It returns a Matcher object which contains information about
        // the search that was performed.


        boolean matchFound = matcher.find(); // The find() method returns true if the pattern was found
        // in the string and false if it was not found.

        if (matchFound) {
            System.out.println("Match found");
        }
        else {
            System.out.println("Match not found");
        }
    }
}