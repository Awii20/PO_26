package Lab02;

public class Ticket {

    Movie movie;
    CinemaHall hall;
    int seatNumber;
    double price;

    public Ticket(Movie movie, CinemaHall hall, int seatNumber, double price) {
        this.movie = movie;
        this.hall = hall;
        this.seatNumber = seatNumber;
        this.price = price;
        this.hall.reserveSeat();
    }

    public void printTicket() {
        System.out.println("Bilet na film: \"" + movie.title + "\", Sala: " + hall.hallNumber +
                ", Miejsce: " + seatNumber + ", Cena: " + price + " zł");
    }
}