//Program to demonstrate JMenubar, JMenu,
import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;

class JSwingCompEx extends JFrame {
    JSwingCompEx(){
    Container c = this.getContentPane();
BorderLayout bl = new BorderLayout();


    JMenuBar jm = new JMenuBar();
    c.add(jm);
    JMenu Fi = new JMenu("File");
    jm.add(Fi);
    JMenuItem n = new JMenuItem("New");
    JMenuItem o = new JMenuItem("Open");
    JMenuItem s = new JMenuItem("Save");

    Fi.add(n);
    Fi.add(o);
    Fi.add(s);


    JMenu Ed = new JMenu("Edit");
    jm.add(Ed);

    JMenuItem x = new JMenuItem("Cut");
    JMenuItem cp = new JMenuItem("Copy");
    JMenuItem v = new JMenuItem("Paste");

    Ed.add(x);
    Ed.add(cp);
    Ed.add(v);

    c.add("North",jm);

    }

    public static void main(String[] args)
    {
        JSwingCompEx f = new JSwingCompEx();
        f.setSize(500,400);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
