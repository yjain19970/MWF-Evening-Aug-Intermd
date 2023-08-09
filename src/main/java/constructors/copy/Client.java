package constructors.copy;

public class Client {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.emailId = "abc@gmail.com";
        s1.name = "yash";
        s1.psp =89;

        // requirement -- create s2 with same values;

        Student s2 = new Student(s1);



        Student s3 = s1;

        System.out.println(s1.emailId);
        System.out.println(s2.emailId);
        System.out.println(s3.emailId);

    }
}
