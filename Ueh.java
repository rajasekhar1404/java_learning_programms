class MyException extends Exception
{
    MyException() {
        System.out.println("age below 10 only accepted");
    }

    MyException(String b)
    {
        super(b);
    }
}

class Ueh
{
    public static void main(String[] arga) throws Exception
    {
        int a = 11;
      //  int b = a/0;
     try {
      if(a > 10)
        throw new MyException("this will print whatever the exception comment you want to print");
        // below statement is error free, evonthow it won't excecute
        System.out.println("checking whether it can print this or not");
     }
     catch (Exception e)
     {
         System.out.println("checking whether it can be printed or not");
     }

     String c = "kara";
     int d = c.length();
    try{
     if(d >= 10)
    {
        System.out.println("yo suskobadle text chinnadi aidhi ayya");
    }
    else 
    throw new MyException("yo bro peru sarigga enter chei bro");
}
catch(MyException e)
    {
        System.out.println("peru sarigga enter chei ra pumka");
    }    
}
}