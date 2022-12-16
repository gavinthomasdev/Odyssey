package dev.gavinthomas.odyssey.ui.util.components;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class RotatedButton extends JButton {
  private double angle;

  public RotatedButton(String text, double angle) {
    super(text);
    this.angle = angle * (Math.PI / 180);
//    this.angle = angle;
    setUI(new RotatedButtonUI());
  }

  private class RotatedButtonUI extends BasicButtonUI {
    public void paint(Graphics g, AbstractButton b) {
      Graphics2D g2 = (Graphics2D) g.create();
      AffineTransform at = new AffineTransform();
      at.rotate(angle, b.getWidth() / 2, b.getHeight() / 2);
      g2.transform(at);
      super.paint(g2, b);
      g2.dispose();
    }
  }
}
