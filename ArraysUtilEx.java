// program to demonstrate arrays class in java.util
import java.util.*;

class ArraysUtilEx
{
    public static void main(String[] args)
    {
        int[] marks = {12, 23, 13, 53, 24, 52, 25, 33};

        int[] marks1 = {12, 23, 13, 53, 24, 52, 25, 33};

        System.out.println(Arrays.equals(marks,marks1));
        
        System.out.println("array values before sorting");

        for(int i = 0; i<marks.length; i++)
            System.out.print("\t"+marks[i]);

        Arrays.sort(marks,3,8);
        System.out.println("\nArray values after sorting");

        for(int i = 0; i<marks.length; i++)
        System.out.print("\t"+marks[i]);

        System.out.println();

        System.out.println(Arrays.binarySearch(marks, 23));
        System.out.println(Arrays.binarySearch(marks, 73));

        System.out.println(Arrays.equals(marks,marks1));

    }
}