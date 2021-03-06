package examples;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleGFG_1 {
    public static void main(String[] args) {
        // Get the regex to be checked
        String regex = "\\b(?<Geeks>[A-Za-z\\s]+)";

        // Create a pattern from regex
        Pattern pattern = Pattern.compile(regex);

        // Get the String to be matched
        String stringToBeMatched = "GeeksForGeeks";

        // Create a matcher for the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);

        // Get the current matcher state
        MatchResult result = matcher.toMatchResult();
        System.out.println("Current Matcher: " + result);

        while (matcher.find()) {
            // Get the first index of match result
            System.out.println(matcher.start("Geeks"));
        }
    }
}