// inheritence: creating a new class from existing class.
class A {
    String a = "rajasekhar";
    int p;
    void display()
    {
        System.out.println("new display of old: "+a);
    }

    A() {}
     A(int p)
    {
        this.p = p;
    }

}
class B extends A {
    int b = 10;
    void show()
    {
        System.out.println("Lets see: "+b);
    }
    
}

class Inheritence {
public static void main(String[] args)
{
    B ex = new B();
    // ex.a = "raja bro";
    ex.display();
    System.out.println();
    ex.show();
}
}