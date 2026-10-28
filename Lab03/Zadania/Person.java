package Lab03;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void getName(){
        System.out.println(this.name);
    }

    public void getAge(){
        System.out.println(this.age);
    }

    public void getEmail(){
        System.out.println(this.email);
    }

    public void setAge(int age) {
        if(age>0 && age<150){
            this.age = age;
        }
    }

    public void setEmail(){
        if(email == "%@%"){
            this.email = email;
        }
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }
}
