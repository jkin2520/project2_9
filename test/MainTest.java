import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class MainTest {
    @Test
    public void testGetEvenNumbers() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> expected = List.of(2, 4, 6);
        assertEquals(expected, Main.getEvenNumbers(input));
    }
    @Test
public void testConvertToUpperCase() {
    String input = "hello world";
    String expected = "HELLO WORLD";
    assertEquals(expected, Main.convertToUpperCase(input));
}

}
