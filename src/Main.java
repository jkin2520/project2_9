import java.util.List;
import java.util.stream.Collectors;

public class Main {
    /**
     * Returns a list of even numbers from the given list of integers.
     *
     * @param numbers the list of integers to filter
     * @return a list containing only the even numbers from the input list
     */
    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                     .filter(n -> n % 2 == 0)
                     .collect(Collectors.toList());
    }
    /**
     * Converts all characters in the input string to uppercase.
     *
     * @param input the string to convert
     * @return a new string with all characters converted to uppercase
     */
    public static String convertToUpperCase(String input) {
        return input.toUpperCase();
    }
    /**
     * Returns the longest string from the given list of strings.
     * If multiple strings have the same length, the first one is returned.
     *
     * @param strings the list of strings to evaluate
     * @return the longest string from the input list, or an empty string if the list is empty
     */
    public static String getLongestString(List<String> strings) {
        return strings.stream()
                      .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                      .orElse("");
    }
    
    
}
