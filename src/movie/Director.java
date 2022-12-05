package movie;

import java.util.Comparator;

public class Director {
        private String name;
        private String lastName;

        public Director(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return name +" "+ lastName;
        }
    public static Comparator<Movie> sortByDirector=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

}
