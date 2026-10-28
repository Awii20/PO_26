package Lab03;

public class InitializationDemo {

    static String staticField = printMessage("1. Inicjalizacja pola statycznego");

    static {
        System.out.println("2. Wykonanie bloku statycznego");
    }

    String instanceField = printMessage("3. Inicjalizacja pola instancji");

    {
        System.out.println("4. Wykonanie bloku instancyjnego");
    }

    public InitializationDemo() {
        System.out.println("5. Wykonanie konstruktora");
    }

    private static String printMessage(String message) {
        System.out.println(message);
        return message;
    }

    public static void main(String[] args) {
        InitializationDemo obj1 = new InitializationDemo();
    }
}