package kr_var1_2;
import javax.swing.*;
import java.util.*;

class MyFrame extends JFrame{
    MyFrame(){
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        add(panel);
        setVisible(true);
    }
}