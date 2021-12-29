//program to demonstrate label, textarea, textfield, checkbox, radio button, button, in swing
import javax.swing.*;
import java.awt.*;

class JSwingCOMPSeX extends JFrame {
    JSwingCOMPSeX()
    {
        Container c = this.getContentPane();
        c.setLayout(null);

        JLabel l1 = new JLabel("Name");
        l1.setBounds(20,30,100,20);
        c.add(l1);

        JLabel l2 = new JLabel("TextArea");
        l2.setBounds(20,80,100,20);
        c.add(l2);

        JLabel l3 = new JLabel("TextField");
        l3.setBounds(20,120,100,60);
        c.add(l3);

        JLabel l4 = new JLabel("CheckBoxs");
        l4.setBounds(20,170,100,20);
        c.add(l4);


        JTextArea ta = new JTextArea();
        ta.setBounds(80, 30, 100, 20);
        c.add(ta);

        JTextField tf = new JTextField();
        ta.setBounds(100,120,100,30);
        c.add(tf);

        JCheckBox cb1 = new JCheckBox("Telugu");
        cb1.setBounds(100,170,100,20);
        c.add(cb1);

        JCheckBox cb2 = new JCheckBox("English");
        cb2.setBounds(200,170,100,20);
        c.add(cb2);

        ButtonGroup bg = new ButtonGroup();

        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(200, 200, 100,20);
        c.add(rb1);

        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(300, 200, 100,20);
        c.add(rb2);

        bg.add(rb1);
        bg.add(rb2);

        JButton b1 = new JButton("Submit");
        b1.setBounds(250, 250, 100,20);
        c.add(b1);
    }

    public static void main(String[] args)
    {
        JSwingCOMPSeX f = new JSwingCOMPSeX();
        f.setSize(500,400);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
