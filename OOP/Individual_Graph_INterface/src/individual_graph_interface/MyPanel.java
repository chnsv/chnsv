package individual_graph_interface;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

class MyPanel extends JPanel{
    JLabel l1,l2,l3,l4,l5;
    JTextField f1,f2,f3,f4;
    ArrayList<JTextField> textFields= new ArrayList<>( Arrays.asList(f1,f2,f3,f4));
    ArrayList<JLabel> labels = new ArrayList<>(Arrays.asList(l1,l2,l3,l4,l5));
    ArrayList<String> names = new ArrayList<>(Arrays.asList("Name", "Population", "Square", "District"));
    JButton deleteButton, addButton, sortButton;
    JList list;
    DefaultListModel model;
    
    MyPanel(){
        CityRussia cityRussia = new CityRussia();
        for(int i = 0;i<textFields.size();i++){
            labels.set(i, new JLabel(names.get(i)));
            add(labels.get(i));
            textFields.set(i, new JTextField());
            textFields.get(i).setColumns(5);
            add(textFields.get(i));
        }
        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListIterator<JTextField> it = textFields.listIterator();
                cityRussia.add(new City(it.next().getText(),it.next().getText(),it.next().getText(),it.next().getText()));
                model.addElement(cityRussia.getLast());
                it = textFields.listIterator();
                while (it.hasNext()) it.next().setText("");
            }
        });
        add(addButton);
        
        deleteButton = new JButton("Delate");
        deleteButton.addActionListener(e -> {
            int selectedIndex = list.getSelectedIndex();
            if (selectedIndex != -1) {
                cityRussia.del(cityRussia.getAddrCity().get(selectedIndex));
                model.remove(selectedIndex);
            }
        });
        add(deleteButton);
        
        sortButton = new JButton("Sorted:");
        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cityRussia.sortBySquare();
                model = new DefaultListModel();
                for (City CG: cityRussia.getAddrCity()) 
                    model.addElement(CG);
                list.setModel(model);
            }
        });
        add(sortButton);
        
        model = new DefaultListModel<>();
        list = new JList(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(250,80));
        add(list);
    }

    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent  e) {
            add(f1);
            add(f2);
            add(f3);
            add(f4);
        }
    }
}