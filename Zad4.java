import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // brak ;

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { // nie = tylko porównanie ==
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); // brak ;
        }

        for (int i = 0; i <= 5; i++) { //nieskończona pętla
            System.out.println(i);
        }

        scanner.close();
    }
}
