class StringBuilderEx
{
    public static void main(String[] args)
    {
        StringBuilder s = new StringBuilder();
        s.append("Rajasekhar");
        s.append(" Karampudi");
        System.out.println("s value after append is "+s);

        s.reverse();

        System.out.println("s value after reverse is "+s);

        StringBuilder s1 = new StringBuilder("Adding string inside the object");

        System.out.println(s1);
    }
}