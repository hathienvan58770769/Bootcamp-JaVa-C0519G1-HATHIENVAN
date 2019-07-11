package furama.library;

public class MovieTest {
    public static void main(String[] args) {
        Library<Movie> movieLibrary = new Library<Movie>();
        Movie movie1 = new Movie("C1", "Adam", "john",1995, 140);
        Movie movie2 = new Movie("C2", "Adam", "john",1996, 120);
        System.out.println("Add new movies to the library : ");
        movieLibrary.addElement(movie1);
        movieLibrary.addElement(movie2);
        for (Movie movie : movieLibrary.list) {
            System.out.println((movie));
        }
        System.out.println("\n Delete movies in the library : ");
        movieLibrary.removeElement(movie1);
        for (Movie movie : movieLibrary.list) {
            System.out.println((movie));
        }
    }

}
