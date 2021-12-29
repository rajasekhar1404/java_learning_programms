//program to demonstrate frames in swings of java
import javax.swing.*;
import java.awt.*;

class SwingsFrame {
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Rajasekhar");
        f.setSize(400,500);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);
        Container c = f.getContentPane();

        JButton b1 = new JButton("First");
        c.add(b1);
    }
}
