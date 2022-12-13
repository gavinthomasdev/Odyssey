package dev.gavinthomas.odyssey.ui;

import dev.gavinthomas.odyssey.ui.CustomSettingsProvider;

import javax.swing.*;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import com.jediterm.terminal.Terminal;
import com.jediterm.terminal.TerminalMode;
import com.jediterm.terminal.TextStyle;
import com.jediterm.terminal.model.CharBuffer;
import com.jediterm.terminal.model.JediTerminal;
import com.jediterm.terminal.ui.JediTermWidget;
import com.jediterm.terminal.ui.TerminalPanel;
import com.jediterm.terminal.model.TerminalTextBuffer;
import com.jediterm.terminal.model.StyleState;
import com.jediterm.terminal.TerminalColor;
import com.jediterm.terminal.ui.settings.DefaultSettingsProvider;
import com.intellij.openapi.wm.ToolWindow;
import dev.gavinthomas.odyssey.ui.components.MenuBar;

public class MainFrame extends JFrame {
//    public static interface MainFrameComp {}
//    private final ToolBar _toolBar;
    private JButton _toolBar_testButton;
    private JediTermWidget _terminal;

    private JMenuBar _mb;
    private MenuBar _menuBar;
    private JInternalFrame jif;
    private JFrame jdp;
    private TerminalPanel t2;
    public MainFrame() {
//        this._toolBar = new ToolBar();
        this._terminal = new JediTermWidget(50, 10, new CustomSettingsProvider());
        this.jif = new JInternalFrame("Testing", true, true, true);
        this.jdp = new JFrame();
        this._menuBar = new MenuBar();
//        this._menuBar.setBounds(0, 0, 200, 100);
//        StyleState ss = new StyleState();
//        ss.setDefaultStyle(new TextStyle(new TerminalColor(255, 255, 255), new TerminalColor(0, 0, 0)));
//        this.t2 = new TerminalPanel(new DefaultSettingsProvider(), new TerminalTextBuffer(50, 10, ss), ss);
        this._mb = new JMenuBar();
        this.setUp();
    }

    private void setUp() {
//        this.add(_terminal);
        this.setSize(1200, 700);
        _terminal.setVisible(true);
        _terminal.setEnabled(true);
//        _terminal.close();
        System.out.println(_terminal.getActions());
        _terminal.setBounds(0, 0, 1000, 500);
        Terminal t = (JediTerminal) _terminal.getTerminal();
        TerminalPanel tp = _terminal.getTerminalPanel();
        t.cursorDown(10);
//        t.setAnsiConformanceLevel(1);
//        t.writeCharacters("\033[38;2;255;0;0mABC123\033[0m");
//        _terminal.getTerminalStarter().sendString("\033[1mllllll");
        t.writeUnwrappedString("\nABC123");
        t.writeCharacters("TESTING123");
        this.add(jif);
        this.jif.setVisible(true);
        this.jif.setBounds(0, 0, 200, 200);
        this.jdp.setVisible(true);
        this.jdp.setBounds(0, 0, 200, 200);
        this.setJMenuBar(_menuBar);
        _menuBar.init();
        this.setTitle("Odyssey");
//        _menuBar.setVisible(true);
//        JMenu jm = new JMenu("TEST");
//        _mb.add(jm);
//        jm.add(new JMenuItem("abc"));
//        _mb.setVisible(true);
//        new JMenuItem();

//        this.setJMenuBar(_menuBar);
//        _menuBar.setVisible(true);
//        this.revalidate();
//        this.repaint();

//        this.add(t2);
//        t2.setVisible(true);
//        t2.setBounds(0, 0, 1000, 500);
//        t2.init(new JScrollBar());
//        t2.handleKeyEvent(new KeyEvent(t2, 1, 1, 0, 65));
//        t2.setBlinkingCursor(true);
//        t2.setCursor(5, 5);
//        t2.setCursorVisible(true);
//        t2.getTerminalTextBuffer().writeString(2, 2, new CharBuffer("\033[1mabc\033[0m"));
//        _terminal.getTerminalStarter().sendString("abc", true);
//        t.setModeEnabled(TerminalMode.InsertMode, true);
//        this.add(_toolBar);
//
//        _toolBar.setVisible(true);
//        _toolBar.add("test", new ToolBar.Button("ABC", new ImageIcon("https://www.google.com/logos/doodles/2022/seasonal-holidays-2022-6753651837109831.7-ladc.gif"), (objects) -> {
//            System.out.println("abc");
//        }));
    }
    private abstract class setUp {
        private void toolBar() {
//            MainFrame.this._toolBar.setFloatable(false);

        }
    }
}

class ToolBar extends JToolBar {
    private final Map<String, ToolBar.Button> btns = new HashMap<String, ToolBar.Button>();

    public ToolBar() {
        super.setBounds(0, 0, 1000, 500);
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