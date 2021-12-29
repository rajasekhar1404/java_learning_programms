//program to demonstrate JSplitpane example
import javax.swing.*;
import java.awt.*;


class JSplitpaneEx extends JFrame {
    JSplitpaneEx()
    {
        Container c = this.getContentPane();

        JButton B1 = new JButton("LEFT");
        JCheckBox C1 = new JCheckBox("Right");

        JSplitPane jsp = new JSplitPane(JSplitPane.	HORIZONTAL_SPLIT, B1, C1);

        c.add(jsp);
    }

    public static void main(String[] args)
    {
        JSplitpaneEx f = new JSplitpaneEx();
        f.setSize(500,400);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
