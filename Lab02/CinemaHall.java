package Lab02;

public class CinemaHall {

    int hallNumber;
    int totalSeats;
    int freeSeats;

    public CinemaHall(int hallNumber, int totalSeats) {
        this.hallNumber = hallNumber;
        this.totalSeats = totalSeats;
        this.freeSeats = totalSeats;
    }

    public void reserveSeat() {
        if (freeSeats > 0) {
            freeSeats -= 1;
        }
    }

    public void showHallStatus() {
        System.out.println("Sala nr " + hallNumber + " | Wolne miejsca: " + freeSeats + "/" + totalSeats);
    }
}