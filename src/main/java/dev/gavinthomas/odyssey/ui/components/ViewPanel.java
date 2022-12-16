package dev.gavinthomas.odyssey.ui.components;

import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class ViewPanel {
  JPanel comp = new JPanel();
//  public List<String>  = new ArrayList<String>;




//  void addWindow();
//
//  void removeWindow();

  public void visible(boolean tog) {
    comp.setVisible(tog);
  };

  public abstract void resize(int num);


}