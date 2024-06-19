package exceptions.tryCatch;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=12;
        int b= scanner.nextInt();
        int result;

        try {
            result=a/b;
        } catch (ArithmeticException exp) {
            System.out.println("0-a bolmek olmaz");
            exp.getMessage();
        } finally {
            System.out.println("try catch yekunlasdi");
        }
    }
}
