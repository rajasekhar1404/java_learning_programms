class ticketbooking
{
    boolean booked = false;
    public void bookTicket(String name)
    {
        synchronized(this)
        {
        if(booked == false){
        System.out.println(name+" selected the seat");

        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}


        System.out.println(name+" done the payment");

        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}


        System.out.println(name+" got the ticket");

        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}



        booked = true;
        }
        else
        {
            System.out.println(name+" sorry, the ticket is already booked");
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}

        System.out.println("please click on this button for busticket");
    }
    }
    
}

class Syncissuefix extends Thread
{
    ticketbooking tk;
    String name;
    Syncissuefix(ticketbooking ob, String s)
    {
        tk = ob;
        name = s;
    }
    public void run()
    {
        tk.bookTicket(name);

    }
}




class SyncEx {
    public static void main(String[] args)
    {
        ticketbooking seat1 = new ticketbooking();
        Syncissuefix raj = new Syncissuefix(seat1,"raj");
        Thread obj = new Thread(raj);
        obj.start();

        // try{
        // obj.join();
        // }
        // catch
        // (Exception e){}

        Syncissuefix aryan = new Syncissuefix(seat1, "aryan");
        Thread obj1 = new Thread(aryan);
        obj1.start();
    }    
}
