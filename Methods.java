class Ex {
    int a;
    int b;
    // method deffinition
    void add()
    {
        System.out.println("addition result: " + (a+b));
    //    return add;
    }

    void sub()
    {
        System.out.println("substraction result: " + (a-b));

    }

    // method overloading.
    void add(int e)
    {
        System.out.println("addition of single int is: " + (e+10));
    }

    void add(int f, int g)
    {
        System.out.println("addtion of two int is: " + (f+g));
    }

    void sub(int h, float j)
    {
        System.out.println("subtraction of int and fload: " + (h-j));
    }

    void sub(int k, double l)
    {
        System.out.println("substraction of int and double: " + (k-l));
    }
}



class Methods {
    public static void main(String[] args) 
{
    int c = 10;
    int d = 20;
    Ex sum = new Ex();
    sum.a=c;
    sum.b=d;
    // method calling 
    sum.add();
    sum.sub();
    sum.add(22);
    sum.add(134,234);
    sum.sub(235,4.6);
    sum.sub(235,4.6f);
}
}