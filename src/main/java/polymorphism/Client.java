package polymorphism;

import inheritance.constructors.D;

public class Client {
    public static void main(String[] args) {

        Animal a  = new Dog(); // i created object of child but referred as parent.
       a.canWalk();



        //Dog b = new Animal();

        a.color = "blue";
        a.name = "dog";

        // TYPECASTING.
       Dog x = (Dog)a;
       x.height  =10.2;
       x.bark();


       Dog d = new Dog();
    }

    public void canEat(Animal a){

    }


}
