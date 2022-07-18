import java.io.*;

class Fileread {
    public static void main(String[] args) throws Exception
    {
        
        FileReader fr = new FileReader("raja.txt");
        // int ch;

        // while((ch=fr.read())!=-1)
        // {
        //     System.out.print((char)ch);
        // }

        // System.out.println((char)fr.read());
        // System.out.println((char)fr.read());
        // System.out.println((char)fr.read());
        // System.out.println((char)fr.read());
        // System.out.println((char)fr.read());

    // using bufferedreader to print the total text by reading a line directly.
        BufferedReader br = new BufferedReader(fr);
        String ch;
        while((ch = br.readLine())!=null)
        {
            System.out.println(ch);
        }
    }    
}
