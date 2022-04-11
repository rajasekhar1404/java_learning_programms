import java.io.*;
import java.util.*;

public class Java_Static_Initializer_Block {

    static int a;
    static int b;
    static{
        Scanner sc = new Scanner(System.in); 
        a = sc.nextInt();
        b = sc.nextInt();
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        if (a > 0 && b > 0)
        {
            System.out.println(a*b);
        }
        else
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}