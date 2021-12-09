interface A
{
    // all the variables are static variables in interface
    int a = 10;
    int b = 20;
    // all the methods in interface are abstract methods, no need to add abstract at  the beginning
    void sub();

}

class B implements A
{
    public void sub()
    {
        System.out.println("Here is the sum of a and b: "+ (a+b));
    }
}

class Interface {
    public static void main(String[] args)
    {
        B obj1 = new B();
        obj1.sub();
    }
}
