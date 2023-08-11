package polymorphism;

public class Dog extends Animal{
    public Dog(){
        System.out.println("Dog...");
    }


    double height;

    public void bark(){
        System.out.println("barking...");
    }
}
