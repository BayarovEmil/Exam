package oop.polimorfizm;
//Base class
public class User {
    private String username;
    private String email;
    private String password;

    public void login() {
        System.out.println("User is loggedIn successfully");
    }


    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
