import java.io.*;
class Filewritebyte {
    public static void main(String[] args) throws  Exception
    {
        // open the file in write mode
        FileOutputStream os = new FileOutputStream("rajasekahr.txt");

        // write the contnet in the file
        // os.write((int)'z');
        byte a[] = {10, 20, 30, 40, 50};
        os.write(a);

        os.close();

    }    
}
