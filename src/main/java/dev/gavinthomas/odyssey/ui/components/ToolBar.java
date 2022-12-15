package dev.gavinthomas.odyssey.ui.components;

import javax.swing.JToolBar;
import java.awt.Color;

public class ToolBar extends JToolBar {
  public ToolBar() {
    this.init();
  }
  private void init() {
    this.setBackground(new Color(255, 0, 0));
  }
}
