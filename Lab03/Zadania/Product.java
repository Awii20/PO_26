package Lab03;

public class Product {

    String name;
    int price;
    static int numberOfProducts;
    public static final int MAX_PRODUCTS = 14; //Żeby dużo nie dodawać

    public Product(String name, int price){
        this.name = name;
        this.price = price;
        numberOfProducts ++;
    }

    public void getNumberOfProducts(){
        System.out.println("Liczba produktów:" + numberOfProducts);
    }
}

//1. Ponieważ tyczy się to wszystkich produktów, a nie konkretnego
//2. Ponieważ jest to wspólny dla każdego i nie jest on do zmiany
//3.
