public class main {
  public static void main(String[] args) {
    int resultOfAddingTWoNumbers = addTWonIntegers(
            3,5);
    System.out.println(resultOfAddingTWoNumbers);


  }
  public static int addTWonIntegers(int number1, int number2) {
    return number1 + number2;
  }

  public static void print printTextWithExtraAAtTheEnd(String text) {
    String extendedText = text + "a";
    System.out.println(extendedText)
  }
}
