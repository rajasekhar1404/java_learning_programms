//program to demonstrate Cardlayout

import java.awt.*;
class CardLayoutEx extends Frame {
    public static void main(String[] args)
    {
        Frame f = new Frame("Rajasekhar");
        f.setSize(200,400);
        f.setVisible(true);

        CardLayout cl = new CardLayout();
        f.setLayout(cl);

        Button b = new Button("First");
        f.add("first", b);

        Button b1 = new Button("Second");
        f.add("Second", b1);

        Button b2 = new Button("Third");
        f.add("Third", b2);

        Button b3 = new Button("Fourth");
        f.add("Fourth", b3);

        Button b4 = new Button("Fifth");
        f.add("Fifth", b4);

        Button b5 = new Button("Sixth");
        f.add("Sixth", b5);

        cl.show(f,"Fourth");

    }
}
