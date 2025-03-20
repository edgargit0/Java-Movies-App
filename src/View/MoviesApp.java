package View;

import java.util.Scanner;

import domain.Movie;
import service.IMovieService;
import service.MovieServiceImpl;

public class MoviesApp {
    public static void main(String[] args) throws Exception {

        boolean exit = false;
        Scanner console = new Scanner(System.in);
        
        IMovieService movieService = new MovieServiceImpl();

        while (!exit) {
            try {
                displayMenu();
                exit = runMenuOptions(console, movieService);
            } catch (Exception e) {
                System.out.println("An error has occur: " + e.getMessage());
            }

            System.out.println(); // sout just to print an empty line
        } // end while
    }

    // display menu method
    private static void displayMenu() {
        System.out.print("""
                *** Menu ***
                1. Add Movie
                2. List Movies
                3. Find Movie
                4. Exit
                Choose an option:
                """);
    }

    //runMenuOptions method
    private static boolean runMenuOptions(Scanner console, IMovieService movieService) {

        var option = Integer.parseInt(console.nextLine());
        var exit = false;
        
        switch (option) {
            case 1 -> {
                System.out.println("Enter movie name");
                var movieName = console.nextLine();
                movieService.addMovie(new Movie(movieName));
            }
            case 2 -> {
                movieService.listMovies();
            }
            case 3 -> {
                System.out.println("Enter movie name to find");
                var movieName = console.nextLine();
                movieService.findMovie(new Movie(movieName));
            }
            case 4 -> {
                System.out.println("finishing execution...");
                exit=true;
            }
            default -> {
                System.out.println("Invalid option " + option);
                System.out.println("Please enter an option between 1 to 4");
            }
            return exit;
        }
    }

}
