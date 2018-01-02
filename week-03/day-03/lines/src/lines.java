import javax.swing.*;
import java.awt.*;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class lines {
  static Graphics g;
  public static void mainDraw(Graphics graphics){
  g.setColor(Color.yellow);
  g.fillRect(0,0,WIDTH,HEIGHT);
  square(0,0,WIDTH);

  }

  public static void square(int x, int y, int size) {
    if (size>5) {
      g.setColor(Color.BLACK);
      g.drawLine(x, HEIGHT / 3, WIDTH, HEIGHT / 3);
      g.drawLine(x, HEIGHT / 3 * 2, WIDTH, HEIGHT / 3 * 2);
      g.drawLine(WIDTH / 3, y, WIDTH / 3, HEIGHT);
      g.drawLine(WIDTH / 3 * 2, y, WIDTH / 3 * 2, HEIGHT);

      g.setColor(Color.RED);
      g.drawLine(WIDTH / 9 * 4, HEIGHT / 3, WIDTH / 9 * 4, HEIGHT / 3 * 2);
      g.drawLine(WIDTH / 9 * 5, HEIGHT / 3, WIDTH / 9 * 5, HEIGHT / 3 * 2);
      g.drawLine(WIDTH / 3, HEIGHT / 9 * 4, WIDTH / 3 * 2, HEIGHT / 9 * 4);
      g.drawLine(WIDTH / 3, HEIGHT / 9 * 5, WIDTH / 3 * 2, HEIGHT / 9 * 5);

    }
  }

  //    Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      g = graphics;
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
