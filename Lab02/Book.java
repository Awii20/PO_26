package Lab02;

public class Book {

    String title;
    String author;
    int publicationYear;

    // 1. Konstruktor bezargumentowy
    public Book() {
        this("Nieznany tytuł", "Nieznany autor", 0);
    }

    // 2. Konstruktor przyjmujący title i author
    public Book(String title, String author) {
        this(title, author, 0);
    }

    // 3. Konstruktor przyjmujący wszystkie trzy wartości
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void showInformation() {
        System.out.println("Tytuł: " + title + ", Autor: " + author + ", Rok wydania: " + publicationYear);
    }
}