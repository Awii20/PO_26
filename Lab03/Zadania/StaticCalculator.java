package Lab03;

public class StaticCalculator {

    static int numberOfOperations;

    public static int add(int a, int b){
        numberOfOperations++;
        return a+b;
    }

    public static double add(double a, double b){
        numberOfOperations++;
        return a+b;
    }

    public static int add(int a, int b, int c){
        numberOfOperations++;
        return a+b+c;
    }

    public static int substract(int a, int b){
        numberOfOperations++;
        return a-b;
    }

    public static double substract(double a, double b) {
        numberOfOperations++;
        return a - b;
    }

    public static int multipy(int a, int b){
        numberOfOperations++;
        return a*b;
    }

    public static double multipy(double a, double b){
        numberOfOperations++;
        return a*b;
    }

    public void getNumberOfOperations(){
        System.out.println("Liczba operacji: " + numberOfOperations);
    }
}
