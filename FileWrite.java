import java.io.*;

class FileWrite {
    public static void main(String[] args) throws Exception
    {
        // open the file in write mode
        FileWriter fw = new FileWriter("raja.txt",true);

        // write the content in a file
        // fw.write((int)'h');
        // fw.write((int)'e');
        // fw.write((int)'l');
        // fw.write((int)'l');
        // fw.write((int)'o');

        //close the file
//        fw.close();
        BufferedWriter bw = new BufferedWriter(fw);
        // sending the input from a character array
        char c[] = {'k','a','r','a','m','p','u','d','i'};
        bw.write(c, 2, 2);

        //sending the input from a string value

        String s = " this text is created using the file write openration in java";
        bw.write(s, 0, s.length());
        bw.write(" rajasekhar");

        // close the file
        //fw.close();
        bw.close();
        fw.close();
    }    
}
