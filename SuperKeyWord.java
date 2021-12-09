class one 
{
    int a, b, c;
    one() {}
    one(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    void addone()
    {
        System.out.println("Here we are printing the sum of 3 values");
    }
}

class two extends one
{
    // already a, b, c are came here from class one
    int d, e, f;
    two() {}
    two(int a, int b, int c, int d, int e, int f) {
        // this.a = a;
        // this.b = b;
        // this.c = c;
        // we can directly call all the variables of class one
        super(a,b,c);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    void addtwo()
    {
        System.out.println("here is the sum of above three values: "+(a+b+c+d+e+f));
    }
}



class SuperKeyWord
{
    public static void main(String[] args)
    {
        two obj1 = new two(12, 13, 14, 15, 16, 17);
        obj1.addtwo();
    }
}