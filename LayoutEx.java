import java.awt.*;
class LayoutEx extends Frame{
    public static void main(String[] args)
    {
        Frame f = new Frame("rajasekhar");
        f.setSize(200,300);
        f.setVisible(true);

        BorderLayout bl = new BorderLayout(50,50);
        
      //  FlowLayout fl = new FlowLayout(FlowLayout.LEFT,10,20);
        f.setLayout(bl);

        Button b1 = new Button("first");
        f.add(b1,BorderLayout.WEST);

        Button b2 = new Button("Second");
        f.add(b2,BorderLayout.SOUTH);

        Button b3 = new Button("Third");
        f.add(b3,BorderLayout.NORTH);

        Button b4 = new Button("Fourth");
        f.add(b4,BorderLayout.CENTER);

        Button b5 = new Button("Fifth");
        f.add(b5,BorderLayout.EAST);

        f.setBackground(Color.DARK_GRAY);

        
    }
}
