import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {
  @Test
  public void AnagramTest_Expecting_Different_Word() {
    String firstInput = "string";
    String secondInput = "apple";

    boolean result = Anagram.isAnagram(firstInput, secondInput);
    assertFalse(result);

  }

  @Test
  public void AnagramTest_Expecting_Same_Words() {
    String firstInput = "string";
    String secondInput = "string";

    boolean result = Anagram.isAnagram(firstInput, secondInput);
    assertTrue(result);

  }

  @Test
  public void AnagramTest_Expecting_An_Uppercase() {
    String firstInput = "string";
    String secondInput = "String";

    boolean result = Anagram.isAnagram(firstInput, secondInput);
    assertTrue(result);

  }

  @Test
  public void AnagramTest_Expecting_Different_Length_OF_String() {
    String firstInput = "string";
    String secondInput = "strings";

    boolean result = Anagram.isAnagram(firstInput, secondInput);
    assertFalse(result);

  }

  @Test
  public void AnagramTest_Same_Letters() {
    String firstInput = "score";
    String secondInput = "cores";

    boolean result = Anagram.isAnagram(firstInput, secondInput);
    assertTrue(result);

  }





  @Test
  public void AnagramTest_Expecting_Empty_Input1() {
    String firstInput = "";
    String secondInput = "list";

    boolean result = Anagram.isAnagram(firstInput, secondInput);
    assertFalse(result);

  }

  @Test
  public void AnagramTest_Expecting_Empty_Input() {
    String firstInput = null;
    String secondInput = "";

    boolean result = Anagram.isAnagram(firstInput, secondInput);
    assertFalse(result);

  }

  }