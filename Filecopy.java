import java.io.*;

class Filecopy {
    public static void main(String[] args) throws Exception
    {
        // open a image in read mode 
        FileInputStream in = new FileInputStream("raja.png");

        // open new file in write mode
        FileOutputStream ot = new FileOutputStream("newraja1.png"); 

        // perform the copy action
        int ch;

        while ((ch=in.read())!=-1)
        {
            ot.write(ch);
        }

        // close the opened streams

        ot.close();
        in.close();
    }    
}
