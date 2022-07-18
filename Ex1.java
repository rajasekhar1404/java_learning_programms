class Ex1 {
    public static void main(String[] args)
    {
        try {
        System.out.println(1+3);
        System.out.println(2*3);
     
        System.out.println(3/0);
        
       
        }

        catch (ArithmeticException obj1)
         {
            System.out.println("0 values can not be displayed");
        }
        catch (IndexOutOfBoundsException obj1)
         {
            
        }
        finally
        {
            System.out.println("Rajasekhar");
        }
    }
}