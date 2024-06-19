package oop.abstraction;

public abstract class Registration {
    //adi method yaziriq
    public void login() {
        checkUserInformation();
        isEmailExists();
        isUsernameAndPasswordCorrect();
    }

    abstract void checkUserInformation();
    abstract void isEmailExists();
    abstract void isUsernameAndPasswordCorrect();
}
