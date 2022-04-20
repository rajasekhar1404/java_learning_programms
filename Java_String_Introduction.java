import java.io.*;
import java.util.*;

public class Java_String_Introduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        // The sum of A and B
        System.out.println(A.length()+B.length());

        // Check if alphabetically larger or not
        int compare = A.compareTo(B);
        if(compare < 0) System.out.println("No");
        else if(compare > 0) System.out.println("Yes");
        else System.out.println("No");
        
        // Making the first letter Upper case.
        char C = A.charAt(0);
        String F = Character.toString(C);
        String FW = F.toUpperCase();
        for (int i = 1; i< A.length(); i++)
        {
            char E = A.charAt(i);
            FW = FW+E;
        }

        char D = B.charAt(0);
        String H = Character.toString(D);
        String SW = H.toUpperCase();
        for (int j = 1; j < B.length(); j++)
        {
            char G = B.charAt(j);
            SW = SW+G;
        }
        System.out.println(FW+" "+SW);
        
    }
}