package abstractclass;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        //Animal a = new Animal();

        Dog d =new Dog();
        d.height = 100;

        d.eat();

        // abstract classes vs interfaces

        Animal a = new Dog();


    }
}
