import java.io.*;
class FilereadByte {
    public static void main(String[] args) throws Exception
    {
        // open file using using byte stream - file input stream.
        FileInputStream fi = new FileInputStream("raja.txt");
        int ch;
        while((ch=fi.read())!=-1)
        {
            System.out.print((char)ch);
        }
        // read and print the content using 
        //System.out.println((char)fi.read());

    }
}
