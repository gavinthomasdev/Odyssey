package dev.gavinthomas.odyssey.ui.components;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class ViewContainer extends JPanel {
  public ViewContainer() {
    this.init();
  }

  public void init() {
//    this.setMinimumSize(new Dimension(200, 200));
    this.setBackground(new Color(0, 255, 0));
  }
}
