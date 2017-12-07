import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class main {
  static Graphics g;

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.
    int x = 0;
    int y = 0;
    for(int i = 0; i < 18; i ++) {

      LineDraw(x, y);
      x = i * 20;

    }

    for(int i = 0; i < 18; i ++) {

      LineDraw(x, y);
      y = i * 20;

    }
    for(int i = 0; i < 18; i ++) {

      LineDraw(x, HEIGHT);
      x = i * 20;
    }
    for(int i = 0; i < 19; i ++) {

      LineDraw(0, y);
      y = i * 20;}




  }

  public static void LineDraw(int StartingX , int StartingY) {
    g.drawLine(StartingX,StartingY,WIDTH/2,HEIGHT/2);
    return;

  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

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
