import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class Exercise2  {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    OptionalDouble averageOfOddNumbers = numbers.stream()
            .filter(number -> Math.abs(number) % 2 == 1)
            .mapToDouble(av -> av)
            .average();
    System.out.println(averageOfOddNumbers.getAsDouble());

  }

}

