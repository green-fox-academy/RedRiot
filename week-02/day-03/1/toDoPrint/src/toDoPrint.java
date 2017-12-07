public class toDoPrint {
  public static void main(String[] args) {
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention
    todoText ="My todo:\n" + todoText + " - Downlaod games\n" + "  - Diablo";


    System.out.println(todoText);
  }
}
