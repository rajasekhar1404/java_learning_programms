import java.io.*;
import java.util.*;

public class Java_String_Tockens {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] lets = s.split(" |\\!|\\,|\\?|\\.|\\_|\\'|\\@se");
    System.out.println(lets.length);
    
    for (int i = 0; i<lets.length; i++)
    {
        System.out.println(lets[i]);
    }
    }
}