class Ex
{
    int a = 10;
}

class InstanceOfEx {
    public static void main(String[] args)
    {
        String r = "Rajasekhar Karampudi";
        
        if(r instanceof String)
            System.out.println("true");
        else
            System.out.println("na bro");

        Ex ob = new Ex();

        if(ob instanceof Ex)
            System.out.println("result of a is: "+ob.a);
        else
            System.out.println("flase");
    }
}
