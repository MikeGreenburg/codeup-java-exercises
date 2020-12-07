package helloworld3;

import java.text.MessageFormat;

public class HelloWorld3 {
    public static void main (String[] args) {

        System.out.println("Hello, World!");

        //1.
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        /*  2  */
        String myString = "Players";
        System.out.println(myString);

        /*  3   */
        //Change your code to assign a character value to myString. What do you notice?
        char myString2 = 'M';
        System.out.println(myString2);

        /*  4  */
//        Change your code to assign the value 3.14159 to myString. What happens?
        double myString3 = 3.143159;
        System.out.println(myString3);

        // 5
        //Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        long myNumber = 2589;
        System.out.println(myNumber);

        //6. Change your code to assign the value 3.14 to myNumber. What do you notice?
        double myNumber2 = 3.14;
        System.out.println(myNumber2);

        //7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        double myNumber3 = 123L;
        System.out.println(myNumber3);

        //8.Change your code to assign the value 123 to myNumber.
        //
        //Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        double myNumber4 = 123;
        System.out.println(myNumber4);

        //9.Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        float myNumber5 = Float.parseFloat("3.14");
        //assigning it to a double is another
        System.out.println(myNumber5);

        //10. Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        //11. Try to create a variable named class. What happens?

    }
}

