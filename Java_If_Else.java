import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java_If_Else {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int m = N%2;
        
        if(N == 20)
        {
            System.out.println("Weird");
        }
        else if (m != 0)
        {
            System.out.println("Weird");
        }
        
        else if (m == 0 && N > 2 && N < 5){
            System.out.println("Not Weird");
        }
        else if(m == 0 && N > 6 && N < 20) {
            System.out.println("Weird");
        }
        else if(N > 20){
            System.out.println("Not Weird");
        }

        else
        {
            System.out.println("Not Weird");
        }
    }
}
