import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  static Graphics g;
  public static void mainDraw(Graphics graphics){

      triangle(0, 0, WIDTH, graphics);

    }

    public static void triangle(int x, double y, int number, Graphics gr) {
      double height = (Math.sqrt(3.0) * number)/2;

      if (number > 200) {
        triangle(x,y,number /2,gr);
        triangle(x + number/2,y + y,number/2,gr);
        triangle(x+number/4, y + height /2, number/2, gr );
      }
      int x1 = x;
      double y1 = y;
      int x2 = x + number;
      double y2 = y;
      int x3 = x + number / 2;
      double y3 = y + height;
      int[] xPoints = {x1, x2, x3};
      int[] yPoints = {(int)y1, (int)y2, (int)y3};
      g.drawPolygon(xPoints, yPoints, 3);

      xPoints[0] = x + number / 2;
      xPoints[1] = x + 3 * number / 4;
      xPoints[2] = x + number / 4;
      yPoints[0] = (int) y;
      yPoints[1] = (int)y + (int)((Math.sqrt(3.0) * number) / 4);
      yPoints[2] = (int)y + (int)((Math.sqrt(3.0) * number) / 4);
      g.drawPolygon(xPoints, yPoints, 3);

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
