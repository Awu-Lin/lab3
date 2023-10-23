import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input = { 1, 2, 3 };
    int[] expected = { 3, 2, 1 };

    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void testReverse() {
    int[] input = { 1, 2, 3 };
    int[] expected = { 3, 2, 1 };

    int result[] = ArrayExamples.reversed(input);
    assertArrayEquals(result, expected);
  }

}
