package dev.gavinthomas.odyssey.ui;

import javax.swing.*;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import dev.gavinthomas.odyssey.ui.components.MenuBar;
import dev.gavinthomas.odyssey.ui.components.StatusBar;
import dev.gavinthomas.odyssey.ui.components.ToolBar;
import dev.gavinthomas.odyssey.ui.components.ViewContainer;
import dev.gavinthomas.odyssey.ui.util.GBC;

public class MainFrame extends JFrame {
    private MenuBar _menuBar;
    private ViewContainer _viewContainer;
    private ToolBar _toolBar;
    private StatusBar _statusBar;

    private final Init init = new Init();

    public MainFrame() {
        this.setLayout(new GridBagLayout());
        this.setTitle("Odyssey");
        try {
            this.setIconImage(new ImageIcon(new URL("https://cdn.icon-icons.com/icons2/2107/PNG/512/file_type_vscode_icon_130084.png")).getImage());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        init.menuBar();
        init.toolBar();
        init.viewContainer();
        init.statusBar();

//        this.initL();
//        this.setBounds(200, 200, 700, 700);
////        this.add(_viewContainer);
//        this.add(new JButton("TESTING A"), BorderLayout.PAGE_START);
//        this.add(new JButton("TESTING B"), BorderLayout.CENTER);
//        this.add(new JButton("TESTING C"), BorderLayout.PAGE_END);
//        this.validate();
//        pack();
    }

    private void initL() {

        Container p = this;
        p.setLayout(new BorderLayout());

        System.out.println(p.getLayout());

        JPanel btn1 = new JPanel();
        btn1.setBackground(new Color(255, 0, 255));
//        btn1.setSize(500, 200);
        btn1.setPreferredSize(new Dimension(700, 100));
        p.add(btn1, BorderLayout.PAGE_START);

        JPanel btn2 = new JPanel();
        btn2.setBackground(new Color(255, 0, 0));
        btn2.setPreferredSize(new Dimension(500, 500));
//        btn2.setSize(500, 200);
//        btn2.setMinimumSize(new Dimension(500, 200));
//        btn2.setMaximumSize(new Dimension(500, 200));
        p.add(btn2, BorderLayout.CENTER);


        JPanel btn3 = new JPanel();
        btn3.setBackground(new Color(0, 0, 255));
//        btn3.setSize(500, 200);

//        btn3.setMinimumSize(new Dimension(100, 100));
        btn3.setPreferredSize(new Dimension(100, 500));
        p.add(btn3, BorderLayout.LINE_START);

        JPanel btn4 = new JPanel();
        btn4.setBackground(new Color(0, 255, 0));
//        btn4.setSize(500, 200);
        btn4.setPreferredSize(new Dimension(100, 500));
        p.add(btn4, BorderLayout.LINE_END);

        JPanel btn5 = new JPanel();
        btn5.setBackground(new Color(255, 255, 0));
//        btn5.setSize(500, 200);
        btn5.setPreferredSize(new Dimension(700, 100));
        p.add(btn5, BorderLayout.PAGE_END);
//        btn5.setVisible(false);
//        p.repaint();
//        p.revalidate();
    }

    private final class Init {
        private MainFrame t = MainFrame.this;

        private void menuBar() {
            t._menuBar = new MenuBar();
            t.setJMenuBar(t._menuBar);
        }

        private void toolBar() {
            t._toolBar = new ToolBar();
            t.add(t._toolBar, new GBC(1, 1).weight(1.0, 0.0).fill(GBC.HORIZONTAL).anchor(GBC.PAGE_START));
        }

        private void viewContainer() {
            t._viewContainer = new ViewContainer();
            t.add(t._viewContainer, new GBC(1, 2).weight(1.0, 1.0).fill(GBC.BOTH).anchor(GBC.CENTER));
        }

        private void statusBar() {
            t._statusBar = new StatusBar();
            t.add(t._statusBar, new GBC(1, 3).weight(1.0, 0.0).fill(GBC.HORIZONTAL).anchor(GBC.PAGE_END));
        }
    }
}

class ToolBarOld extends JToolBar {
    private final Map<String, ToolBarOld.Button> btns = new HashMap<String, ToolBarOld.Button>();

    public ToolBarOld() {
        super.setBounds(0, 0, 1000, 500);
    }

    public void add(String id, ToolBarOld.Button btn) {
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