//program to demonstrate Keylistener
import java.awt.*;
import java.awt.event.*;

class KeyListenerEx extends Frame {
    
    String msg = "";
    KeyListenerEx()
    {
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
        TextArea ta = new TextArea();
        ta.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e)
            {
                int code = e.getKeyCode();
                String keyname = e.getKeyText(code);
                msg = keyname+" - "+code;
                
                repaint();
            }
        });
        this.add(ta);

    }


    public void paint(Graphics g)
    {
        g.drawString(msg,300,300);
    }

    public static void main(String[] args)
    {
        KeyListenerEx f = new KeyListenerEx();
        f.setSize(400,400);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            } 
        });
    }
}