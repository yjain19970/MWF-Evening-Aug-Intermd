package solidPrinciples.srp;

public class EmailInfo {
    private String subject;
    private String body;
    private String email;

    public EmailInfo() {
    }

    public EmailInfo(String subject, String body, String email) {
        this.subject = subject;
        this.body = body;
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
