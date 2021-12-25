//program to demonstrate tabbed pane
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TabbedPaneEx extends JFrame {
    TabbedPaneEx()
    {
        
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
        Container c = this.getContentPane();
     
        //Tab pane creation
        JTabbedPane tb = new JTabbedPane(JTabbedPane.TOP);
        this.add(tb);
        tb.add("Homee", new Home());
        tb.add("View", new Animations());
    }

public static void main(String[] args)
    {
        TabbedPaneEx f = new TabbedPaneEx();
        f.setSize(500,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}

class Home extends JPanel
{
    Home()
    {
        JButton b1 = new JButton("File");
        JButton b2 = new JButton("Clipboard");
        JButton b3 = new JButton("Insert");
        JButton b4 = new JButton("Design");
        JButton b5 = new JButton("View");

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
    }
}

class Animations extends JPanel
{
    Animations()
    {
        JButton b1 = new JButton("Preview");
        JButton b2 = new JButton("Animation");
        JButton b3 = new JButton("Advanced animation");
        JButton b4 = new JButton("Timing");
        JButton b5 = new JButton("Other");

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
    }
}