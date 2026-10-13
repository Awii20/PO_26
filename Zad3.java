import java.util.Scanner;

public class Zad3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];

        System.out.println("Wprowadź 10 liczb całkowitych:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }

        int max = tablica[0];
        int min = tablica[0];
        int suma = 0;

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
            if (tablica[i] < min) {
                min = tablica[i];
            }
            suma += tablica[i];
        }

        double srednia = (double) suma / tablica.length;

        int wiekszeOdSredniej = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > srednia) {
                wiekszeOdSredniej++;
            }
        }

        System.out.println("\nWyniki analizy:");
        System.out.println("Największa wartość: " + max);
        System.out.println("Najmniejsza wartość: " + min);
        System.out.println("Suma wszystkich elementów: " + suma);
        System.out.println("Średnia arytmetyczna: " + srednia);
        System.out.println("Liczba wartości większych od średniej: " + wiekszeOdSredniej);
    }
}