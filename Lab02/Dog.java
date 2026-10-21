package Lab02;

public class Dog{

    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println("Woof Woof");
    }

    public void showInformation() {
        System.out.println("Imie: " + this.name );
        System.out.println("Rasa: " + this.breed );
        System.out.println("Wiek: " + this.age );
    }
}
