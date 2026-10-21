package Lab02;

public class Main {

    public static void main(String[] args) {
        // ZADANIE 1
        System.out.println("=== ZADANIE 1: Dog ===");
        Dog dog1 = new Dog("Burek", "Owczarek niemiecki", 4);
        Dog dog2 = new Dog("Reksio", "Terier", 2);

        dog1.bark();
        dog1.showInformation();
        System.out.println();

        dog2.bark();
        dog2.showInformation();
        System.out.println();

        // ZADANIE 2
        System.out.println("=== ZADANIE 2: Point ===");
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(3.0, 4.0);

        double dist = p1.distance(p2);
        System.out.println("Odległość między p1 a p2 wynosi: " + dist);
        System.out.println();

        // ZADANIE 3
        System.out.println("=== ZADANIE 3: Book ===");
        Book book1 = new Book();
        Book book2 = new Book("Wiedźmin", "Andrzej Sapkowski");
        Book book3 = new Book("Lalka", "Bolesław Prus", 1890);

        book1.showInformation();
        book2.showInformation();
        book3.showInformation();
        System.out.println();

        // ZADANIE 4
        System.out.println("=== ZADANIE 4: Car ===");
        Car car1 = new Car();
        Car car2 = new Car("Audi", "A4", 2020);
        Car car3 = new Car("Toyota", "Corolla", 2018, 85000.0);

        car2.drive(150.5);
        car2.drive(-50.0); // ujemna odległość nie zwiększy przebiegu

        car1.showInformation();
        car2.showInformation();
        car3.showInformation();
        System.out.println();

        // ZADANIE 5
        System.out.println("=== ZADANIE 5: Konstruktor kopiujący ===");
        Car original = new Car("Ford", "Focus", 2019, 50000.0);
        Car copy = new Car(original);

        // Zmieniamy pole w obiekcie copy
        copy.mileage = 65000.0;
        copy.model = "Mondeo";

        System.out.print("Original: ");
        original.showInformation();
        System.out.print("Copy:     ");
        copy.showInformation();
        System.out.println();

        // ZADANIE 6
        System.out.println("=== ZADANIE 6: Referencje ===");
        Person first = new Person("Anna");
        Person second = first;

        second.name = "Maria";

        first.introduceYourself();
        second.introduceYourself();
        System.out.println();

        // ZADANIE 7
        System.out.println("=== ZADANIE 7: Referencja czy kopia? ===");
        // Przypadek 1: Przypisanie referencji

        Person pA = new Person("Anna");
        Person pB = pA;
        pB.name = "Maria";
        System.out.println("Po przypisaniu referencji (pB = pA):");
        pA.introduceYourself();
        pB.introduceYourself();

        // Przypadek 2: Konstruktor kopiujący

        Person pC = new Person("Anna");
        Person pD = new Person(pC);
        pD.name = "Maria";
        System.out.println("Po użyciu konstruktora kopiującego (new Person(pC)):");
        pC.introduceYourself();
        pD.introduceYourself();
        System.out.println();

        // ZADANIE 8
        System.out.println("=== ZADANIE 8: Counter ===");
        Counter counter1 = new Counter(0);
        Counter counter2 = new Counter(10);

        counter1.increaseOther(counter2);
        System.out.println("Wartość counter1: " + counter1.value);
        System.out.println("Wartość counter2 po zwiększeniu przez counter1: " + counter2.value);
        System.out.println();

        // ZADANIE 9
        System.out.println("=== ZADANIE 9: null ===");
        Car car = null;

        if (car != null) {
            car.showInformation();
        } else {
            System.out.println("Zmienna 'car' ma wartość null - nie można wywołać metody.");
        }
        System.out.println();

        // ZADANIE 10
        System.out.println("=== ZADANIE 10: Box ===");
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        b.value = 20;
        c.value = 30;

        System.out.println(a.value); // 20
        System.out.println(b.value); // 20
        System.out.println(c.value); // 30

        System.out.println(a == b);  // true
        System.out.println(a == c);  // false
        System.out.println();

        // ZADANIE 11
        System.out.println("=== ZADANIE 11: Product ===");
        Product product = new Product("Monitor", 1200);
        product.show();
        System.out.println();

        // ZADANIE 12
        System.out.println("=== ZADANIE 12: Model Kina ===");
        Movie movie = new Movie("Diuna", "Sci-Fi", 155);
        CinemaHall hall = new CinemaHall(1, 50);

        movie.showMovieInfo();
        hall.showHallStatus();

        Ticket ticket1 = new Ticket(movie, hall, 12, 28.50);
        Ticket ticket2 = new Ticket(movie, hall, 13, 28.50);

        ticket1.printTicket();
        ticket2.printTicket();
        hall.showHallStatus();
        System.out.println();
    }
}