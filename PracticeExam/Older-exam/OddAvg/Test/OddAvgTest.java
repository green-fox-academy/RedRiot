import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OddAvgTest {

  OddAvg oddAvg = new OddAvg();
  List<Integer> content = new ArrayList<>(Arrays.asList(9,9));
  double number = 9.0;

  @Test
  public void oddAverageTestAllOdd() {
    assertEquals(number,OddAvg.oddAverage(content),0.001);

  }
  @Test
  public void oddAverageTestAllEven() {
    List<Integer> content = new ArrayList<>(Arrays.asList(2,2));
    double number=0.00 ;

    assertEquals(number,OddAvg.oddAverage(content),0.01);


  }
  @Test
  public void oddAverageTestAllMixed() {
    List<Integer> content = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    double number = 3;

    assertEquals(number,OddAvg.oddAverage(content),0.001);

  }
}