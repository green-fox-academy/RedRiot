import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {
  ArrayList<Integer> myTestList = new ArrayList<>(Arrays.asList(7,8,9));
  Sum init = new Sum(myTestList);

  @org.junit.Test
  public void adder() {

    assertEquals(init.Adder(myTestList),24);
  }


}
