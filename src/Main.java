import movie.Cast;
import movie.Director;
import movie.Movie;
import service.impl.FindByMovie;
import service.impl.MovieComparator;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        FindByMovie find=new FindByMovie();
        MovieComparator movieComparator=new MovieComparator();
        Movie movie=new Movie();

        LinkedList<Movie> movies = new LinkedList<>();
        movies.add(new Movie("Avatar", 2009, "Film series", new Director("James", "Cameron"),
                new LinkedList<>(Arrays.asList
                        (new Cast("Sam Worthington","Jake Sully"),
                                (new Cast("Sigourney Weaver","Grace Augustine")),
                                (new Cast("Michelle Rodriguez","Trudy Chacon")),
                                (new Cast("Zoe Saldana","Neytiri"))))));
        movies.add(new Movie("Maleficent", 2014, "Film", new Director("Robert ", "Stromberg"),
                new LinkedList<>(Arrays.asList
                        (new Cast("Angelina Jolie","Maleficent"),
                                (new Cast("Elle Fanning","Aurora")),
                                (new Cast("Sam Riley","Diaval"))))));
        movies.add(new Movie("Tomb raider", 2001, "Serial", new Director("Simon ", "West"),
                new LinkedList<>(Arrays.asList
                        (new Cast("Angelina Jolie","Lara Croft"),
                                (new Cast("Some actor","Men")),
                                (new Cast("Some actor","Women"))))));
        while (true) {
            System.out.println("======================== Commands ========================" +
                    "\nPress 1 to print catalog" +
                    "\nPress 2 to find a movie by full" +
                    "\nPress 3 to sort by year" +
                    "\nPress 4 to sort by name" +
                    "\nPress 5 to sort by director" +
                    "\nPress 6 to find movies by actor's name" +
                    "\nPress 7 to find movies by director's name" +
                    "\nPress 8 to find movies by year" +
                    "\nPress 9 to list all movies and roles by actor's name" +
                    "\nPress 10 to sort list of all actors with his roles");
            int num= sc.nextInt();
            switch (num) {
                case 1-> find.getAllMovies(movies).forEach(System.out::println);
                case 2-> find.findMovieByDescription(movies);
                case 3-> movieComparator.sortByYear(movies);
                case 4-> movieComparator.sortByMovieName(movies);
                case 5-> movieComparator.sortByDirector(movies);
                case 6-> find.findMovieByActorName(movies);
                case 7-> find.findMovieByDirector(movies);
                case 8-> find.findMovieByYear(movies);
                case 9-> find.findMovieByRole(movies);

            }
        }

    }
}