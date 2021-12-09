// this programm is to learn about method overriding
class A
{
    void add(int a, int b)
    {
        System.out.println("here is the value of a and b: "+(a+b));
    }
}

class B extends A
{
    // if we have two methods with same name and same values, we need to call it with super key word.
    void add(int p, int q)
    {
        super.add(p,q);
        System.out.println("here is the sum of p and q: "+(p+q));
    }
}

class Overriding {
    public static void main(String[] args)
    {
        // now both the methods will take the same values and print both the methods.
        B obj1 = new B();
        obj1.add(10,20);
        
    }
}
