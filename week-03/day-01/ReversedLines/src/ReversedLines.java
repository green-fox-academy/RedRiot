import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    TextReverse();
  }

  private static void TextReverse() {

    try {
      Path filePath = Paths.get("reversed.txt");
      Path asd = Paths.get("Newfile.txt");
      List<String> text = Files.readAllLines(filePath);
      List<String> content = new ArrayList<>();
      for (int i = 0; i <text.size() ; i++) {
        String listreverse = new StringBuilder(text.get(i)).reverse().toString();
        content.add(listreverse);
      }

      Files.write(asd,content);
    } catch (IOException e) {

    }

}
}
