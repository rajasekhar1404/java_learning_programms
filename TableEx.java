//program to ddemonstrate tabel example
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class TableEx extends JFrame {
    TableEx()
    {
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
        Container c = this.getContentPane();

        // String rows[][] = {{"1","Rajasekhar","59"},{"2","AryanRaj","99"}};
        // String cols[] = {"R.No","Name","Marks"};
        Vector<Vector> rows = new Vector<Vector>();
        Vector rowone = new Vector();
        rowone.add("1");
        rowone.add("Rajasekhar");
        rowone.add("99");

        Vector rowtwo = new Vector();
        rowtwo.add("2");
        rowtwo.add("AryanRaj");
        rowtwo.add("59");

        Vector rowthree = new Vector();
        rowthree.add("2");
        rowthree.add("AryanRaj");
        rowthree.add("59");

        rows.add(rowone);
        rows.add(rowtwo);
        rows.add(rowthree);

        Vector cols = new Vector();
        cols.add("R.no");
        cols.add("Name");
        cols.add("Marks");

        
        JTable t1 = new JTable(rows,cols);
        JScrollPane jsp = new JScrollPane(t1);
        c.add(jsp);
    }

    public static void main(String[] args)
    {
        TableEx f = new TableEx();
        f.setSize(500,400);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
