package grades;

import util.Input;

import java.util.*;


public class GradesApplication {
    private static Input userInput = new Input();
    private static HashMap<String, Student> students = studentList();

    public static void main(String[] args) {
        System.out.println("\nWelcome!\n");
        boolean yesNo;
        do {
            studentPrinter(students);
            yesNo = userInput.yesNo();
        } while (yesNo);
        System.out.println("Thanks for your visit.");
    }

    public static HashMap<String, Student> studentList() {
        Student anthony = new Student("Anthony");
        anthony.addGrade(89);
        anthony.addGrade(79);
        anthony.addGrade(69);
        anthony.addGrade(59);

        Student ernie = new Student("Ernie");
        ernie.addGrade(49);
        ernie.addGrade(49);
        ernie.addGrade(49);
        ernie.addGrade(49);

        Student mike = new Student("Mike");
        mike.addGrade(94);
        mike.addGrade(94);
        mike.addGrade(94);
        mike.addGrade(94);

        Student felicia = new Student("Felicia");
        felicia.addGrade(100);
        felicia.addGrade(100);
        felicia.addGrade(100);
        felicia.addGrade(100);

        HashMap<String, Student> students = new HashMap<>();
        students.put("torres", anthony);
        students.put("greenburg", mike);
        students.put("cespedes", felicia);
        students.put("brown", ernie);

        return students;
    }

    private static void studentPrinter(HashMap<String, Student> students) {
        System.out.println("\nHere are the names of the students: \n");
        for (String key : students.keySet()) {
            System.out.print("| " + key + " | ");
        }
        System.out.print(" | all | \n");
        System.out.println("\nWhat student would you like to look up?\n");
        String studentSearch = userInput.getString();

        if (studentSearch.equalsIgnoreCase("all")) {
            listAll();
            printCSV();
        } else if (students.containsKey(studentSearch)) {
            studentFound(studentSearch);
        } else {
            System.out.println("\nInvalid student\n");
        }
        System.out.println("\nDo you want to see another student?\n");
    }

    public static void listAll() {
        for (Map.Entry<String, Student> allStudents : students.entrySet()) {
            System.out.println("\nName: " + allStudents.getValue().getName() + " - GitHub Username: " + allStudents.getKey());
            System.out.println("Current Average: " + allStudents.getValue().getGradeAverage() + "\n");
            System.out.println(allStudents.getValue().grades());
        }
    }

    public static void studentFound (String studentSearch) {
        System.out.println("\nName: " + students.get(studentSearch).getName() + " - GitHub Username: " + studentSearch + "\nCurrent Average: " + students.get(studentSearch).getGradeAverage());
    }

    public static void printCSV () {
        for (Map.Entry<String, Student> allStudents : students.entrySet()) {
            System.out.printf(allStudents.getValue().getName() + ", " + allStudents.getKey() + ", " + allStudents.getValue().getGradeAverage() + "\n");
        }
    }
}