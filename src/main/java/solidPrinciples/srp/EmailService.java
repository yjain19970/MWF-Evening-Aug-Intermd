package solidPrinciples.srp;

public class EmailService implements  IEmailService{
    @Override
    public boolean sendEmail(EmailInfo emailInfo) {
        try{
            sendEmail("session",emailInfo.getSubject(), emailInfo.getBody(), emailInfo.getEmail());
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    private static void sendEmail(String session, String subject, String body, String email) throws Exception{
        try{
            System.out.println("Email is sent");
        }catch(Exception e){
            throw new Exception("email sending is failed");
        }
    }
}
