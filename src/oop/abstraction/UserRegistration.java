package oop.abstraction;

public class UserRegistration extends Registration{
    @Override
    void checkUserInformation() {
        System.out.println("Successfully completed!");
    }

    @Override
    void isEmailExists() {
        System.out.println("Successfully completed!");
    }

    @Override
    void isUsernameAndPasswordCorrect() {
        System.out.println("Successfully completed!");
    }
}
