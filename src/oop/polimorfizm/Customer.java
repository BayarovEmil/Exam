package oop.polimorfizm;

public class Customer extends User {
    private int age;

    public Customer(String username, String email, String password, int age) {
        super(username, email, password);
        this.age = age;
    }

}
