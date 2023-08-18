package interfaces;

public class Fish implements Animal, AquaticAnimal{
    @Override
    public void eat() {
        System.out.println("fish is eating..");
    }

    @Override
    public void sleep() {
        System.out.println("fish is sleeping..");
    }

    @Override
    public void walk() {
        System.out.println("fish is not walking..");
    }

    @Override
    public void swims() {
        ///
    }
}
