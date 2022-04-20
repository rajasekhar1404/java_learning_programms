import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class Java_Currency_Formatter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    double payment = sc.nextDouble();
   
    System.out.println(NumberFormat.getInstance(Locale.UK).format(payment));
    }
}