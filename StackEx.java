// program to demonstrate stack in java
import java.util.*;

class StackEx {
    public static void main(String[] args)
    {
        Stack<Integer> marks = new Stack<Integer>();
        
        // Push an element
        marks.push(85);
        marks.push(75);
        marks.push(88);
        marks.push(85);
        marks.push(99);
        marks.push(100);

            //it checks whether the stack is empty or not
        if(marks.empty())
            System.out.println("marks stack is empty");
        else
            // it returns the top element
            System.out.println("top element: "+marks.peek());

        marks.pop();
            // it removed the top elements from the stack
            System.out.println("after pop: "+marks.peek());
            System.out.println(marks.search(88)) ;
    }
}
