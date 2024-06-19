package oop.encapsulation;

public class User {
    private String firstname;
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    //
    public String getEmail() {
        if (email.contains("@gmail.com")) {
            return email;
        } else {
            return "Email format is wrong!";
        }

    }

    public void setEmail(String email) {
        this.email = email;
    }
}
