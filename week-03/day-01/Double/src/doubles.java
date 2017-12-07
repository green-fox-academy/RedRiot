import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class doubles {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Give me the file name");
    Path pathFiles = Paths.get(input.nextLine());
    Path filePath = Paths.get("decrypt.txt");

    try {
        List<String> crypticList = Files.readAllLines(pathFiles);
        List<String> decryptedList = new ArrayList<>();
        for (int i=0; i < crypticList.size(); i++) {
          String  current ="";
          for (int j=0; j < crypticList.get(i).length(); j+=2) {
            current=current+crypticList.get(i).charAt(j);
          }
          decryptedList.add(current);
        }

        Files.write(filePath, decryptedList);
      }
      catch (Exception e) {

      }
    }

  }

