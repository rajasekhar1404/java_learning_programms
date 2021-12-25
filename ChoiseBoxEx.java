//program to demonstrate choise box
import java.awt.*;

class ChoiseBoxEx extends Frame {
ChoiseBoxEx()
{
    this.setLayout(null);

    Label l1 = new Label("State");
    l1.setBounds(30,30,50,30);
    this.add(l1);

    Choice cb = new Choice();
    cb.add("India");
    cb.add("America");
    cb.add("pakisthan");
    cb.add("africa");

    cb.setBounds(100,30,100,50);
    this.add(cb);

}

    public static void main(String[] args)
    {
        ChoiseBoxEx f = new ChoiseBoxEx();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
