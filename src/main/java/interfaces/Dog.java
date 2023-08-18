package interfaces;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("dog is eating..");
    }

    @Override
    public void sleep() {
        System.out.println("dog is sleeping..");
    }

    @Override
    public void walk() {
        System.out.println("dog is walking..");
    }

    public void bark(){
        System.out.println("dog is barking..");
    }


}
