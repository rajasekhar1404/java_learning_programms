interface A
{
    int a = 10;
    int b = 20;
    void sum();
}
interface B extends A
{
    void sub();
}

class C implements B
{
   public void sub()
    {
        System.out.println("sub of : "+(a+b));
    }

    public void sum()
    {
        System.out.println("sum of : ");
    }
}
class InterftoInterf {
    public static void main(String[] args)
    {
        C obj1 = new C();
        obj1.sub();
        obj1.sum();
        // System.out.println(obj1.a);
        System.out.println(A.a);
    }
}
