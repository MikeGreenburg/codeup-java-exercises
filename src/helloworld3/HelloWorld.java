package helloworld3;

import java.text.MessageFormat;

public class HelloWorld {

    public static void main(String [] args) {
        //Print the words Hello World on the screen
        System.out.println("Hello World");

        int myLength = "Hello World".length();
        System.out.println(myLength);
        //Returns 11

        //STRINGS

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


        //ARRAYS

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


    }

}
