//program to demonstrate window listner.
import java.awt.*;
import java.awt.event.*;
class WindowListenerEx {
    public static void main(String[] args)  
    { 

    Frame a = new Frame("Rajasekhar");
    
    a.setSize(400,600);

    a.setVisible(true);

    //step-2: add listener
        a.addWindowListener(new MyListener());
    }
}

class MyListener implements WindowListener
{
    //methods

    // closing method
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    public void windowActivated(WindowEvent e)
    {
        System.out.println("window activated");
    }

    public void windowClosed(WindowEvent e)
    {
        System.out.println("window CLOSED");
    }

    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("window DEIACTIVATED");
    }

    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("window DEICONFIED");
    }

    public void windowIconified(WindowEvent e)
    {
        System.out.println("window ICONIFIED");
    }

    public void windowOpened(WindowEvent e)
    {
        System.out.println("window OPENED");
    }
}