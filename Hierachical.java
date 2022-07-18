// Hierachical inheritence
class test3
{
    int p;
    // A() {}
    // A(int p)
    // {
    //     this.p = p;
    // }
    void test()
    {
        System.out.println("the given value: "+p);
    }
}

class test2 extends test3
{
    int q;
    // B() {}
    // B(int q, int p)
    // {
    //     this.q = q;
    //     this.p = p;
    // }
    void sub(int   q, int p)
    {
        this.p = p;
        System.out.println("the subtraction of two values are: "+(q-p));
    }
}

class test1 extends test2
{
    int r;
    // C() {}
    // C(int p, int r)
    // {
    //     this.p = p;
        
    //     this.r = r;
        
    // }
    void add ()
    {
        System.out.println("the sum of p+r: "+ (p+r));
    }
}

class Hierachical {
    public static void main(String[] args)
    {
        test1 Ex = new test1();
        Ex.p = 30;
        Ex.r = 200;
        Ex.add();
        test2 Ex2 = new test2();
        // Ex2.q = 250;
        // Ex2.p = 150;
        Ex2.sub(500,150);
    }
}