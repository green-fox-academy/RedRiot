import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class pa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(in);


    System.out.println("Give the numbers and If you are finished write 'Done'!");

    ArrayList<Integer> list = new <Integer> ArrayList();

    while(scanner.hasNextInt()){
      list.add(scanner.nextInt());
    }

    int sum = 0;
    for( int i = 1; i < list.size(); i++){
      sum += list.get(i);}
      int average =  sum / list.size();
    System.out.println( "The sum is " + sum + " and the average is " + average);

  }
}
