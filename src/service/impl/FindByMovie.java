package service.impl;

import movie.Movie;
import service.Findable;

import java.util.*;

public class FindByMovie implements Findable {

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {

        System.out.println("~~~~~~~~~~~~~~~~~~ * All Movies * ~~~~~~~~~~~~~~~~~~~");
        return new ArrayList<>(movies);
    }

    @Override
    public void findMovieByName(List<Movie> movies) {


    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("Write actor's name");
        Scanner sc=new Scanner(System.in);
        String act=sc.nextLine();
        List<Movie>actor=new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getCast().get(0).getActorFullName().contains(act)){
                actor.add(movie);}
        }actor.forEach(System.out::println);
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Write movie's year ");
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        List<Movie> year=new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getYear()==y){
                year.add(movie);
            }
        }
        year.forEach(System.out::println);
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("Write director's name");
        Scanner sc=new Scanner(System.in);
        String dir=sc.nextLine();
        List<Movie>actor=new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getDirector().getName().contains(dir)){
                actor.add(movie);}
        }actor.forEach(System.out::println);

    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        System.out.println("Write movie's name");
        Scanner sc=new Scanner(System.in);
        String mov=sc.nextLine();
        List<Movie>movies1=new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getName().contains(mov)) {
                movies1.add(movie);}
        }movies1.forEach(System.out::println);

    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        int i=0;
        System.out.println("Write actor's name");
        Scanner sc2=new Scanner(System.in);
        String name=sc2.nextLine();

        LinkedList<Movie> movName=new LinkedList<>();
        LinkedList<Movie> role=new LinkedList<>();
        for (Movie movie : movies) {
            if (movie.getCast().get(0).getActorFullName().contains(name)){
                movName.add(movie);
            }if (movie.getCast().get(i).getActorFullName().contains(name)){
                role.add(movie);}
        } System.out.println("----------------------------------------"+
                " \n         Actor: "+name+
                "\n----------------------------------------");

        System.out.print("Movie: "+movName.get(i).getName());
        System.out.println(" "+movName.get(i+1).getName());

        System.out.print(role.get(i).getCast().get(i));
        System.out.println(role.get(i+1).getCast().get(i));


    }
}
