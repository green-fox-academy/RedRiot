import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  // Write a program that opens a file called "my-file.txt", then prints
  // each of lines form the file.
  // If the program is unable to read the file (for example it does not exists),
  // then it should print an error message like: "Unable to read file: my-file.txt"
  public static void main(String[] args) {
    converter();
  }

  private static void converter() {
    try {
      Path filePath = Paths.get("HelloText.txt");
      List<String> lines = Files.readAllLines(filePath);
      int n = lines.size();
      System.out.println(n);
    } catch (Exception e) {
      System.out.println("Unable to read files: my-file.txt");
    }
  }

}
