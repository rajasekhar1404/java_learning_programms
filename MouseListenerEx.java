// program to demonstrate mouse listener, adopter classes, anonymous classes.
import java.awt.*;
import java.awt.event.*;

class MouseListenerEx extends Frame {

    MouseListenerEx()
    {
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
        Button b1 = new Button("First");
        this.add(b1);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        b1.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                System.out.println("MouseEntered");
            }

            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse clicked on the button");
            }
        });
    }
    public static void main(String[] args)
    {
        MouseListenerEx f = new MouseListenerEx();
        f.setSize(400,400);
        f.setVisible(true);

    }
}
