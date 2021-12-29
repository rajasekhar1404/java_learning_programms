// program to demonstrate checkboxes

import java.awt.*;
import java.awt.event.*;

class CheckboxEx extends Frame implements ItemListener
{    
    Checkbox c1,c2,c3,c4;
    CheckboxEx()
    {
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        CheckboxGroup cb = new CheckboxGroup();


        c1 = new Checkbox("Sunday",false,cb);
        this.add(c1);
        c1.addItemListener(this);

        c2 = new Checkbox("Monday",false,cb);
        this.add(c2);
        c2.addItemListener(this);

        c3 = new Checkbox("Teusday",false,cb);
        this.add(c3);
        c3.addItemListener(this);

        c4 = new Checkbox("Wednusday");
        this.add(c4);
        c4.addItemListener(this);


    }

    public void paint(Graphics g)
    {
        g.drawString("today is Monday: "+c1.getState(),10, 150);
        g.drawString("today is Monday: "+c2.getState(),10,170);
        g.drawString("today is Monday: "+c3.getState(),10,190);
        g.drawString("today is Monday: "+c4.getState(),10,210);
        
    }

    public void itemStateChanged(ItemEvent e)
    {
        repaint();
    }

    public static void main(String[] args)
    {
        CheckboxEx f = new CheckboxEx();
        f.setSize(400,400);
        f.setVisible(true);
    }    
}
