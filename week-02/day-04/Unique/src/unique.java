import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class unique {


  public static void main(String[] args) {

    System.out.println("Write numbers");
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    while(scanner.hasNextInt()){
      list.add(scanner.nextInt());
    }
    Set<Integer> s = new LinkedHashSet<>(list);
    System.out.println(s);

  }
}
