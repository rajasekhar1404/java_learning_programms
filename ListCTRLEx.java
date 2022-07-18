//Program to demonstrate list 
import java.awt.*;

class ListCTRLEx extends Frame {

ListCTRLEx()
{
    this.setLayout(null);
    Label l1 = new Label("List");
    l1.setBounds(30,30,50,150);
    this.add(l1);

    List lc1 = new List(3);
    lc1.add("Telugu");
    lc1.add("English");
    lc1.add("Hindi");
    lc1.add("Tamil");
    lc1.setBounds(100,30,100,100);
    this.add(lc1);
}

public static void main(String[] args)
    {
        ListCTRLEx f = new ListCTRLEx();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
