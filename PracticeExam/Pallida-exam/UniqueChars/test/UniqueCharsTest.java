import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueCharsTest {
  UniqueChars test = new UniqueChars();

  @Test
  public void uniqueCharTest0() {
    assertEquals(UniqueChars.uniqueCharacter("kutya"), new ArrayList<Character>(Arrays.asList('k', 'u', 't', 'y', 'a')));

  }
  @Test
  public void uniqueCharTest1() {
    assertEquals(UniqueChars.uniqueCharacter("anya"), new ArrayList<Character>(Arrays.asList('n', 'y')));

  }
  @Test
  public void uniqueCharTest2() {
    assertEquals(UniqueChars.uniqueCharacter("baba"), new ArrayList<Character>(Arrays.asList()));

  }
}