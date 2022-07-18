import java.util.*;

class StringTokenizerEx {
    public static void main(String[] args)
{
    String s = "Raja Sekhar karampudi";
    StringTokenizer st = new StringTokenizer(s," ");
    System.out.println(st.countTokens());

    // while(st.hasMoreElements())
    // {
    //     System.out.println(st.nextElement());
    // }

    while(st.hasMoreTokens())
    {
        System.out.println(st.nextToken()+"1");
    }
}
}