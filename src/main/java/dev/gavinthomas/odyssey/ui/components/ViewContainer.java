package dev.gavinthomas.odyssey.ui.components;

import dev.gavinthomas.odyssey.Odyssey;
import dev.gavinthomas.odyssey.ui.MainFrame;
import dev.gavinthomas.odyssey.ui.components.ViewPanel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Map;
import java.util.HashMap;

public class ViewContainer extends JPanel {
  private Map<View, ViewPanel> views = new HashMap<View, ViewPanel>();
  private Map<WindowToolBar.Direction, WindowToolBar> toolBars = new HashMap<WindowToolBar.Direction, WindowToolBar>();
  private MainFrame mf = Odyssey.getMain();

  public ViewContainer() {
    this.setLayout(new BorderLayout());
    this.add(new WindowToolBar(WindowToolBar.Direction.TOP), BorderLayout.PAGE_START);
    this.add(new WindowToolBar(WindowToolBar.Direction.LEFT), BorderLayout.LINE_START);
    this.add(new JPanel(), BorderLayout.CENTER);
    this.add(new WindowToolBar(WindowToolBar.Direction.RIGHT), BorderLayout.LINE_END);
    this.add(new WindowToolBar(WindowToolBar.Direction.BOTTOM), BorderLayout.PAGE_END);
    this.init();
  }

  public void init() {
//    this.setMinimumSize(new Dimension(200, 200));
    this.setBackground(new Color(0, 255, 0));

  }

  private ViewPanel v(View vw) {
    return views.get(vw);
  }
}


//class ViewPanel extends JPanel {
//  public ViewPanel() {
////    super()
//  }
//}

enum View {
  TOP,
  LEFT,
  CENTER,
  RIGHT,
  BOTTOM;
}
