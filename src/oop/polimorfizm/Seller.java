package oop.polimorfizm;


public class Seller extends User {
    private String location;

    public Seller(String username, String email, String password, String location) {
        super(username, email, password);
        this.location = location;
    }
}
