package solidPrinciples.srp;

import java.util.Date;

public class User {
    private int userId;
    private String name;
    private String email;
    private Date dob;

    public  User() {
        //TODO
    }
    public User(int userId, String name, String email, Date dob) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
