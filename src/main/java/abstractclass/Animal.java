package abstractclass;

public abstract class Animal {

    String name;
    int age;


    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();
}
