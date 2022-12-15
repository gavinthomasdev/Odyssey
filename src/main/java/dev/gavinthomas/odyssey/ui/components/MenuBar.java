package dev.gavinthomas.odyssey.ui.components;

import dev.gavinthomas.odyssey.ui.MainFrame;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.LookAndFeel;
import java.awt.Color;
import java.util.Map;
import java.util.HashMap;

public class MenuBar extends JMenuBar {
    public final Map<Menu, CustomMenu> menus;
    public MenuBar() {
        this.menus = new HashMap<Menu, CustomMenu>();
        this.init();
//        super.setVisible(true);
    }

    public void init() {
        for (Menu m : Menu.values()) {
            CustomMenu cm = new CustomMenu(m.getName());
//            cm.setForeground(new Color(255, 255, 255));
            this.add(cm);
            menus.put(m, cm);
        }
//        this.setBackground(new Color(14, 17, 24));
//        this.setForeground(new Color(255, 255, 255));
    }

    public static enum Menu {
        FILE("File"),
        EDIT("Edit"),
        VIEW("View"),
        TOOLS("Tools");

        private String name;

        Menu(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public static Menu get(String str) {
            for (Menu m : Menu.values()) {
                if (m.name().equals(str.toUpperCase())) {
                    return m;
                }
            }
            return null;
        }
    }
}

class CustomMenu extends JMenu {
    public CustomMenu(String name) {
        super(name);
    }
}

//
//class TestMenu extends JMenu {
//    public TestMenu() {
//        JMenuItem idk = new JMenuItem("abc");
//        setName("Idk");
//        add(idk);
//        idk.setEnabled(true);
//        idk.setVisible(true);
////        super.setVisible(true);
////        super.setEnabled(true);
//    }
//}