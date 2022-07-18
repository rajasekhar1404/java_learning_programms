//program to demonstrate grid layout
import java.awt.*;

class GridLayoutEx extends Frame {
    public static void main(String[] args)
    {
        Frame f = new Frame("Rajasekhar");
        f.setSize(200,400);
        f.setVisible(true);

        GridLayout gl = new GridLayout(2,3,60,30);
        f.setLayout(gl);

        Button b = new Button("First");
        f.add(b);

        Button b1 = new Button("Second");
        f.add(b1);

        Button b2 = new Button("Third");
        f.add(b2);

        Button b3 = new Button("Fourth");
        f.add(b3);

        Button b4 = new Button("Fifth");
        f.add(b4);

        Button b5 = new Button("Sixth");
        f.add(b5);
    }
}
