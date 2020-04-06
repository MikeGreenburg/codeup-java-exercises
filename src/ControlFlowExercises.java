//public class ControlFlowExercises {
//}

//Exercises
//        For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.
//
//        Loop Basics
//
//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i < 15) {
//        System.out.println("i is " + i);
//        i++;
//        }
//
//Practice writing While loops
//        int i = 5;
//        while (i < 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
//
//        int i = 5;
//        while (i < 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
//
//        int i = 6;
//        while ( i < 20) {
//            System.out.println("i is " + i);
//            i++;
//        }
//
//        int i = 23;
//        while ( i < 100) {
//            System.out.println("i is " + i);
//            i++;
//        }
//
//        int i = 2;
//        while (i < 100) {
//            System.out.println("i is " + i);
//            i++;
//        }
//
//        int i = 4;
//        while (i < 20) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//        int a = 2;
//        int counter1 = 0;

//        do {
//        Sytem.out.println("\n=======================");
//        System.out.println("Current Loop: "+ counter1);
//        if(a == 0){
//            System.out.print(a);
//            break;
//                }
//        System.out.print("\nValue of a: " + a + "\n";)
//        a *= a;
//        counter1++;
//        } while (a =< 100000);

// Practice writing Do While loops

//        int a = 2;
//        int counter1 = 0;
//
//        do{
//                System.out.println("\n=======================");
//                System.out.println("Current Loop: "+counter1);
//                if(a==0){
//                System.out.print(a);
//                break;
//                }
//                System.out.print("\nValue of a: " + a + "\n");
//                a*=a;
//                counter1++;
//                } while (a =< 100000);
//
//        int b = 5;
//        int counter22 = 0;
//
//        do {
//            System.out.println("\n==========================");
//            System.out.println("Current Loop: " + counter22);
//            if(b == 0){
//                break;
//        }
//            System.out.print("\nValue of b: " + b + "\n");
//            b *= b;
//            counter22++;
//        } while (b =< 2000);
//
//        int c = 1;
//        int counter5 = 0;
//
//        do {
//            System.out.println("\n============================");
//            System.out.println("Current Loop: " + counter5);
//        if (c == 0){
//            break;
//        }
//        System.out.print("\nValue of c: " + c + "\n");
//        c *= c;
//        counter5++;
//        } while (c =< 100);
//
//        int g = 7;
//        int counter12 = 0;
//
//        do {
//            System.out.println("\n============================");
//            System.out.println("Current Loop: " + counter12);
//            if(g == 0){
//                break;
//        }
//            System.out.print("\nValue of g: " + g + "\n");
//            g *= g;
//            counter12++;
//        } while (g =< 5000);
//
//        int z = 1;
//        int counter01 = 1;
//
//        do {
//            System.out.println("\n============================");
//            System.out.println("Current Loop: " + counter01);
//            if(z == 0){
//                break;
//        }
//            System.out.print("\nValue of z: " + z + "\n");
//            z *= z;
//            counter01++;
//        } while (z =< 32768);


//        For
//

//        for(int i = 0; i < 10; i += 1) {
//        System.out.println("i is " + i);
//        }

//        Refactor the previous two exercises to use a for loop instead.
//        Fizzbuzz
//
//        for(int i = 1; i <= 100; i++){
//                if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//                } else if (i % 3 == 0){
//                System.out.println("Fizz");
//                } else if (i % 5 == 0){
//                System.out.println("Buzz");
//                } else {
//                System.out.println(i);
//                }
//                }

//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        Display a table of powers.
//


//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125
//        Convert given number grades into letter grades.

//            Scanner input = new Scanner(System.in);
//
//                    String userConfirm = "Y";
//
//                    while(userConfirm.equalsIgnoreCase("y")){
//                    System.out.println("What number would you like to go up to?");
//                    int num = Integer.parseInt(input.nextLine());
//
//
//                    System.out.println("Here is your table!");
//                    System.out.println("number | squared | cubed");
//                    System.out.println("------ | ------- | -----");
//
//                    for(int counter = 1; counter <= num; counter++){
//                    System.out.printf("%-6d | %-7d | %d%n", counter, counter*counter, counter*counter*counter);
//                    }
//
//                    System.out.println("Would you like to test another number? Y/N");
//                    userConfirm = input.nextLine();
//
//                    }
//
//                    System.out.println("Ok, have a nice day!");
//
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

//        boolean gradeContinue = true;
//                do {
//                System.out.println("Please enter a number grade");
//                int numericGrade = input.nextInt();
//
//                if(numericGrade >= 88) {
//                System.out.println("A");
//                } else if (numericGrade >= 80){
//                System.out.println("B");
//                } else if (numericGrade >= 67) {
//                System.out.println("C");
//                } else if (numericGrade >= 60){
//                System.out.println("D");
//                } else {
//                System.out.println("F");
//                }
//
//                System.out.println("Would you like to enter a new grade? (y/n)");
//                String userResponse = input.next();
//
//                if(!userResponse.equalsIgnoreCase("y")){
//                gradeContinue = false;
//                }
//
//                }while (gradeContinue);
