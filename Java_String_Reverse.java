import java.io.*;
import java.util.*;

public class Java_String_Reverse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine(), rev = "";;
        StringBuilder sb = new StringBuilder(A);
        // System.out.println(sb.reverse());

        for (int i = A.length()-1; i>=0; i--)
        {

            char c = A.charAt(i);
            rev = rev+c;
        }
        if (A.equals(rev))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}