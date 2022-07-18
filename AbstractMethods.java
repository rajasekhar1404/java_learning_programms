abstract class A
{
    int a = 10;
    int b = 20;
    void sub()
    {
        System.out.println("The sum of above two values: "+a);
    }
    // abstract method example, it doesn't need to have a curly brackets.
    abstract void mul();
    abstract void dev();
}

class B extends A
{
    int c = 30;
    // we must define the abstract method in the extended class to make it executable.
    void mul()
    {
        System.out.println("Sum of all there values: "+(a+b+c));
    }

    void dev()
    {
        System.out.println("Sum of first two values: "+(a+c));
    }
}

class AbstractMethods {
    public static void main(String[] args)
    {
        B obj1 = new B();
        obj1.mul();
        B obj2 = new B();
        obj2.dev();
        B obj3 = new B();
        obj3.sub();
        // Abstract classes cannont allow to create objects for it
        // A obj4 = new A();

    }
}
