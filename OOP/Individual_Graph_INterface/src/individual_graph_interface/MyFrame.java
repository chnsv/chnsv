package individual_graph_interface;
import javax.swing.*;
import java.util.*;

public class MyFrame extends JFrame{
    MyFrame(){
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        add(panel);
        setVisible(true);
    }
}