class Arrays_in_java {
    public static void main(String[] args)
    {
        System.out.println("Arrays in java");
        // int marks[];
        // marks = new int[5];
        // marks[1] = 50;
        // marks[2] = 70;
        // System.out.println(marks[2]);
// int marks[] = new int[5];
// marks[0] = 48;
// marks[1] = 40;
// marks[2] = 39;
// marks[3] = 20;
// marks[4] = 30;
// System.out.println(marks[0]+marks[1]);
// int marks[] = {34, 93, 52, 95, 59, 35, 95, 11, 45,34, 34};
// for (int i = 0; i < 5; i++ ) {
//     if (i == 3)
//     continue;
//     System.out.println(marks[i]);
    
// }
int marks[] = new int[100];
marks[50] = 500;

// for (int i = 0; i < 100; i++)
for (int i = 0; i < marks.length; i++)
{
//     if (i == 51)
// break;
    System.out.println(i+":"+marks[i]);
}



    }
}