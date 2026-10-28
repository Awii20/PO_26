package Lab03;

public class User {

    public String login;
    public String password;
    public static int age;

    public User(
            String login,
            String password,
            int age
    ) {
        this.login = login;
        this.password = password;
        User.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showUser() { //usuniety static
        System.out.println(
                "Login: " + login
                        + ", hasło: " + password
                        + ", wiek: " + age
        );
    }
}