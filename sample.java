import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class sample extends JFrame {
    sample()
    {
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        Container c = this.getContentPane();


        ImageIcon i = new ImageIcon("sample.jpg");
        JLabel l1 = new JLabel(i);
        c.add(l1);
    }
    public static void main(String[] args)
    {
        sample f = new sample();
        f.setTitle("sample");
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}
