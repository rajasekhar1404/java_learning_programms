class A
{
    final void show()
    {
        System.out.println("this is the class a");
    }
}

class B extends A
{
    // once the first method is declared with final key word below method cannot be created.
    void show()
    {
        System.out.println("this is the class b");
    }
}

class FKM {
    public static void main(String[] args)
    {
        B obj1 = new B();
        obj1.show();
        A obj2 = new A();
        obj2.show();
    }    
}
