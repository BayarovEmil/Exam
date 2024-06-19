package oop.overloading;

public class Calculate {
    public int topla(int a,int b) {
        return a+b;
    }

    public int topla(int a,int b,int c) {
        return a+b;
    }

    public int topla() {
        return 5+4;
    }

    public int topla(int a) {
        return a+4;
    }
}
