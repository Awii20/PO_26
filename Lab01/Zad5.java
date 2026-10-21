package Lab01;

public class Zad5 {

    public static void main(String[] args) {
        int x = 2;
        int wynik = 0;

        for (int i = 0; i < 4; i++) {
            wynik += x;
            x *= 2;
        }

        System.out.println(x);
        System.out.println(wynik);
    }
}

// 2 + 4 + 8 + 16 = 30
// x = 32    wynik = 30   i = 4