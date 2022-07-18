interface F1 
{
    void add(int x, int y);
}

// class F2 implements F1
// {
//     public void add(int x, int y)
//     {
//         System.out.println("Result of x+y is :"+(x+y));
//     }
// }

class Test1
{
    public static void excecute(F1 a, int x, int y)
    {
    a.add(x,y);
    }
}

class LambdaEx
{
    public static void main(String[] args)
    {
        // F2 test = new F2();
        // test.add(10,20);

        // test.add(30,50);



        F1 t1 = (int x, int y) -> {int r = x+y; System.out.println("Result of X+Y is :"+r);};
 //       t1.add(10, 20);
        Test1.excecute(t1,10,20);

        F1 t2 = (int x, int y) -> {int r = x-y; System.out.println("Subtraction of X-Y :"+r);};
  //      t2.add(10, 20);
        Test1.excecute(t2,20,30);
    }
}
