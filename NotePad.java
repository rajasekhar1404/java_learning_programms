import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class NotePad extends JFrame implements ActionListener{

    NotePad()
    {
        Container c = this.getContentPane();

        BorderLayout fl = new BorderLayout();
        this.setLayout(fl);
        // c.setBackground(Color.LIGHT_GRAY);

        JMenuBar NP = new JMenuBar();
        c.add(NP);
        JMenu m1 = new JMenu("File");
        NP.add(m1);
        JMenuItem n = new JMenuItem("New");
        m1.add(n);

        JLabel l1 = new JLabel();
        l1.setIcon(new ImageIcon("raja/sample.jpg"));
        c.add(l1);

        // n.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e)
        //     {
                
                
        //     }
        // });

        JMenuItem nw = new JMenuItem("New Window");
        m1.add(nw);
        JMenuItem op = new JMenuItem("Open");
        m1.add(op);
        JMenuItem sa = new JMenuItem("Save");
        m1.add(sa);
        JMenuItem sav = new JMenuItem("Save As");
        m1.add(sav);
        JMenuItem ps = new JMenuItem("Page setup");
        m1.add(ps);
        JMenuItem pr = new JMenuItem("Print");
        m1.add(pr);
        JMenuItem ex = new JMenuItem("Exit");
        m1.add(ex);

        JMenu m2 = new JMenu("Edit");
        NP.add(m2);
        JMenuItem z = new JMenuItem("Undo");
        m2.add(z);  
        JMenuItem x = new JMenuItem("Cut");
        m2.add(x);      
        JMenuItem cp = new JMenuItem("Copy");
        m2.add(cp);
        JMenuItem e1 = new JMenuItem("Paste");
        m2.add(e1);      
        JMenuItem e2 = new JMenuItem("Delete");
        m2.add(e2);      
        JMenuItem e3 = new JMenuItem("Search with bing");
        m2.add(e3);      
        JMenuItem e4 = new JMenuItem("Find");
        m2.add(e4);      
        JMenuItem e5 = new JMenuItem("Find Next");
        m2.add(e5);      
        JMenuItem e6 = new JMenuItem("Find Previous");
        m2.add(e6);      
        JMenuItem e7 = new JMenuItem("Replace");
        m2.add(e7);           
        JMenuItem e8 = new JMenuItem("Go To");
        m2.add(e8);
        JMenuItem e9 = new JMenuItem("Select All");
        m2.add(e9);            
        JMenuItem e10 = new JMenuItem("Date/Time");
        m2.add(e10);

        JMenu m3 = new JMenu("Format");
        NP.add(m3);
        JMenuItem f1 = new JMenuItem("Word wrap");
        m3.add(f1);
        JMenuItem f2 = new JMenuItem("Font");
        m3.add(f2);      

        JMenu m4 = new JMenu("View");
        NP.add(m4);
        JMenu m4_1 = new JMenu("Zoom");
        m4.add(m4_1);
        JMenuItem v1 = new JMenuItem("Zoom in");
        m4_1.add(v1);   
        JMenuItem v3 = new JMenuItem("Zoom Out");
        m4_1.add(v3);   
        JMenuItem v4 = new JMenuItem("Restore Default Zoom");
        m4_1.add(v4);   
        JMenuItem v2 = new JMenuItem("Status Bar");
        m4.add(v2);    
        
        JMenu m5 = new JMenu("Help");
        NP.add(m5);
        JMenuItem H1 = new JMenuItem("View Help");
        m5.add(H1);   
        JMenuItem H2 = new JMenuItem("Send Feedback");
        m5.add(H2);     
        JMenuItem H3 = new JMenuItem("About Notepad");
        m5.add(H3);    

        c.add("North", NP);
    }



    public static void main(String[] args)
    {
        NotePad f = new NotePad();
        f.setTitle("NotePad");
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    

}
