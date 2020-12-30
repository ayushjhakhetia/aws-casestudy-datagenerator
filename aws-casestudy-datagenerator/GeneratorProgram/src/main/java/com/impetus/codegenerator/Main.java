package com.impetus.codegenerator;

import java.util.Arrays;
import java.util.Comparator;

class Student
{
    int rollno;
    String name, address;
 
    // Constructor
    public Student(int rollno, String name,
                               String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                           " " + this.address;
    }
}
 
class Sortbyroll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
 
// Driver class
class Main
{
    public static void main (String[] args)
    {
        //Sorting test
//        Student [] arr = {new Student(111, "bbbb", "london"),
//                          new Student(131, "aaaa", "nyc"),
//                          new Student(121, "cccc", "jaipur")};
// 
//        System.out.println("Unsorted");
//        for (int i=0; i<arr.length; i++)
//            System.out.println(arr[i]);
// 
//        Arrays.sort(arr, new Sortbyroll());
// 
//        System.out.println("\nSorted by rollno");
//        for (int i=0; i<arr.length; i++)
//            System.out.println(arr[i]);
        
        // Test String as arg
        StringBuffer str = new StringBuffer("String");
        testString(str);
        System.out.println("In main : " + str);
    }

    private static void testString(StringBuffer str) {
        str = str.append("testString");
        System.out.println("In testString : " + str);
    }
}