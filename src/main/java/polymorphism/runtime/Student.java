package polymorphism.runtime;

public class Student extends User{

    String univ;
    double psp;

    public void canTalk(){
        System.out.println("student talk...");
    }


    public void login(){
        System.out.println("student login...");
    }
}
