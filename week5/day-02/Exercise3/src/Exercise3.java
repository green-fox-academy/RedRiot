import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exercise3  {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    Function<Integer, Integer> square = x -> x * x;
    numbers.stream()
            .filter(x -> x >0)
            .map(square)
            .forEach(x -> System.out.println(x));

  }
}
