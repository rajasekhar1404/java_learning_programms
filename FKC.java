final class A
{
    void show()
    {
        System.out.println("here is the value of class A");
    }
}
// i have declared the A class as final so it is not possible to inherit the A.
class B extends A
{
    void display()
    {
        System.out.println("here is the value of class B");
    }
}

class FKC {

    public static void main(String[] args)
    {
        A obj1 = new A();
        obj1.show();
        B obj2 = new B();
        obj2.display();
    }
}

