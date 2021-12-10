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
    }
}