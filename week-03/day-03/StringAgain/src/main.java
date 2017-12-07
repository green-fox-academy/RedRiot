public class main {
  public static void main(String[] args) {
    String word = "casoxklkvzzk xxsxxklkxscklxlsx";
    String removeLetter = "x";
    System.out.println(remover(word,removeLetter));

  }

  private static String remover(String giveWord, String letter) {
    if (!giveWord.contains(letter)) {
      return giveWord;
    } else {
      return remover(giveWord.replace(letter, " "),letter);
    }
  }
}
