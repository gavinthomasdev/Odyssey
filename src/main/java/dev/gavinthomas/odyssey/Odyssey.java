package dev.gavinthomas.odyssey;


import com.formdev.flatlaf.FlatDarkLaf;
import dev.gavinthomas.odyssey.ui.MainFrame;

//import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Odyssey {
    private static MainFrame mainFrame;
    public static void main(String[] args) {
        FlatDarkLaf.setup();

        Odyssey.mainFrame = new MainFrame();
        MainFrame f = Odyssey.mainFrame;
//        f.setBounds(200, 200, 700, 700);// 400 width and 500 height
//        f.setMinimumSize(new Dimension(400, 500));// 400 width and 500 height
//        f.setLayout(null);// using no layout managers
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);// making the frame visible
//        f.revalidate();
//        f.repaint();
    }
    public static MainFrame getMain() {
        return Odyssey.mainFrame;
    }
}