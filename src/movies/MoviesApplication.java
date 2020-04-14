package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class MoviesApplication {

    public static String[] genres;
    static Input input;

    public static void main(String[] args) throws Exception {
        //Give user list of options for viewing all movies or movies by category.
        //Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
        //If a category is selected, only movies from that category should be displayed.
        //Your application should continue to run until the user chooses to exit.

        //Give user list of options for viewing all movies or movies by category.
        input = new Input();
        Movie[] movieList = MoviesArray.findAll();

        genres = getGenres(movieList);


        int choice;
        do {
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println("");
            System.out.println("\t0 - exit");
            System.out.println("\t1 - view all movies");
            System.out.println("\t2 - Add a movie");

            // Loop through genres
            int count = 3;
            for (String genre : genres) {
                System.out.println("\t" + count + " - view movies in the " + genre + " category");
                count++;
            }
            System.out.println("");

            choice = input.getInt(0, count - 1, "Enter your choice: ");

            // Set up a switch statement to choose what to display / do
            if (choice != 0 && choice != 2) {
                // iterate through movies, print out based on user's input
                for (Movie movie : movieList) {
                    switch (choice) {
                        case 1:
                            System.out.printf("\t%s -- %S\n", movie.getName(), movie.getCategory());
                            break;
                        default:
                            if (movie.getCategory().equalsIgnoreCase(genres[choice-3])) {
                                System.out.printf("\t%s -- %S\n", movie.getName(), movie.getCategory());
                            }
                            break;
                    }
                }
            }
            if (choice == 2) {
                movieList = addMovie(movieList);
                genres = getGenres(movieList);
            }
        } while (choice != 0);
        // User typed 0, so time to exit
        System.out.println("\tGoodbye!");

    }

    private static Movie[] addMovie(Movie[] movieList) throws Exception {
        // if user wants to add movie, get title and category, add to MovieList array
        String name = input.getString("Enter movie name: ");
        String category = input.getString("Enter movie category: ");

        // create new Movie object
        Movie newMovie = new Movie(name, category);
        Movie[] newList = null;
        int length = 0;

        if (movieList != null) {
            newList = Arrays.copyOf(movieList, movieList.length + 1);
        } else {
            newList = new Movie[1]; // empty list passed, return list will only have new movie
        }

        // add new Movie to MovieList array
        newList[newList.length-1] = newMovie;

        return newList;
    }

    private static String[] getGenres(Movie[] oldList) {
        int count = 1;
        String categories = oldList[0].getCategory();
        System.out.println(oldList.length);
        // "drama,action,horror"

        for (Movie movie : oldList) {
            System.out.println(movie.getName());
            if (!categories.contains(movie.getCategory())) {
                if (count > 0) {
                    categories += ",";
                }
                categories += movie.getCategory();
                count++;
            }
            System.out.println(categories);
            System.out.println(count);
        }

        return categories.split(",");
    }
}