import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                     .filter(n -> n % 2 == 0)
                     .collect(Collectors.toList());
    }
    public static String convertToUpperCase(String input) {
        return input.toUpperCase();
    }
    
}
