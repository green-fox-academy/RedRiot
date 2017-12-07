import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static void mainDraw(Graphics graphics){
    int x= 20;
    int y = 0;
    for (int i = 0; i < HEIGHT/20 ; i++) {
      y = i * 20;
      x = i * 20;
      graphics.drawLine(x,0,WIDTH,y);
    }
    for (int i = 0; i < HEIGHT/20 ; i++) {
      y = i * 20;
      x = i * 20;
      graphics.drawLine(0,y,x,WIDTH);
    }

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
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}