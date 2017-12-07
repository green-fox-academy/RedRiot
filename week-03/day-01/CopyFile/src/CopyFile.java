import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Write the  file name");
    Path filePath = Paths.get(input.nextLine());
    System.out.println("Write the file where you want to copy");
    Path filePath2 = Paths.get(input.nextLine());
    try {
      List<String> content1 = Files.readAllLines(filePath);
      List<String> content2 = Files.readAllLines(filePath2);
      content2.addAll(content1);
      Files.write(filePath2, content2);
    } catch (IOException e) {

    }


  }
}
