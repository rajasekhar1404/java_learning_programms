// static variables and methods.
class JavaClass
{
    String name;

    void listen()
    {
        System.out.println(name + " is listening the class");
    }
    static String board;
    static void teaching()
    {
        // System.out.println(name);
        System.out.println("Teaching about keywords topic: "+board);
    }
}
class StaticEx
{
    // static blocks are used to run something before main methods.
    static {
        System.out.println("rajasekhar");
    }
    
    public static void main(String[] args)
    {
        JavaClass rajasekhar = new JavaClass();
        rajasekhar.name = "Rajasekahr";
        rajasekhar.listen();
        // rajasekhar.board = "white";
        // rajasekhar.teaching();
        JavaClass.board = "white";
        JavaClass.teaching();

    }
}