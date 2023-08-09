package accessmodifier;

public class Mentor {


    public static void main(String[] args) {

        Student gov  = new Student();
        gov.age = 25; // PROTECTED
        gov.email  = "abc@gmail.com"; // DEFAULT
        gov.name = "Govind"; // PUBLIC
    }


}
