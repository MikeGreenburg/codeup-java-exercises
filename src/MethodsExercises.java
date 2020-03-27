import java.util.InputMismatchException;
        import java.util.Scanner;

public class MethodsExercises {

    /**
     * Exercise 01: Basic Arithmetic
     *
     * Create four separate methods. Each will perform an arithmetic operation:
     *
     * Addition
     * Subtraction
     * Multiplication
     * Division
     *
     * Each function needs to take two parameters/arguments so that the operation can be performed.
     *
     * Test your methods and verify the output.
     *
     * Add a modulus method that finds the modulus of two numbers.
     *
     * Food for thought: What happens if we try to divide by zero? What should happen?
     *
     * Bonus
     *
     * Create your multiplication method without the * operator (Hint: a loop might be helpful).
     * Do the above with recursion.
     */

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Attempt to divide by zero");
        }
        return a / b;
    }

    public static int modulus(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Attempt to divide by zero");
        }
        return a % b;
    }

    public static int multWithLoop(int a, int b) {
        if (a < 0) b = 0 - b;
        int product = 0;
        for (int i = a; i > 0; i--) {
            product += b;
        }
        return product;
    }

    public static int multWithRecursion(int a, int b) {
        int product = 0;
        if (a > 0) {
            product = b + multWithRecursion(a - 1, b);
        } else if (a < 0) {
            product = (0 - b) + multWithRecursion(a + 1, b);
        }
        return product;
    }

    /**
     * The driver to test exercise 01
     */
    public static void testExercise01() {
        // test methods
        testAdd();
        testSubtract();
        testMultiply();
        testdivide();
        testmodulus();
        testmultWithLoop();
        testmultWithRecursion();
    }

    /**
     * Here are all of the test for exercise 01
     */


    /**
     * Method for testing the add routine
     * @return - true if all test pass
     */
    public static boolean testAdd() {
        System.out.println();

        // two positive
        int sum = add(3, 4);
        if (sum == 7) {
            System.out.println("add(3, 4) test passed.");
        } else {
            System.out.printf("add(3, 4) test failed with %d.\n", sum);
            return false;
        }

        // positive, negative
        sum = add(-3, 4);
        if (sum == 1) {
            System.out.println("add(-3, 4) test passed.");
        } else {
            System.out.printf("add(-3, 4) test failed with %d.\n", sum);
            return false;
        }

        // negative, positive
        sum = add(3, -4);
        if (sum == -1) {
            System.out.println("add(3, -4) test passed.");
        } else {
            System.out.printf("add(3, -4) test failed with %d.\n", sum);
            return false;
        }

        // negative, negative
        sum = add(-3, -4);
        if (sum == -7) {
            System.out.println("add(-3, -4) test passed.");
        } else {
            System.out.printf("add(-3, -4) test failed with %d.\n", sum);
            return false;
        }

        // zero, negative
        sum = add(0, -4);
        if (sum == -4) {
            System.out.println("add(0, -4) test passed.");
        } else {
            System.out.printf("add(0, -4) test failed with %d.\n", sum);
            return false;
        }

        // positive, zero
        sum = add(3, 0);
        if (sum == 3) {
            System.out.println("add(3, 0) test passed.");
        } else {
            System.out.printf("add(3, 0) test failed with %d.\n", sum);
            return false;
        }
        return true;
    }

    /**
     * Method for testing the subtract routine
     * @return - true if all test pass
     */
    public static boolean testSubtract() {
        System.out.println();

        // two positive
        int difference = subtract(3, 4);
        if (difference == -1) {
            System.out.println("subtract(3, 4) test passed.");
        } else {
            System.out.printf("subtract(3, 4) test failed with %d.\n", difference);
            return false;
        }

        // positive, negative
        difference = subtract(-3, 4);
        if (difference == -7) {
            System.out.println("subtract(-3, 4) test passed.");
        } else {
            System.out.printf("subtract(-3, 4) test failed with %d.\n", difference);
            return false;
        }

        // negative, positive
        difference = subtract(3, -4);
        if (difference == 7) {
            System.out.println("subtract(3, -4) test passed.");
        } else {
            System.out.printf("subtract(3, -4) test failed with %d.\n", difference);
            return false;
        }

        // negative, negative
        difference = subtract(-3, -4);
        if (difference == 1) {
            System.out.println("subtract(-3, -4) test passed.");
        } else {
            System.out.printf("subtract(-3, -4) test failed with %d.\n", difference);
            return false;
        }

        // zero, negative
        difference = subtract(0, -4);
        if (difference == 4) {
            System.out.println("subtract(0, -4) test passed.");
        } else {
            System.out.printf("subtract(0, -4) test failed with %d.\n", difference);
            return false;
        }

        // positive, zero
        difference = subtract(3, 0);
        if (difference == 3) {
            System.out.println("subtract(3, 0) test passed.");
        } else {
            System.out.printf("subtract(3, 0) test failed with %d.\n", difference);
            return false;
        }
        return true;
    }

    /**
     * Method for testing the multiply routine
     * @return - true if all test pass
     */
    public static boolean testMultiply() {
        System.out.println();

        // two positive
        int product = multiply(3, 4);
        if (product == 12) {
            System.out.println("multiply(3, 4) test passed.");
        } else {
            System.out.printf("multiply(3, 4) test failed with %d.\n", product);
            return false;
        }

        // positive, negative
        product = multiply(-3, 4);
        if (product == -12) {
            System.out.println("multiply(-3, 4) test passed.");
        } else {
            System.out.printf("multiply(-3, 4) test failed with %d.\n", product);
            return false;
        }

        // negative, positive
        product = multiply(3, -4);
        if (product == -12) {
            System.out.println("multiply(3, -4) test passed.");
        } else {
            System.out.printf("multiply(3, -4) test failed with %d.\n", product);
            return false;
        }

        // negative, negative
        product = multiply(-3, -4);
        if (product == 12) {
            System.out.println("multiply(-3, -4) test passed.");
        } else {
            System.out.printf("multiply(-3, -4) test failed with %d.\n", product);
            return false;
        }

        // zero, negative
        product = multiply(0, -4);
        if (product == 0) {
            System.out.println("multiply(0, -4) test passed.");
        } else {
            System.out.printf("multiply(0, -4) test failed with %d.\n", product);
            return false;
        }

        // positive, zero
        product = multiply(3, 0);
        if (product == 0) {
            System.out.println("multiply(3, 0) test passed.");
        } else {
            System.out.printf("multiply(3, 0) test failed with %d.\n", product);
            return false;
        }
        return true;
    }

    /**
     * Method for testing the divide routine
     * @return - true if all test pass
     */
    public static boolean testdivide() {
        System.out.println();

        // two positive
        int answer = divide(12, 4);
        if (answer == 3) {
            System.out.println("divide(12, 4) test passed.");
        } else {
            System.out.printf("divide(12, 4) test failed with %d.\n", answer);
            return false;
        }

        // positive, negative
        answer = divide(-12, 4);
        if (answer == -3) {
            System.out.println("divide(-12, 4) test passed.");
        } else {
            System.out.printf("divide(-12, 4) test failed with %d.\n", answer);
            return false;
        }

        // negative, positive
        answer = divide(13, -4);
        if (answer == -3) {
            System.out.println("divide(13, -4) test passed.");
        } else {
            System.out.printf("divide(13, -4) test failed with %d.\n", answer);
            return false;
        }

        // negative, negative
        answer = divide(-13, -4);
        if (answer == 3) {
            System.out.println("divide(-13, -4) test passed.");
        } else {
            System.out.printf("divide(-13, -4) test failed with %d.\n", answer);
            return false;
        }

        // zero, negative
        answer = divide(0, -4);
        if (answer == 0) {
            System.out.println("divide(0, -4) test passed.");
        } else {
            System.out.printf("divide(0, -4) test failed with %d.\n", answer);
            return false;
        }

        // positive, zero
//        answer = divide(13, 0);
//        if (answer == 13) {
//            System.out.println("divide(13, 0) test passed.");
//        } else {
//            System.out.printf("divide(13, 0) test failed with %d.\n", answer);
//            return false;
//        }
        return true;
    }

    /**
     * Method for testing the modulus routine
     * @return - true if all test pass
     */
    public static boolean testmodulus() {
        System.out.println();

        // two positive
        int remainder = modulus(13, 4);
        if (remainder == 1) {
            System.out.println("modulus(13, 4) test passed.");
        } else {
            System.out.printf("modulus(13, 4) test failed with %d.\n", remainder);
            return false;
        }

        // positive, negative
        remainder = modulus(-13, 4);
        if (remainder == -1) {
            System.out.println("modulus(-13, 4) test passed.");
        } else {
            System.out.printf("modulus(-13, 4) test failed with %d.\n", remainder);
            return false;
        }

        // negative, positive
        remainder = modulus(13, -4);
        if (remainder == 1) {
            System.out.println("modulus(13, -4) test passed.");
        } else {
            System.out.printf("modulus(13, -4) test failed with %d.\n", remainder);
            return false;
        }

        // negative, negative
        remainder = modulus(-13, -4);
        if (remainder == -1) {
            System.out.println("modulus(-13, -4) test passed.");
        } else {
            System.out.printf("modulus(-13, -4) test failed with %d.\n", remainder);
            return false;
        }

        // zero, negative
        remainder = modulus(0, -4);
        if (remainder == 0) {
            System.out.println("modulus(0, -4) test passed.");
        } else {
            System.out.printf("modulus(0, -4) test failed with %d.\n", remainder);
            return false;
        }
        return true;
    }

    /**
     * Method for testing the multWithLoop routine
     * @return - true if all test pass
     */
    public static boolean testmultWithLoop() {
        System.out.println();

        // two positive
        int product = multWithLoop(3, 4);
        if (product == 12) {
            System.out.println("multWithLoop(3, 4) test passed.");
        } else {
            System.out.printf("multWithLoop(3, 4) test failed with %d.\n", product);
            return false;
        }

        // positive, negative
        product = multWithLoop(-3, 4);
        if (product == -12) {
            System.out.println("multWithLoop(-3, 4) test passed.");
        } else {
            System.out.printf("multWithLoop(-3, 4) test failed with %d.\n", product);
            return false;
        }

        // negative, positive
        product = multWithLoop(3, -4);
        if (product == -12) {
            System.out.println("multWithLoop(3, -4) test passed.");
        } else {
            System.out.printf("multWithLoop(3, -4) test failed with %d.\n", product);
            return false;
        }

        // negative, negative
        product = multWithLoop(-3, -4);
        if (product == 12) {
            System.out.println("multWithLoop(-3, -4) test passed.");
        } else {
            System.out.printf("multWithLoop(-3, -4) test failed with %d.\n", product);
            return false;
        }

        // zero, negative
        product = multWithLoop(0, -4);
        if (product == 0) {
            System.out.println("multWithLoop(0, -4) test passed.");
        } else {
            System.out.printf("multWithLoop(0, -4) test failed with %d.\n", product);
            return false;
        }

        // positive, zero
        product = multWithLoop(3, 0);
        if (product == 0) {
            System.out.println("multWithLoop(3, 0) test passed.");
        } else {
            System.out.printf("multWithLoop(3, 0) test failed with %d.\n", product);
            return false;
        }
        return true;
    }

    /**
     * Method for testing the multWithRecursion routine
     * @return - true if all test pass
     */
    public static boolean testmultWithRecursion() {
        System.out.println();

        // two positive
        int product = multWithRecursion(3, 4);
        if (product == 12) {
            System.out.println("multWithRecursion(3, 4) test passed.");
        } else {
            System.out.printf("multWithRecursion(3, 4) test failed with %d.\n", product);
            return false;
        }

        // positive, negative
        product = multWithRecursion(-3, 4);
        if (product == -12) {
            System.out.println("multWithRecursion(-3, 4) test passed.");
        } else {
            System.out.printf("multWithRecursion(-3, 4) test failed with %d.\n", product);
            return false;
        }

        // negative, positive
        product = multWithRecursion(3, -4);
        if (product == -12) {
            System.out.println("multWithRecursion(3, -4) test passed.");
        } else {
            System.out.printf("multWithRecursion(3, -4) test failed with %d.\n", product);
            return false;
        }

        // negative, negative
        product = multWithRecursion(-3, -4);
        if (product == 12) {
            System.out.println("multWithRecursion(-3, -4) test passed.");
        } else {
            System.out.printf("multWithRecursion(-3, -4) test failed with %d.\n", product);
            return false;
        }

        // zero, negative
        product = multWithRecursion(0, -4);
        if (product == 0) {
            System.out.println("multWithRecursion(0, -4) test passed.");
        } else {
            System.out.printf("multWithRecursion(0, -4) test failed with %d.\n", product);
            return false;
        }

        // positive, zero
        product = multWithRecursion(3, 0);
        if (product == 0) {
            System.out.println("multWithRecursion(3, 0) test passed.");
        } else {
            System.out.printf("multWithRecursion(3, 0) test failed with %d.\n", product);
            return false;
        }
        return true;
    }

    /**
     * Exercise 02: Create a method that validates that user input is in a certain range
     *
     * The method signature should look like this:
     * public static int getInteger(int min, int max);
     *
     * and is used like this:
     * System.out.print("Enter a number between 1 and 10: ");
     * int userInput = getInteger(1, 10);
     *
     * @param min
     * @param max
     * @return the number entered by the user
     */
    public static int getInteger(int min, int max) {
        // By the requirements given you, it indicates that you should
        // open a Scanner on the System.in stream here. But that is bad practice,
        // particularly with System.in. So I made the scanner a private class member
        // which is opened in the main method.
        boolean doAgain = true;
        int num = 0;
        do {
            try {
                num = scanner.nextInt();
                scanner.nextLine();
                if (num < min || num > max) {
                    System.out.printf("\nThe integer %d is out of range\n", num);
                    System.out.printf("Enter an Integer between %d and %d: ", min, max);
                } else {
                    doAgain = false;
                }
            } catch (InputMismatchException ime) {
                System.out.println("\nThat is not an integer.");
                System.out.printf("Enter an Integer between %d and %d: ", min, max);
                scanner.nextLine();
                num = 0;
            }
        } while (doAgain);
        return num;
    }

    private static Scanner scanner;
    public static void setScanner(Scanner s) {
        scanner = s;
    }

    /**
     * The driver to test exercise 02
     */
    public static void testExercise02() {
        System.out.println();
        System.out.print("Enter an integer between 0 and 20: ");
        int num = getInteger(0, 20);
        System.out.printf("The number is %d.\n\n", num);
    }

    /**
     * Exercise 03: Calculate the factorial of a number.
     *
     * Prompt the user to enter an integer from 1 to 10.
     * Display the factorial of the number entered by the user.
     * Ask if the user wants to continue.
     * Use a for loop to calculate the factorial.
     * Assume that the user will enter an integer, but verify it’s between 1 and 10.
     * Use the long type to store the factorial.
     * Continue only if the user agrees to.
     * A factorial is a number multiplied by each of the numbers before it.
     * Factorials are denoted by the exclamation point (n!). Ex:
     *
     *
     * 1! = 1               = 1
     * 2! = 1 x 2           = 2
     * 3! = 1 x 2 x 3       = 6
     * 4! = 1 x 2 x 3 x 4   = 24
     * Bonus
     *
     * Test the application and find the integer for the highest factorial that can be accurately calculated by this
     * application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer
     * that returns accurate factorial calculation}". Don’t forget to change your verification too!
     * Use recursion to implement the factorial.
     *
     * @param num
     * @return
     * @throws ArithmeticException
     */
    public static long calcFactorial(int num) throws ArithmeticException {
        long factorial = 1;
        long previousFactorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
            if (previousFactorial > factorial) {
                throw new ArithmeticException("The factorial of " + num +
                        " is too large to be represented by a long value");
            }
        }
        return factorial;
    }

    /**
     * Factorial using recursion watching for overflow
     * @param num
     * @return
     * @throws ArithmeticException
     */
    public static long recursiveCalcFactorial(int num) throws ArithmeticException {
        if (num <= 1) return 1;
        long fact = num * recursiveCalcFactorial(num -1 );
        if (fact < num) throw new ArithmeticException("The factorial is too large to be represented by a long value");
        return fact;
    }

    /**
     * The driver to test exercise 03
     */
    public static void testExercise03() {
        System.out.println();
        System.out.print("Enter an integer between 0 and 20 from which to calculate the factorial: ");
        int num = getInteger(0, 20);
        try {
            long fact = calcFactorial(num);
            System.out.printf("The factorial of %d is %d.\n", num, fact);
        }  catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        try {
            long fact = recursiveCalcFactorial(num);
            System.out.printf("The recursive factorial of %d is %d.\n\n", num, fact);
        }  catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }

    /**
     * Exercise 04: Create an application that simulates dice rolling.
     *
     * Ask the user to enter the number of sides for a pair of dice.
     *
     * Prompt the user to roll the dice.
     *
     * "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll
     * the dice again.
     *
     * Use static methods to implement the method(s) that generate the random numbers.
     *
     * Use the .random method of the java.lang.Math class to generate random numbers.
     */
    public static void testExercise04() {

        System.out.println("Welcome to the dice app. you can use the app for playing board games./n");
        System.out.print("How many dice do you want? (1 to 8) ");
        int numDice = getInteger(1, 8);
        System.out.print("How many sides do you want on each die? (1 to 8) ");
        int numSides = getInteger(1, 8);

        while(true) {
            System.out.print("Hit enter to roll the dice, enter 1 to exit ");
            String response = scanner.nextLine();
            if (response.length() != 0) break;
            System.out.println();

            int diceSum = 0;
            System.out.print("Dice: ");
            for (int i = 0; i < numDice; i++) {
                int diceValue = (int) (Math.random() * numSides) + 1;
                System.out.printf("%1d ", diceValue);
                diceSum += diceValue;
            }
            System.out.printf("\nThe sum of all dice: %1d\n\n", diceSum);
        }
    }

    /**
     * Exercise 05: Game Development 101
     *
     * Welcome to the world of game development!
     *
     * You are going to build a high-low guessing game. Create a class named HighLow inside of src.
     *
     * The specs for the game are:
     *
     * Game picks a random number between 1 and 100.
     * Prompts user to guess the number.
     * All user inputs are validated.
     * If user's guess is less than the number, it outputs "HIGHER".
     * If user's guess is more than the number, it outputs "LOWER".
     * If a user guesses the number, the game should declare "GOOD GUESS!"
     *
     * Hints
     * Use the random method of the java.lang.Math class to generate a random number.
     *
     * Bonus
     * Keep track of how many guesses a user makes.
     * Set an upper limit on the number of guesses.
     */
    public static void testExercise05() {

        System.out.println();
        System.out.println("Welcome to the high-low guessing game./n");

        boolean playAgain = true;
        do {
            boolean guessAgain = true;
            int target = (int) (Math.random() * 100) + 1;
            System.out.print("Guess a number between 1 and 100: ");
            int numberOfGuesses = 0;
            while (guessAgain) {
                int userGuess = getInteger();
                numberOfGuesses++;
                if (testGuess(userGuess, target, numberOfGuesses)) {
                    guessAgain = false;
                } else if (numberOfGuesses > 20) {
                    System.out.println("GONGRATULATIONS! You are the biggest looser! You don't even get " +
                            "a lousy version of our home game!");
                    guessAgain = false;
                }
            }
            System.out.println("Play again? (y/n) ");
            String input = scanner.nextLine();
            if (input.toLowerCase().contains("n")) playAgain = false;
        } while (playAgain);
    }

    /**
     * Move the guess checking to a separate method for clarity.
     * @param userGuess
     * @param target
     * @param numberOfGuesses
     * @return
     */
    private static boolean testGuess(int userGuess, int target, int numberOfGuesses) {
        boolean correct = false;
        if (userGuess > target) {
            System.out.println("LOWER");
        } else if (userGuess < target) {
            System.out.println("HIGHER");
        } else if (userGuess == target){
            correct = true;
            if (numberOfGuesses < 6) {
                System.out.println("BING! BING! BING! WINNER, WINNER, CHICKEN DINNER!");
            } else if (numberOfGuesses < 10) {
                System.out.println("Good job! You're a WINNER! You get a version of our home game");
            } else if (numberOfGuesses < 16) {
                System.out.println("Good job, Slob! You finally got it!");
            } else {
                System.out.println("Took you long enough, looser. Enjoy the home game.");
            }
        }
        return correct;
    }

    /**
     * Create a utility for integer entry for code reuse
     * @return      A user select integer
     */
    public static int getInteger() {
        scanner = new Scanner(System.in);
        boolean doAgain = true;
        int num = 0;
        do {
            try {
                num = scanner.nextInt();
                scanner.nextLine();
                doAgain = false;
            } catch (InputMismatchException ime) {
                System.out.println("That is not an integer.");
                scanner.nextLine();
                num = 0;
            }
        } while (doAgain);
        return num;
    }

    /**
     * This is the main method; it is used from testing the other methods
     * @param args      Unused
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        setScanner(scanner);
        testExercise01();
        testExercise02();
        testExercise03();
        testExercise04();
        testExercise05();
    }

}