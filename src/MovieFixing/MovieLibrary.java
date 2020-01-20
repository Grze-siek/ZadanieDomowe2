package MovieFixing;

public class MovieLibrary {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.title = "Forrest Gump";
        movie.description = "Historia życia Forresta, chłopca o niskim ilorazie inteligencji " +
        "z niedowładem kończyn, który staje się miliarderem i bohaterem wojny w Wietnamie.";
        movie.director = "Robert Zemeckis";
        movie.rating = 9;
        movie.oscars = true;

        System.out.println("Informacje o filmie:");
        System.out.printf("Tytuł: %s\n", movie.title);
        System.out.printf("Opis: %s\n", movie.description);
        System.out.printf("Reżyser: %s\n", movie.director);
        System.out.printf("Ocena: %d/10\n", movie.rating);
        System.out.printf("Czy otrzymał Oskara: %b\n", movie.oscars);
    }
}
