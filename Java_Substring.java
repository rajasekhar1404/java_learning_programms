import java.io.*;
import java.util.*;

public class Java_Substring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i < end; i++)
        {
            char c = s.charAt(i);
            System.out.print(c);
        }

    }
}