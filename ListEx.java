import java.util.*;

class ListEx {
    public static void main(String[] args) throws Exception
    {
    HashSet<String> name = new HashSet<String>();
    name.add("rajasekhar");
    name.add("karampudi");
    name.add("aryan");
    name.add("kranthi");
    
    System.out.println(name);
    
    if(name.isEmpty())
        System.out.println("name string doesn't have any elements in it");
    else
        System.out.println("name set is not empty it has the following number of elements: "+name.size());
    if(name.contains("rajasekhar"));
    name.remove("karampudi");
    System.out.println(name);
    System.out.println("name set is not empty it has the following number of elements: "+name.size());
    name.clear();
    System.out.println(name.isEmpty());
    

    // performing for each action 
    name.add("rajasekhar");
    name.add("rajasekhar");
    name.add("aryan");
    name.add("kranthi");

 //   System.out.println(name);
  /*  for(String v : name)
    {
        String newvalues = "genious "+v;
        System.out.println(newvalues);
    }
    */




    //using iterator to perform the same actions done above



Iterator<String> newName = name.iterator();

        while(newName.hasNext())
        {
            String v = newName.next();
            String newvalues = "ginious "+v;
            System.out.println("here is the value "+newvalues);
        }

            while(newName.hasNext())
            {
                String v = newName.next();
                String newvalues = "ginious "+v;
                System.out.println("here is the value "+newvalues);
            }

    
    }
}
