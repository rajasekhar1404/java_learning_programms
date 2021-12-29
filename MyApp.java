// creating an application using swing concepts.
import java.awt.*;
import javax.swing.*;

class MyApp extends JFrame
{
    MyApp()
    {
        //setting content pane
        Container c = this.getContentPane();

        //setting layout
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        //tabbedpane creation for file
        JTabbedPane file = new JTabbedPane(JTabbedPane.TOP);
        c.add(file);
        file.add("Home", new Tab1());
        file.add("Insert", new Tab2());
        file.add("Design", new Tab3());
        file.add("Slide Show", new Tab4());

        //Menubar creation
        JMenuBar MyPpt = new JMenuBar();
        c.add(MyPpt);
        JMenu Home = new JMenu("Clipboard");
        file.add(Home);
        JMenuItem Cut = new JMenuItem("Cut");
        Home.add(Cut);


        
    }
    public static void main(String[] args)
    {
        // frame setup 
        MyApp f = new MyApp();
        f.setTitle("MyPowerPoint");
        f.setSize(700,600);
        f.setVisible(true);

        //closing operation
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Tab1 extends JPanel
{
    Tab1()
    {
        //creating first button
        JButton b1 = new JButton("Clipboard");
        JButton b2 = new JButton("Slides");
        JButton b3 = new JButton("Font");
        JButton b4 = new JButton("Paragraph");
        JButton b5 = new JButton("Drawing");
        JButton b6 = new JButton("Editing");
        JButton b7 = new JButton("Voice");
        JButton b8 = new JButton("Designer");

        // adding buttons
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
    }
}

class Tab2 extends JPanel
{
    Tab2()
    {
        //creating first button
        JButton b1 = new JButton("Tables");
        JButton b2 = new JButton("Images");
        JButton b3 = new JButton("Illustrations");
        JButton b4 = new JButton("Add-ins");
        JButton b5 = new JButton("Links");
        JButton b6 = new JButton("Comments");
        JButton b7 = new JButton("Text");
        JButton b8 = new JButton("Media");

        // adding buttons
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
    }
}

class Tab3 extends JPanel
{
    Tab3()
    {
        //creating first button
        JButton b1 = new JButton("Themes");
        JButton b2 = new JButton("Variants");
        JButton b3 = new JButton("Customize");
        JButton b4 = new JButton("Designer");

        // adding buttons
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b3);
        this.add(b4);
    }
}

class Tab4 extends JPanel
{
    Tab4()
    {
        //creating first button
        JButton b1 = new JButton("Start Slide Show");
        JButton b2 = new JButton("Rehearse");
        JButton b3 = new JButton("Setup");
        JButton b4 = new JButton("Monitors");
        JButton b5 = new JButton("Captions & Subtitles");

        // adding buttons
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b3);
        this.add(b4);
        this.add(b5);
    }
}