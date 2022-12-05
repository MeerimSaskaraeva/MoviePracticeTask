package service.impl;

import movie.Director;
import movie.Movie;
import service.Sortable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MovieComparator implements Sortable{

    @Override
    public void sortByMovieName(List<Movie> movies) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to sort by ascending"+
                "\nPress 2 to by descending");
        int num2= sc.nextInt();
        switch (num2) {
            case 1 -> {
                Collections.sort(movies, Movie.sortNameByAscending);
                for (Movie mov : movies) {
                    System.out.println(mov);
                }
            }
            case 2 -> {
                Collections.sort(movies, Movie.sortNameByDescending);
                for (Movie mov : movies) {
                    System.out.println(mov);
                }
            }
        }

    }

    @Override
    public void sortByYear(List<Movie> movies) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to sort by ascending"+
                "\nPress 2 to by descending");
        int num2= sc.nextInt();
        switch (num2) {
            case 1 -> {
                Collections.sort(movies,Movie.sortYearByAscending);
                for (Movie mov : movies) {
                    System.out.println(mov.toString());
                }
            }
            case 2 -> {
                Collections.sort(movies,Movie.getSortYearByDescending);
                for (Movie mov : movies) {
                    System.out.println(mov.toString());}
            }
        }
    }


    @Override
    public void sortByDirector(List<Movie> movies) {
        Collections.sort(movies, Director.sortByDirector);
        for (Movie mov : movies) {
            System.out.println(mov);}
    }


}
