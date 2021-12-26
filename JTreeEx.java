//Program to demonstrate JTree example
import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
// java.awt.event.*;

class JTreeEx extends JFrame {
    JTreeEx()
    {
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        Container c = this.getContentPane();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Object");
        DefaultMutableTreeNode Comp = new DefaultMutableTreeNode("Component");
        DefaultMutableTreeNode Cont = new DefaultMutableTreeNode("Container");
        DefaultMutableTreeNode Win = new DefaultMutableTreeNode("Window");
        DefaultMutableTreeNode Frame = new DefaultMutableTreeNode("Frame");
        DefaultMutableTreeNode JComp = new DefaultMutableTreeNode("JComponent");
        DefaultMutableTreeNode JWin = new DefaultMutableTreeNode("JWindow");
        DefaultMutableTreeNode JFr = new DefaultMutableTreeNode("JFrame");
        DefaultMutableTreeNode JLab = new DefaultMutableTreeNode("JLabel");
        DefaultMutableTreeNode JCB = new DefaultMutableTreeNode("JComboBox");
        DefaultMutableTreeNode JL = new DefaultMutableTreeNode("JList");
        DefaultMutableTreeNode JTP = new DefaultMutableTreeNode("JTabelPane");
        DefaultMutableTreeNode JT = new DefaultMutableTreeNode("JTable");
        DefaultMutableTreeNode JTH = new DefaultMutableTreeNode("JTableHeader");
        DefaultMutableTreeNode JTR = new DefaultMutableTreeNode("JTree");
        DefaultMutableTreeNode JSB = new DefaultMutableTreeNode("JScrollBar");

        root.add(Comp);
        Comp.add(Cont);
        Cont.add(Win);
        Cont.add(JComp);
        Win.add(Frame);
        Win.add(JWin);
        Frame.add(JFr);
        JComp.add(JLab);
        JComp.add(JCB);
        JComp.add(JL);
        JComp.add(JTP);
        JComp.add(JT);
        JComp.add(JTH);
        JComp.add(JTR);
        JComp.add(JSB);


        JTree t = new JTree(root);
        c.add(t);

    }

    public static void main(String[] args)
    {
        JTreeEx f = new JTreeEx();
        f.setSize(500,400);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
