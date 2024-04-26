// Regex
/*
Regular expressions are powerful tools for pattern matching and text manipulation, often abbreviated as regex or regexp. 
They provide a concise and flexible syntax for specifying search patterns within strings.

Syntax:
  - Regex patterns are defined as strings in Java.
  - Special characters in regex patterns have special meanings, such as:
  - . (matches any character)
  - * (matches zero or more occurrences)
  - + (matches one or more occurrences)
  - ? (matches zero or one occurrence)
  - [] (matches any character within the brackets)
  - {} (specifies the number of occurrences), etc.

Character Class:
   - A character class in regex allows you to match any one of a set of characters.
   - It is defined within square brackets [].
   - For example, [aeiou] matches any vowel, [0-9] matches any digit, [a-zA-Z] matches any letter (both lowercase and uppercase).
   - Inside a character class, certain metacharacters like ., *, +, etc., lose their special meaning and are treated as literal characters.

Quantifiers:
   - Quantifiers specify how many times a character or group of characters can occur in a regex pattern.
   - Common quantifiers include:
     - *: Matches zero or more occurrences of the preceding character or group.
     - +: Matches one or more occurrences of the preceding character or group.
     - ?: Matches zero or one occurrence of the preceding character or group.
     - {n}: Matches exactly n occurrences of the preceding character or group.
     - {n,}: Matches at least n occurrences of the preceding character or group.
     - {n,m}: Matches between n and m occurrences of the preceding character or group.
   - Quantifiers are greedy by default, meaning they match as much as possible. Adding ? after a quantifier makes it reluctant, matching as little as possible.

Metacharacters:
   - Metacharacters are characters in a regex pattern that have a special meaning.
   - Some common metacharacters include:
     - .: Matches any single character except newline.
     - ^: Anchors the match to the beginning of the string.
     - $: Anchors the match to the end of the string.
     - \b: Word boundary, matches the position between a word character and a non-word character.
     - \d: Matches any digit (equivalent to [0-9]).
     - \D: Matches any non-digit character (equivalent to [^\d]).
     - \w: Matches any word character (equivalent to [a-zA-Z0-9_]).
     - \s: Matches any whitespace character (space, tab, newline, etc.).
     - \S: Matches any non-whitespace character (equivalent to [^\s]).
     - |: Alternation, matches either the pattern before or after the pipe symbol.
     - (): Grouping, groups multiple patterns together.
     - [ ]: Character class, matches any single character within the brackets.
     - -: Range, specifies a range of characters within a character class.
     - ^: Negation, matches any character not within the brackets when used as the first character inside a character class.
     - \: Escape, escapes the following character, allowing you to match metacharacters as literals.
     
Commonly Used Constructs:
  - \d: Matches any digit (equivalent to [0-9]).
  - \w: Matches any word character (equivalent to [a-zA-Z0-9_]).
  - \s: Matches any whitespace character (space, tab, newline, etc.).
  - .: Matches any single character except newline.
  - []: Matches any single character within the brackets.
  - |: Alternation, matches either the pattern before or after the pipe symbol.
  - (): Grouping, groups multiple patterns together.
  - ^: Anchors the match to the beginning of the string.
  - $: Anchors the match to the end of the string.
  - \b: Word boundary, matches the position between a word character and a non-word character.

groups():
  - When a regular expression pattern contains capturing groups (defined by parentheses ()), each capturing group captures a portion of the input string that matches the pattern within the parentheses.
  - After a successful match, you can use the group() method on a Matcher object to retrieve the substring that matched a specific capturing group.
  - The group() method takes an integer argument representing the index of the capturing group to retrieve. Index 0 represents the entire match, while indexes 1 and above represent individual capturing groups.
  - If the regular expression pattern contains multiple capturing groups, you can call group(1), group(2), and so on to access the substrings captured by each group.
  - If the pattern contains no capturing groups, calling group() or group(0) will return the entire match.

Example Usage:
  - Validating email addresses: ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$
  - Matching phone numbers: \d{3}-\d{3}-\d{4}
  - Finding words containing "java": \bjava\b
  - Extracting numbers from a string: \d+

Java API:
  - In Java, regex functionalities are provided by the java.util.regex package.
  - Key classes include Pattern and Matcher.
  - Pattern: Represents a compiled regex pattern.
  - Matcher: Used to perform matching operations on a character sequence.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexConcept {
    public static void main(String[] args) {
        // Define a regex pattern to match email addresses
        String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Define a regex pattern to match phone numbers
        String phonePattern = "\\d{3}-\\d{3}-\\d{4}";

        // Define a sample text
        String text = "Contact us at email@example.com or call 123-456-7890 for assistance. Another email address is john.doe@example.com";

        // Compile the patterns
        Pattern emailRegex = Pattern.compile(emailPattern);
        Pattern phoneRegex = Pattern.compile(phonePattern);

        // Match email addresses in the text
        Matcher emailMatcher = emailRegex.matcher(text);
        while (emailMatcher.find()) {
            System.out.println("Email found: " + emailMatcher.group());
        }

        // Match phone numbers in the text
        Matcher phoneMatcher = phoneRegex.matcher(text);
        while (phoneMatcher.find()) {
            System.out.println("Phone number found: " + phoneMatcher.group());
        }
    }
}


