package helloworld3;

import java.text.MessageFormat;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String [] args) {
        //Print the words Hello World on the screen
        System.out.println("Hello World");

        int myLength = "Hello World".length();
        System.out.println(myLength);
        //Returns 11

        //      STRINGS

        String uCase = "Hello World".toUpperCase();
        //Returns "HELLO WORLD"

        String firstSubstring = "Hello World".substring(6);
        //Returns "World"

        String message = "Hellow World";
        String secondSubstring = message.substring(1, 8);
        //Returns "ello Wo"

        char myChar = "Hello World".charAt(1);
        //Returns "e"

        boolean equalsOrNot = "This is Jamie".equals("This is Jamie");
        //Returns true

        boolean equalsOrNot2 = "This is Jamie".equals("Hello World");
        //Returns false


        //      ARRAYS

        String names = "Peter, John, Andy, David";
        String[] splitNames = names.split(", ");
        //Returns {"Peter", "John", "Andy", "David"}

        //2 ways to declare a variable preferred
        //First part "int" determines what value is stored, Second part "[]" determines that it will be an array, Third part "userAge" is the arrays name.
        int[] userAge1;

        //This was adopted for C/C++ programmers not preferred
//        int userAge2[];

        //First statement declares the array variable userAge
        int[] userAge;
        //The second statement creates the array {21, 22, 23, 24, 25} and assigns it to userAge
        userAge = new int[] {21, 22, 23, 24, 25};

        //Combine two statements into a single statement using this shortcut
        int[] userAge2 = new int[] {21, 22, 23, 24, 25};

        //Simplified you can declare and initialize an array in the same statement and omit "new int[]"
        int[] userAge2 = {21, 22, 23, 24, 25};

        //Third way to declare and initialize an array default values are (0, 0, 0, 0, 0,)
        int[] userAge3 = new int[5];

        //Update array integers as follows this changes the array to {31, 22, 23, 24, 25}
        userAge[0] = 31;

        //If we type the following the array becomes {31, 22, 43, 24, 25}
        userAge[2] = userAge[2] + 20;
    }

    //        ARRAY METHODS

    //In order to use array methods we need the following and must appear after the package statement and before the class declaration
    import java.util.Arrays;


    //Example
//    package helloworld;
//
//    import java.util.Arrays;
//
//    public class HelloWorld {
        //code for HelloWorld class
//    }

    //equals() is used to determine if two arrays are equal to each other and returns true or false
    int[] arr1 = {0, 2, 4, 6, 8, 10};
    int[] arr2 = {0, 2, 4, 6, 8, 10};
    int[] arr3 = {10, 8, 6, 4, 2, 0};

    boolean result1 = Arrays.equals(arr1, arr2); //returns true
    boolean result2 = Arrays.equals(arr1, arr3); //returns false because elements are not arranged the same

    //copyOfRanged() allows you to copy the contents of one array into another and requires three arguments
    int[] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};

    //To copy contents use the first argument "source" is the array that provides the values to be copied. The next two arguments tell the compiler which indexes to start and stop copying. Returns {-2, 16, 14, 18} while "source" remains unchanged.
    int[] dest = Arrays.copyOfRange(source, 3, 7);

    //toString returns a String that represents the contents of an array.
    int[] numbers = { 1, 2, 3, 4, 5};

    //use below to display contents of the numbers array
    System.out.println(Arrays.toString(numbers));

    //Returns [1, 2, 3, 4, 5]

    //sort() allows for arrays to be sorted. It takes in an array as the argument
    int[] numbers2 = {12, 1, 5, -2, 16, 14};

    //below will sort the array in ascending order
    Arrays.sort(numbers2);

    System.out.println(Arrays.toString(numbers2));

    //Returns {-2, 1, 5, 12, 14, 16}


    //binarySearch() allows you to search for a specific value in a sorted array
    int[] myInt = {21, 23, 34, 45, 56, 78, 99};

    //to determine if 78 is in the array use the following
    int foundIndex = Arrays.binarySearch(myInt, 78);

    //foundIndex will return 5

    int foundIndex2 = Arrays.binarySearch(myInt, 39);

    //foundIndex will return -4 the "-" means that 39 is not found and the 4 tells you where it should exist in the array and adds one to that result.

    //      FINDING ARRAY LENGTH

    int[] userAge = {21, 22, 26, 32, 40};

    userAge.length; //returns 5 because there are 5 ages in the array



}
