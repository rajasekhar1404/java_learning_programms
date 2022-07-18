import java.util.*;

class stackex {
    public static void main(String[] args)
    {
        Stack<String> names = new Stack<String>();

        names.add("rajasekhar");
        names.add("karampudi");
        names.add("aryanraj");
        names.add("let's try to push this");

        System.out.println(names);

        System.out.println("this stack cantain elements: "+names.empty());

        names.push("inserting an element to the top");

        System.out.println("Printing the top element after adding a element: "+names.peek());

        System.out.println("location of karampudi element in the list: "+names.search("karampudi"));

        for(String s : names)
        {
            System.out.println("hello bother "+s+" good morning");
        }

// just remembering the scanner method onemore time.
        System.out.print("please enter a value: ");

        Scanner raja = new Scanner(System.in);

        String a = raja.nextLine();

        System.out.println("Here is the value you have entered "+a);
    }
}