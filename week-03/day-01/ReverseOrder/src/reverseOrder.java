import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class reverseOrder {
  public static void main(String[] args) {
    Path filePath = Paths.get("Decryptid");
    Path rev = Paths.get("encrypt.txt");
    try {
      List<String> content = Files.readAllLines(filePath);
      List<String> decrypted = new ArrayList<>();

      for(int i = content.size() - 1; i >= 0; i--){
        decrypted.add(content.get(i));

      }
      Files.write(rev,decrypted);


    } catch (IOException e) {
      System.out.println(e);
    }

  }
}
