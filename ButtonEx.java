// program to demonstrate button ex
import java.awt.*;
import java.awt.event.*;



class ButtonEx extends Frame implements ActionListener {
ButtonEx()
{
    Button b1 = new Button("First");
    this.add(b1);

    b1.addActionListener(this);

}

public void actionPerformed(ActionEvent e)
{
    System.out.println("Button Cliked");
}

    public static void main(String[] args)
    {
        ButtonEx f = new ButtonEx();
        f.setSize(200,400);
        f.setVisible(true);
    }    
}
