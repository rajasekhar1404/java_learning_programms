//program to demonstrate components, JLabel,
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class ComponentEx extends JFrame implements ActionListener{
    
    JLabel l1;
    ImageIcon img;
    ComponentEx()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        Container c = this.getContentPane();

        //button creation with image
        img = new ImageIcon("DP-v2.png");
        JButton b1 = new JButton("Rajasekhar",img);
        b1.addActionListener(this);
        c.add(b1);

        //checkbox creation with an array
        String India[] = {"Telangana","Andhra Pradhesh","Tamilnadu","Kerala","Madya Pradesh"};
        JComboBox j1 = new JComboBox(India);
        // j1.addItem("India");
        // j1.addItem("US");
        // j1.addItem("UK");
        c.add(j1);
        j1.addActionListener(this);

        //label creation
        l1 = new JLabel();
        c.add(l1);

        //list creation
        String Names[] = {"Rajasekhar","Aryan","Kranthi","Rajkumar"};
        JList list = new JList(Names);
        c.add(list);
    }

    public void actionPerformed(ActionEvent e)
    {
        l1.setText("Rajasekhar");
        l1.setIcon(img);
        System.out.println("Button clicked "+new Date());

    }

    // public void actionPerformed(ActionEvent f)
    // {
    //     System.out.println("Button clicked "+new Date());
    // }


    public static void main(String[] args)
    {
        ComponentEx f = new ComponentEx();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
