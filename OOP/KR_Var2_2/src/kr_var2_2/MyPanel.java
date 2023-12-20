package kr_var2_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

class MyPanel extends JPanel{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4,f5,f6;
    JButton button;
    
    MyPanel(){             
        l1 = new JLabel("a:");
        add(l1);
        f1 = new JTextField();
        f1.setColumns(10);
        add(f1);
        l2 = new JLabel("b:");
        add(l2);
        f2 = new JTextField();
        f2.setColumns(10);
        add(f2);
        l3 = new JLabel("c:");
        add(l3);
        f3 = new JTextField();
        f3.setColumns(10);
        add(f3);
        l4 = new JLabel("Square: ");
        add(l4);
        f4 = new JTextField();
        f4.setColumns(10);
        add(f4);
        l5 = new JLabel("Perimetr: ");
        add(l5);
        f5 = new JTextField();
        f5.setColumns(10);
        add(f5);
        button = new JButton("Enter");
        MyListener m = new MyListener();
        button.addActionListener(m);
        add(button);
    }
    
    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int s1 = Integer.parseInt(f1.getText());
            int s2 = Integer.parseInt(f2.getText());
            int s3 = Integer.parseInt(f3.getText());
            int p = s1+s2+s3;
            int pp = p/2;
            double s = Math.sqrt(pp*(pp-s1)*(pp-s2)*(pp-s3));
            
            f4.setText(String.valueOf(s));
            f5.setText(String.valueOf(p));
        }
    }
}