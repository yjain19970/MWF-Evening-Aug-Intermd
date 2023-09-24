package solidPrinciples.srp;

public class UserService implements  IUserService{
    @Override
    public void register(User user) {
        //save the user database
        System.out.println("User data is saved");
        //send email to user
        EmailInfo emailInfo = new EmailInfo("account confirmation",
                                            "New account is created",
                                            user.getEmail());
        IEmailService emailSender = new EmailService();
        emailSender.sendEmail(emailInfo);
    }
}

/*
 * Here the user service has more than one responsibility
 *  1. register user
 *  2. sendEmail
 *
 *  This violates SRP. and based on the services responsibility we must segregate them
 *  Now I am creating a new emailService Interface and assigning SRP to that service
 *      That is @sendEmail() method
 *
 *  Now This code have followed SRP and have more Readability, Extensible, Modular, easily testable and more Understandable.
 */

