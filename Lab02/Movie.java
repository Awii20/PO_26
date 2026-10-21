package Lab02;

public class Movie {

    String title;
    String genre;
    int durationMinutes;

    public Movie(String title, String genre, int durationMinutes) {
        this.title = title;
        this.genre = genre;
        this.durationMinutes = durationMinutes;
    }

    public void showMovieInfo() {
        System.out.println("Film: \"" + title + "\" (" + genre + "), czas trwania: " + durationMinutes + " min");
    }
}