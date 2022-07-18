class A
{
    int marks[] = {10, 15, 13, 16, 19};
	String name = "rajasekhar";
}

class Eh2 {
    public static void main(String[] args)
    {
        A obj1 = new A();
        System.out.println("here is the value of array"+obj1.marks[3]);
 //       System.out.println("here is the value of array"+obj1.marks[6]);
       System.out.println("here is the value of array is: "+obj1.name.charAt(3));
    }    
}
