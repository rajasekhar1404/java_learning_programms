// program to demonstrate array of objects.
class Student
{
    String name;
    int age;
    Student(String n, int a)
    {
        name = n;
        age = a;
    }
}

class ArrayObjects
{
    public static void main(String[] args)
    {
        // creating students objects
        Student s1 = new Student("rajasekhar", 23);
        Student s2 = new Student("Karampudi", 22);
        Student s3 = new Student("Kranthi", 21);
        Student s4 = new Student("Aryan", 30);
        // storing students details in array
        Student students[] = new Student[4];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;

        // printing each students details.
        for(int i = 0; i<students.length; i++)
        {
            Student s = students[i];
            System.out.println(s.name);
            System.out.println(s.age);
            System.out.println("======");
        } 
    }
}