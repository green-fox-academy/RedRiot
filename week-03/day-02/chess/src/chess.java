import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class chess {

  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.
    int row;
    int col;
    int x,y;

    for ( row = 0;  row < 16;  row++ ) {

      for ( col = 0;  col < 16;  col++) {
        x = col * 20;
        y = row * 20;
        if ( (row % 2) == (col % 2) )
          graphics.setColor(Color.white);
        else
          graphics.setColor(Color.black);
        graphics.fillRect(x, y, 20, 20);
      }

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