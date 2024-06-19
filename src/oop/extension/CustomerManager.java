package oop.extension;

public class CustomerManager implements CustomerService{
    @Override
    public void login() {
        System.out.println("Customer is loggedIn");
    }

    @Override
    public void buySomeProduct() {
        System.out.println("Musteri bir mehsulu aldi");
    }
}
