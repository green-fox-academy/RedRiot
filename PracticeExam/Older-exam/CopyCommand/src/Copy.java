import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Copy {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("copy [source] [destination]");
    } else if (args.length == 1) {
      System.out.println("No destination provide");
    } else if (args.length > 1) {
      copyfile(args[0], args[1]);

    }
  }

  private static void copyfile(String source, String destination) {
    Path sourcePath = Paths.get(source);
    Path destinationPath = Paths.get(destination);

    try {
      List<String> contentFile = Files.readAllLines(sourcePath);
      List<String> contentOfOtherFile = Files.readAllLines(destinationPath);

      contentOfOtherFile.addAll(contentFile);
      Files.write(destinationPath,contentOfOtherFile);

    } catch (IOException e) {
      System.out.println("Something went wrong");

    }
  }

}
