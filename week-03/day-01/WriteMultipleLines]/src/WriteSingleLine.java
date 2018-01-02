import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    List<String> content = new ArrayList<>();
    System.out.println("Path");
    Path filePath = Paths.get(scanner.nextLine());
    System.out.println("word");
    String word = scanner.next();
    System.out.println("How many lines");
    int number = scanner.nextInt();


    try {
      for (int i = 0; i < number ; i++) {
        content.add(word);
        Files.write(filePath, content);

      }
    } catch (IOException e) {

    }


  }

}