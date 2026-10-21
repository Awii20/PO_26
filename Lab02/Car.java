package Lab02;

public class Car {

    String brand;
    String model;
    int productionYear;
    double mileage;

    public Car() {
        this("Nieznana", "Nieznany", 0, 0.0);
    }

    public Car(String brand, String model, int productionYear) {
        this(brand, model, productionYear, 0.0);
    }

    public Car(String brand, String model, int productionYear, double mileage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    // Konstruktor kopiujący
    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.productionYear = other.productionYear;
        this.mileage = other.mileage;
    }

    public void drive(double distance) {
        if (distance > 0) {
            mileage += distance;
        }
    }

    public void showInformation() {
        System.out.println("Marka: " + brand + ", Model: " + model +
                ", Rok: " + productionYear + ", Przebieg: " + mileage + " km");
    }
}