package builderdesignpattern;

public class Client {
    public static void main(String[] args) throws Exception {

        Helper h = new Helper("Yash", "yash@gmail.com", 110, "70105293442", 10.2);

        Student s = new Student(h);
        System.out.println(s);
    }
}
