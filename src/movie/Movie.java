package movie;

import java.util.Comparator;
import java.util.List;

public class Movie {
        private String name;
        private int year;
        private String description;
        private Director director;
        private List<Cast> cast;

        public Movie(){}

        public Movie(String name, int year, String description, Director director, List<Cast> cast) {
            this.name = name;
            this.year = year;
            this.description = description;
            this.director = director;
            this.cast = cast;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Director getDirector() {
            return director;
        }

        public void setDirector(Director director) {
            this.director = director;
        }

        public List<Cast> getCast() {
            return cast;
        }

        public void setCast(List<Cast> cast) {
            this.cast = cast;
        }

        @Override
        public String toString() {
            return "\nName: " + name +
                    "\nYear: " + year +
                    "\nDescription: " + description +
                    "\nDirector: " + director +
                    "\n* Cast of "+name +" * "+ cast+
                    "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        }
    public static Comparator<Movie> sortYearByAscending=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()-o2.getYear();
        }
    };
    public static Comparator<Movie> getSortYearByDescending=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear()-o1.getYear();
        }
    };
    public static Comparator<Movie> sortNameByAscending=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Movie> sortNameByDescending=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

}
