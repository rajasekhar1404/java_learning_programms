import java.io.*;
import java.util.*;

public class Java_Anagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String sure = sc.nextLine();
        String a = sure.toLowerCase();
        String name = sc.nextLine();
        String b =name.toLowerCase();
        char[] l1 = new char[a.length()];
        char[] l2 = new char[b.length()];

        for(int i = 0; i<a.length(); i++){
            l1[i] = a.charAt(i);
        }
        for(int j = 0; j<b.length(); j++)
        {
            l2[j] = b.charAt(j);
        }
        Arrays.sort(l1);
        Arrays.sort(l2);

        String fa = "";
        String fb = "";

        for (int start = 0; start < a.length(); start++)
        {
           char letter = l1[start];
            fa = fa + letter;
        }

        for (int sec = 0; sec < b.length(); sec++)
        {
           char slet = l2[sec];
            fb = fb + slet;
        }


        if (fa.equalsIgnoreCase(fb))
        {
            System.out.println("Anagrams");
        }
        else
        {
            System.out.println("Not Anagrams");
        }
    }
}