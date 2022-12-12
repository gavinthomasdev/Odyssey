package dev.gavinthomas.odyssey;

import dev.gavinthomas.odyssey.ui.MainFrame;

//import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.JFrame;
public class Odyssey {
    public static void main(String[] args) {
//        JFrame f = new JFrame();// creating instance of JFrame
//
//        JButton b = new JButton("click");// creating instance of JButton
//        b.setBounds(130, 100, 100, 40);// x axis, y axis, width, height
//
//        b.addActionListener((e) -> {
//            System.exit(0);
//        });
//
//        f.add(b);// adding button in JFrame
//
//        f.setBounds(200, 200, 400, 500);// 400 width and 500 height
//        f.setMinimumSize(new Dimension(400, 500));// 400 width and 500 height
//        // f.setResizable(true);
//        f.setLayout(null);// using no layout managers
//        // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);// making the frame visible
        MainFrame f = new MainFrame();
//        f.setBounds(200, 200, 400, 500);// 400 width and 500 height
//        f.setMinimumSize(new Dimension(400, 500));// 400 width and 500 height
        f.setLayout(null);// using no layout managers
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);// making the frame visible
    }
}