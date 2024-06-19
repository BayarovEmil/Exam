package oop.overriding;

public class BMW extends Car{
    //Base class-dan hazir istifadede ede bilerdi
    @Override
    public void info() {
        System.out.println("BMW is the best car in the world");
    }
}
