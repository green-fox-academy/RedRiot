import java.util.ArrayList;
import java.util.List;

public class Sum {
  ArrayList<Integer> list = new ArrayList<Integer>();
  int sum = 0;

  public Sum(ArrayList<Integer> list) {

    this.list = list;
  }


  public int Adder(ArrayList<Integer>list) {
    for (int i = 0; i < list.size() ; i++) {
      sum = sum + list.get(i);
    }
    return sum;
  }



}
