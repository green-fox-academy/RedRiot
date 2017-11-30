import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bubblesort {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Write numbers and i will sort it");
    ArrayList<Integer> list = new <Integer>ArrayList();
    while (scanner.hasNextInt()) {
      list.add(scanner.nextInt());
    }
    Collections.sort(list);
      System.out.println(list);

      }




}

