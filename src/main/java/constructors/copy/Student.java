package constructors.copy;

public class Student {
    String name;
    double psp;
    String emailId;


    public Student(){}

    public Student(Student old){
        name = old.name;
        psp = old.psp;
        emailId = old.emailId;
    }
}
