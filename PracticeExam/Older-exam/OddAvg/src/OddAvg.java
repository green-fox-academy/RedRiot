import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAvg {
  public static void main(String[] args) {
    List<Integer> number = new ArrayList<>(Arrays.asList(2,2));
    System.out.println("The number is "+ oddAverage(number));
  }

  public static double oddAverage(List<Integer> numbers) {
    double average = 0;
    int counter = 0;
    for (int i = 0; i <numbers.size() ; i++) {
      if (numbers.get(i) % 2 == 1) {
        average = average + numbers.get(i);
        counter++;
      }

    }
    if (counter == 0) {
      return 0;
    } else {
      return average/counter;
    }

  }
}
