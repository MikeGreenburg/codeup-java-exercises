package console;

import java.util.Scanner;

//Scanner scanner = new Scanner(System.in);
//
//System.out.print("Enter something: ");
//String userInput = scanner.next();
//
//System.out.println("You entered: --> \"" + userInput + "\" <--");

//For the following exercises, create a new class named ConsoleExercises with a main method like the one in your HelloWorld class.
//
//        Copy this code into your main method:
//
//
//        double pi = 3.14159;
//        Write some Java code that uses the variable pi to output the following:
//
//
//        The value of pi is approximately 3.14.
//        Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
//public class ConsoleExercises {
//    public static void main(String[] args) {
//        //Problem 1
//        double pie = 3.14159;
//    }
//}
//    System.out.printf("The value of pi is approximately %.2f.", pi)
//            System.out.printf("The value of pi is approximately %.2f.", pi);

//            System.out.format("The value of pi is approximately %.2f%n", pi);
//
//        Explore the Scanner Class.

//            Scanner input = new Scanner(System.in);
//
//            System.out.print("Please enter an integer: ");
//            int userInt = input.nextInt();
//            System.out.println(userInt);
//
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        //input mismatch exception
//
//        What happens if you input something that is not an integer?
//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//            System.out.print("Please enter three words: ");
//                    String word1 = input.next();
//                    String word2 = input.next();
//                    String word3 = input.next();
//
//                    System.out.println(word1);
//                    System.out.println(word2);
//                    System.out.println(word3);
//
//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?
//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        System.out.print("Please enter a sentence");
//                String sentence = input.next();
//                System.out.println(sentence);

//        do you capture all of the words?
//        Rewrite the above example using the nextLine method.

        //System.out.print("Please enter a sentence");
//            String sentence = inputLine();
//            System.out.println(sentence);

        //caputres the whole sentence
//
//        Calculate the perimeter and area of Codeup's classrooms.

//        System.out.print("Please enter a length");
//                int length = Integer.parseInt(input.nextLine());
//
//                System.out.print("Please enter a width");
//                int width = Integer.parseInt(input.nextLine());
////
//        System.out.print("Please enter a length");
//        String lengthInput = input.nextLine();
//
//        System.out.print("Please enter a width");
//        String widthInput = input.nextLine();
//
//        int length = Integer.parseInt(lengthInput);
//        int width = Integer.parseInt(widthInput);
//
//        int area = length * width;
//        int paremeter = (2*width) + (2*length);
//
//        System.out.println("paremeter = " + perimeter);
//        Prompt the user to enter values of length and width of a classroom at Codeup.


//
//        Use the nextLine method to get user input and [parse](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String) the resulting string to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//        Display the area and perimeter of that classroom.
//
//        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//
//        Bonuses
//
//        Accept decimal entries.
//        Calculate the volume of the rooms in addition to the area and perimeter.
//        The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//
//        scanner.useDelimiter("\n");
//        How does this change the way your program operates?
//
//        Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
//
