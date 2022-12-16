package dev.gavinthomas.odyssey.ui.util.components;

import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class RotatedButton extends JButton {
  private double angle;

  public RotatedButton(String text, double angle) {
    super(text);
//    this.setComponentOrientation(ComponentOrientation);
//    this.angle = angle * (Math.PI / 180);
    angle = (angle < 0 ? 360 + angle : angle);
    this.angle = (Math.PI * 2) * (angle / 360);
    this.setPreferredSize(angle == 0 ? new Dimension(150, 30) : new Dimension(30, 150));
//    this.setPreferredSize(new Dimension(150, 30));
    //    this.angle = angle;
//    setUI(new RotatedButtonUI());
    this.repaint();
  }



  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D gx = (Graphics2D) g;
    AffineTransform at = new AffineTransform();
    at.rotate(angle, getWidth() / 2, getHeight() / 2);
//    gx.rotate(angle, getX() + getWidth()/2, getY() + getHeight()/2);
    gx.transform(at);
    super.paintComponent(gx);
  }

//  private class RotatedButtonUI extends BasicButtonUI {
//    public void paint(Graphics g, AbstractButton b) {
//      Graphics2D g2 = (Graphics2D) g.create();
//      AffineTransform at = new AffineTransform();
//      at.rotate(angle, b.getWidth() / 2, b.getHeight() / 2);
//      g2.transform(at);
//      super.paint(g2, b);
//      g2.dispose();
//    }
//  }
}
