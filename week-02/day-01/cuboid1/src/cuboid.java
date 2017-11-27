import java.util.Scanner;

public class cuboid {

        public static void main(String[] args) {
            String question = "Write down your cuboid 3 sides";
              System.out.println(question);
              System.out.println("A");

            Scanner userInput = new Scanner(System.in);
            double aside = (double)userInput.nextInt();
              System.out.println("B");

            Scanner userInput1 = new Scanner(System.in);
            double bside = (double)userInput1.nextInt();

            System.out.println("C");
            Scanner userInput3 = new Scanner(System.in);

            double cside = (double)userInput3.nextInt();
            double surface = 2.0D * (aside * bside + bside * cside + cside * aside);
            double volume = aside * bside * cside;
              System.out.println("The result of the surface is " + surface);
              System.out.println("The result of the volume is " + volume);
        }
}
