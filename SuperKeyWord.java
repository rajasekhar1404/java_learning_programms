// super key word lecutre
// to access super class members;
// to call superclass constructors.
class A
{
    A() {}
    int number1 = 10;
    void Firstmethod()
    {
        System.out.println("here is the value of firstmethod number: "+ number1);
    }

}

class B extends A
{
    B() {}
    int number2 = 20;
    int number1 = 30;
    void summing()
{
    System.out.println("value of first two values"+(number2+number1));
}

}
class SuperKeyWord {
    public static void main(String[] args)
    {
        B sum = new B();
        sum.summing();
    }
}