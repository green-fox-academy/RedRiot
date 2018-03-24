import java.util.HashMap;
import java.util.Map;

public class Dictionary {
  static Map<String, String> map;

  public static void main(String[] args) {
    map = new HashMap<String, String>();
    map.put("alma", "apple");
    map.put("fa", "tree");
    addWord("Narancs", "Orange");

    System.out.println(map);
    removeWord("fa");
    System.out.println(map);

    System.out.println(translateToHun("apple"));

  }

  // Implement this method. It should add the given key-value pair to the the map
  public static void addWord(String hunWord, String engWord) {
    map.put(hunWord, engWord);

  }

  // Implement this method. It should remove the key-value pair by the given key from the map
  public static void removeWord(String hunWord) {
    map.remove(hunWord);

  }

  // Implement these methods. They should return the translation of the given word from the map
  public static String translateToHun(String engWord) {
    for (String wordKey : map.keySet()) {
      if (map.get(wordKey).equals(engWord)) {
        return wordKey;
      }

    }
    return null;
  }

    public static String translateToEng (String hunWord){
      return map.get(hunWord);
    }

}
