package dev.gavinthomas.odyssey.ui;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MainFrame extends JFrame {
//    public static interface MainFrameComp {}
    private final ToolBar _toolBar;
    private JButton _toolBar_testButton;
    public MainFrame() {
        this._toolBar = new ToolBar();
        this.setUp();
    }

    private void setUp() {
        this.add(_toolBar);

        _toolBar.setVisible(true);
        _toolBar.add("test", new ToolBar.Button("ABC", new ImageIcon("https://www.google.com/logos/doodles/2022/seasonal-holidays-2022-6753651837109831.7-ladc.gif"), (objects) -> {
            System.out.println("abc");
        }));
    }
    private abstract class setUp {
        private void toolBar() {
            MainFrame.this._toolBar.setFloatable(false);

        }
    }
}

class ToolBar extends JToolBar {
    private final Map<String, ToolBar.Button> btns = new HashMap<String, ToolBar.Button>();

    public ToolBar() {
        super.setBounds(0, 0, 400, 500);
    }

    public void add(String id, ToolBar.Button btn) {
//        btns.
        super.add(btn);
        btns.put(id, btn);
        this.visible(id, true);
    }
    public void remove(String id) {
        if (btns.get(id) != null) {
            super.remove(btns.get(id));
        }
    }
    public void visible(String id, boolean tog) {
        if (btns.get(id) != null) {
            btns.get(id).setVisible(tog);
        }
    }

    public void enabled(String id, boolean tog) {
        if (btns.get(id) != null) {
            btns.get(id).setEnabled(tog);
        }
    }
    public static class Button extends JButton {
        public Button(String name, ImageIcon icon, Consumer<Object[]> runner) {
            super();
            this.setIcon(icon);
            this.setName(name);
        }
    }

    public static enum BtnType {
        TEST(1);

        private int defaultPos;

        BtnType(int defaultPos) {
            this.defaultPos = defaultPos;
        }
        public int getDefaultPos() {
            return defaultPos;
        }
    }
}