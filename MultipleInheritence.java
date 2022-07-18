/* multiple inheritence are used to create a new class from multiple classes
we can create multiple inheritance onle with one class and multiple interfaces
we can not use multiple classes to create multiple inheritence
*/
class A
{
    int a;
    int b;
    A() {
        a = 20;
        b = 30;
    }
    void sub()
    {

    }
}

interface B
{

    void sum();

}
interface D
{

    void mul();
}

class C extends A implements B,D
{
   public void sum()
    {
        System.out.println("Sum of above two values are: "+ (a+b));
    }

    public void mul()
    {
        System.out.println("Sum of above two values are: "+ (a*b));
    }

}

class MultipleInheritence {
    public static void main(String[] args)
    {
        C obj1 = new C();
        obj1.sum();
        obj1.mul();
    }
}
