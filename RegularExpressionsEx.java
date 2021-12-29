import java.util.regex.*;

class RegularExpressionsEx {
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("[Abc]");
        String s = "RAJASEKHAR KARAMPUDI";
        Matcher m = p.matcher(s);
        System.out.println("m.find :"+m.find());
        System.out.println("m.start() :"+m.start());
        System.out.println("m.find() :"+m.find(10));
    }
}
