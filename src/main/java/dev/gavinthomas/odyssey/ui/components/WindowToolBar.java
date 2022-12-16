package dev.gavinthomas.odyssey.ui.components;

import dev.gavinthomas.odyssey.ui.util.components.RotatedButton;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class WindowToolBar extends JPanel {
  public WindowToolBar(Direction dir) {
//    this.setOrientation(dir.rotation == 0 ? 0 : 1);
    this.setPreferredSize((dir.rotation == 0 ? new Dimension(0, 60) : new Dimension(60, 0)));
    this.setBackground(new Color(0, 0, 0));
//    JButton btn = new JButton("TESTING");
//    this.setLayout(new FlowLayout(FlowLayout.LEFT));
//    btn.

//    this.add(btn);
    RotatedButton btn2 = new RotatedButton("TESTING", dir.rotation);
    this.add(btn2);
    btn2.setSize(dir.rotation == 0 ? new Dimension(150, 30) : new Dimension(30, 150));
//    System.out.println(btn2.getPreferredSize().width + ", " + btn2.getPreferredSize().height);
//    this.revalidate();

  }


  public static enum Direction {
    TOP(0),
    LEFT(-90),
    RIGHT(90),
    BOTTOM(0);

    public final int rotation;

    Direction(int rotation) {
      this.rotation = rotation;
    }
  }
}
