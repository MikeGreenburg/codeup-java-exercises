package movies;

import util.Input;

import java.util.*;

public class MoviesApplication {
    private static ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(MoviesArray.findAll()));
    private static Input userInput = new Input();

    public static void main(String[] args) {
        do {
            menu();
            int userChoice = userInput.getInt(0, 7);
            switch (userChoice) {
                case 0:
                    System.exit(0);
                case 1:
                    getAll();
                    break;
                case 2:
                    getCat("scifi");
                    break;
                case 3:
                    getCat("horror");
                    break;
                case 4:
                    getCat("animated");
                    break;
                case 5:
                    getCat("drama");
                    break;
                case 6:
                    getCat("thriller");
                case 7:
                    getCat("action");
                case 8:
                    addMovie();
                    break;
                case 9:
                    movieSearch();
                    break;
                default:
                    System.out.println("Invalid entry.");
                    break;
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("\n0 - Exit");
        System.out.println("1 - View all movies");
        System.out.println("2 - scifi");
        System.out.println("3 - horror");
        System.out.println("4 - animated");
        System.out.println("5 - drama");
        System.out.println("6 - thriller");
        System.out.println("7 - action");
        System.out.println("8 - Add a new movie");
        System.out.println("9 - Search movie");
        System.out.print("Enter choice: \n");
    }

    public static void showMovie(Movie movie) {
        System.out.println(movie);
    }

    public static void getAll() {
        for (Movie movie : movies) {
            showMovie(movie);
        }
    }

    public static void getCat(String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                showMovie(movie);
            }
        }
    }

    public static void addMovie() {
        System.out.println("Enter new movie name: ");
        String name = userInput.getString();
        System.out.println("Enter movie category: ");
        String category = userInput.getString().toLowerCase();

        movies.add(new Movie(name, category));
    }


    public static void movieSearch() {
        System.out.println("Enter movie you are looking for: ");
        String name = userInput.getString();
        Movie movie = new Movie(name);
        if (movies.contains(movie)) {
            System.out.println(movies.get(movies.indexOf(movie)));
        } else {
            System.out.println("Movie not found");
        }
    }
}