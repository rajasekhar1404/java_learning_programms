// program to demonstrate threads in java
class Mythread extends Thread
{
    String a;
    Mythread(String s)
    {
        a=s;
    }
    public void run()
    {
        for(int i = 10; i>=1; i--)
        {
            System.out.println(a+": "+i);
        }
    }
}

class ThreadEx {
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();
        System.out.println("current thread: "+t);

        // result information: Thread(main,5,main)
        // this object is a Thread, 
        // name of thread: main
        // prority: 5
        // Thread group name: main

        System.out.println("main thread starts");
        Mythread th = new Mythread("First");
        Thread th1 = new Thread(th);

        //setname is used to give a name to a thread.
        th1.setName("rajasekhar");
        th1.setPriority(9);
        System.out.println(th1);
        th1.start();

        Mythread th2 = new Mythread("Second");
        Thread th3 = new Thread(th2);
        th3.setPriority(2);
        System.out.println(th2);
        th3.start();

        System.out.println("main thread ends");
    }
}
