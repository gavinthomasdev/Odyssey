package dev.gavinthomas.odyssey.ui.components;

import dev.gavinthomas.odyssey.ui.util.components.RotatedButton;

import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.Color;
import java.awt.Dimension;

public class WindowToolBar extends JToolBar {
  public WindowToolBar(Direction dir) {
    this.setOrientation(dir.rotation);
    this.setPreferredSize((dir.rotation == 0 ? new Dimension(0, 20) : new Dimension(20, 0)));
    this.setBackground(new Color(0, 0, 0));
    JButton btn = new JButton("TESTING");
//    btn.

    this.add(btn);
//    this.add(new RotatedButton("TESTING", (dir.rotation == 0 ? 0 : 180)));
  }


  public static enum Direction {
    TOP(0),
    LEFT(1),
    RIGHT(1),
    BOTTOM(0);

    public final int rotation;

    Direction(int rotation) {
      this.rotation = rotation;
    }
  }
}
