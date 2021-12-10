import java.util.*;

class LinkedListEx {
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Rajasekhar");
        list.add("Karampudi");
        list.add("aryan");
        list.add("kranthi");
        list.add("list of elements");

        list.add(0, "yo bro");

        list.addLast("last addition");
        list.addFirst("this is the first item");

        System.out.println("is list contains rajasekhar: "+list.contains("Rajasekhar"));

        System.out.println("first element is: "+list.getFirst());
        System.out.println("last element: "+list.getLast());
        System.out.println("3rd element: "+list.get(3));
        System.out.println("number of elements in this stock are: "+list.size());

        for(String s : list)
        {
            System.out.println("hello "+ s + " all the best to your feture");
        }
        System.out.println("checking the first element before removing the firs element: "+list.getFirst());
        list.remove();
        System.out.println("checking the first element after removing the firs element: "+list.getFirst());
    }        
}
