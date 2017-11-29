import java.util.Arrays;
public class ag {
  public static void main(String[] args) {
    int[] sg = {3, 4, 5, 6, 7};
    for (int i=0; i < sg.length; i ++){
      sg[i]*=2;
    }
    System.out.println("The doubled array numbers are"+ Arrays.toString(sg));

  }
}
