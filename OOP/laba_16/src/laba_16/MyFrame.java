package laba_16;

import javax.swing.*;
import java.util.*;

public class MyFrame extends JFrame{
    MyFrame(){
        setSize(850,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        add(panel);
        setVisible(true);
    }
}