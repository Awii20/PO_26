package animals;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void makeSound(){
        System.out.println("Woof Woof");
    }
}
