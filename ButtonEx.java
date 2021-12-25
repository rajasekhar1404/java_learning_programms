// program to demonstrate button ex
import java.awt.*;
import java.awt.event.*;



class ButtonEx extends Frame implements ActionListener, ItemListener {
ButtonEx()
{
    FlowLayout fl = new FlowLayout();
    this.setLayout(fl);

    Button b1 = new Button("First");
    this.add(b1);

    b1.addActionListener(this);

    Button b2 = new Button("Second");
    this.add(b2);

    b2.addActionListener(this);

    Button b3 = new Button("Third");
    this.add(b3);

    b3.addActionListener(this);



}

public void actionPerformed(ActionEvent e)
{
    String bname = e.getActionCommand();

    if(bname.equals("First"))
    {
        this.setBackground(Color.BLUE);
        System.out.println("color blue set");
    }

    if(bname.equals("Second"))
    {
        this.setBackground(Color.RED);
        System.out.println("color RED set");
    }

    if(bname.equals("Third"))
    {
        this.setBackground(Color.GREEN);
        System.out.println("color GREEN set");
    }
}

public void itemStateChanged(ItemEvent e)
{
 System.out.println(e.getItem());
}

    public static void main(String[] args)
    {
        ButtonEx f = new ButtonEx();
        f.setSize(200,400);
        f.setVisible(true);

        Checkbox cb = new Checkbox("Rajasekhar",true);
        f.add(cb);
        cb.addItemListener(f);

    }    
}
