import java.io.*;

class FIles {
    public static void main(String[] args)
    {
        File f = new File("raja.txt");
        // methods in File class
        System.out.println(f.exists()); 
        if(f.exists() == true)
        {
//          System.out.println(f.exists()); 
            System.out.println("write check: "+f.canWrite());
            System.out.println("last modified: "+f.lastModified());
            f.delete();
            System.out.println("check the existence of a file: "+f.exists());
      }
    }
}
