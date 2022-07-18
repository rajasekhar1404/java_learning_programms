// inheritence part2 
// types of inheritence: 1. single, 2. multi level, 3.Hierachical, 4.multiple

class A{
    int a;
    void Firstmethod() {
        System.out.println("here is the number value: "+a);
    }
}

class B extends A {
    int b;
    int c;
    void Secondmethod(int b, int c)
    {
        this.b = b;
        this.c = c;
    }
}

class  C extends B {
    int d;
    void Thirdmethod (){
        System.out.println("sum of all three classes values is: "+(a+b+c+d));
    }
}



class inheritencepart2 {
    public static void main(String[] args)
    {
        C Ex = new C();
        Ex.a = 10;
        Ex.b = 20;
        Ex.c = 30;
        Ex.d = 40;
        Ex.Thirdmethod();
    }
}