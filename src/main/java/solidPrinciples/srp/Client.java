package solidPrinciples.srp;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        User user = new User(101, "sridhar", "sridhar123@gmail.com", new Date());
        IUserService userService = new UserService();
        userService.register(user);
    }
}
