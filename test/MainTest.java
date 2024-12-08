import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class MainTest {
    /**
     * Tests the getEvenNumbers function to ensure it correctly filters even numbers.
     */
    @Test
    public void testGetEvenNumbers() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> expected = List.of(2, 4, 6);
        assertEquals(expected, Main.getEvenNumbers(input));
    }
/**
     * Tests the convertToUpperCase function to ensure it converts all characters to uppercase.
     */
    @Test
    public void testConvertToUpperCase() {
        String input = "hello world";
        String expected = "HELLO WORLD";
        assertEquals(expected, Main.convertToUpperCase(input));
}
/**
     * Tests the getLongestString function to ensure it correctly identifies the longest string.
     */
    @Test
    public void testGetLongestString() {
        List<String> input = List.of("apple", "banana", "cherry");
        String expected = "banana";
        assertEquals(expected, Main.getLongestString(input));
}


}
