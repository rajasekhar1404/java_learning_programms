// program to demonstrate Graphics
import java.awt.*;
//import java.awt.event.*;

class GraphicsEx extends Frame {

    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        g.drawLine(200,300, 100,400);
        g.setColor(Color.gray);
        g.drawRect(100,300,400,450);
        g.setColor(Color.gray);
        g.drawOval(100,300,400,450);
        g.setColor(Color.gray);
        g.drawRoundRect(50,150,200,225,10,20);
        g.setColor(Color.gray);
        g.setFont(new Font("Arial", Font.BOLD,40));
        g.drawString("Rajasekhar",300,500);
        g.setColor(Color.blue);
        g.fillOval(50,100,150,200);
    }
    public static void main(String[] args)
    {
        GraphicsEx f = new GraphicsEx();
        f.setSize(500,400);
        f.setVisible(true);
    }
}

