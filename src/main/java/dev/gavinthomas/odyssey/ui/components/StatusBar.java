package dev.gavinthomas.odyssey.ui.components;

import javax.swing.JToolBar;
import java.awt.Color;
import java.awt.Dimension;

public class StatusBar extends JToolBar {
  public StatusBar() {
    this.init();
  }
  private void init() {
    this.setBackground(new Color(0, 0, 255));
    this.setPreferredSize(new Dimension(1, 20));
//    this.setSize(1, 40);
  }
}
