// call by value and call by reference
class sample 
{
    void add(int a, int b)
    {
        int c = a+b;
        System.out.println("sum of a+b: " + (a+b));
        System.out.println("adding two int values: " + c);

        a = 155;
        b = 153;
        c = a+b;
        System.out.println("sum after changing the values: " + c);

    }

    void check(Ex ob1)
    {
        ob1.v1 = 33;
        ob1.v2 = 93;
    }
}

class Ex {

    
    int v1;
    int v2;

}


class Methods2 {
    public static void main(String[] args)
    {
        int p = 29;
        int q = 50;
        sample s = new sample();
        s.add(p,q);
        System.out.println("p,q values are"+p+ ","+q);

        Ex ob1 = new Ex();
        ob1.v1 = 10;
        ob1.v2 = 20;
        System.out.println("printing v1 and v2: " + ob1.v1 + ","+ob1.v2);
        s.check(ob1);
        System.out.println("printing v1 and v2: "+ob1.v1+","+ob1.v2);
    }
}