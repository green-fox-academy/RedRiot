public class greeting {
//  and main method on your own.

  // - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`
  public static void main(String[] args) {
    String al =greet("Greenfox");
    System.out.println(al);

  }

  public static String greet(String text) {
    return "Greeting dear, " + text;

  }
}
