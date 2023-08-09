import accessmodifier.Student;

public class StudentChildAccessModifier extends Student {

    public static void main(String[] args) {
        Student gov = new Student();
        gov.name = "Govind";


        StudentChildAccessModifier gov2 = new StudentChildAccessModifier();
        gov2.age = 10;
        gov2.name = "Yash";
    }
}
