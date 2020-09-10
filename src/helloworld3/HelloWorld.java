package helloworld3;

import java.text.MessageFormat;

public class HelloWorld {

    public static void main(String [] args) {
        //Print the words Hello World on the screen
        System.out.println("Hello World");

        int myLength = "Hello World".length();
        System.out.println(myLength);
        //Returns 11

        String uCase = "Hello World".toUpperCase();
        //Returns "HELLO WORLD"

        String firstSubstring = "Hello World".substring(6);
        //Returns "World"

        String message = "Hellow World";
        String secondSubstring = message.substring(1, 8);
        //Returns "ello Wo"
    }

}
