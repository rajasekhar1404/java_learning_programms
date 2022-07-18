// Program to demonstrate Array List in java
import java.util.*;
class ArrayListEx {
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("rajasekhar");
        list.add("karampudi");

        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.remove(1);
        System.out.println(list.size());

        listIterator<String> list = list.listIterator();
    }
}
