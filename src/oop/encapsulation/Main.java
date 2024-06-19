package oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        User user2=new User();

        user1.setEmail("wubbalublubdabdab");//format is wrong and we can't access to email
        user2.setEmail("username@gmail.com");

        System.out.println(user1.getEmail());
        System.out.println(user2.getEmail());
    }
}
