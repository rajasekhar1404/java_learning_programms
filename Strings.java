public class Strings {
    public static void main(String[] args) {
        // learning about strings
        String a = "Karampudi";
        String e = "karampudi";
    //    String a2 = a.concat(" you can do it bro");
    //     System.out.println("let's do it"+a2);
 
char b = a.charAt(2);
System.out.println(b);
    System.out.println(a.charAt(3));
// charAt is used to find the charecter available at the given value.
// lets find the lengh of the string

int d = a.length();
System.out.println("length of a string:"+d);
System.out.println(a.length());
//compare two strings

int f = a.compareTo(e);
System.out.println(f);
System.out.println(a.compareTo(e));
System.out.println(a.compareToIgnoreCase(e));

// checking the equals of two strings
System.out.println(a==e);
System.out.println(a.equals(e));
System.out.println(a.equalsIgnoreCase(e));
// check what a string starts with and ends with
System.out.println("a string is startinng with:" + a.startsWith("ka"));

System.out.println("a string is ending with: " + a.endsWith("di"));

// indexOf is used to find the position of a perticualr word or sentence in a string
System.out.println("index of a is: " + a.indexOf("a"));

System.out.println("index of last occurence: " + a.lastIndexOf("a"));

// replace a charector from the string

System.out.println("replaced text of a: " + a.replace('K','k'));


//substring is used to print the string from the given value.

System.out.println("substring of a is: " + a.substring(3));

// with the two values we can print the string inbetween the given value,
// it include the strating value but not the ending value.
System.out.println("part of a is: "+ a.substring(3,5));

//two lower case

System.out.println(a.toLowerCase());

// two upper case

System.out.println(a.toUpperCase());

// trim is used to remove the starting and ending spaces.
String ra = "rajasekhar karampudi";
System.out.println(ra);
System.out.println(ra.trim());

// spliting a string
// splitted string needs to be stored in array coz it will return multiple strings.

String name = "my name is rajasekhar";
String name2[] = name.split(" ");
System.out.println(name2.length);

for(int i = 0; i < name2.length; i++) {
    System.out.println(name2[i]);

    // getChar is used to insert the part of text in to another char and print it using for
    char z[] = new char[10];
    name.getChars(5,10,z,0);
    for(i=0; i<z.length;i++) {
        System.out.println(z[i]);

    }
}

}

}





