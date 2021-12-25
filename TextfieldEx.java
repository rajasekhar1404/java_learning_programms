//program to demonstrate textfield 

import java.awt.*;
// import java.awt.event.*;

class TextfieldEx extends Frame {

    TextfieldEx()
    {
        this.setLayout(null);
        Label l1 = new Label("Name");
        l1.setBounds(30,60,50,30);
        this.add(l1);

        TextField tf = new TextField("Enter your name");
        tf.setBounds(100,60,100,30);
        this.add(tf);

        Label l2 = new Label("PassWord");
        l2.setBounds(30,100,50,30);
        this.add(l2);

        TextField tf2 = new TextField("Enter your Password");
        tf2.setBounds(100,100,100,30);
        this.add(tf2);

       Label l3 = new Label("Address");
       l3.setBounds(30,150,50,30);
       this.add(l3);

        TextArea ta = new TextArea("", 10, 10, TextArea.SCROLLBARS_BOTH);
        ta.setBounds(100,150, 100, 50);
        this.add(ta);
    }
    public static void main(String[] args)
    {
        TextfieldEx f = new TextfieldEx();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
