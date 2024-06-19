package oop.polimorfizm;

public class Main {
    public static void main(String[] args) {
        User user1 = new Customer("John","john@gmail.com","1234",19);
        User user2 = new Seller("Me","me@gmail.com","123","Baku");

        user1.login();
        user2.login();
    }
}
