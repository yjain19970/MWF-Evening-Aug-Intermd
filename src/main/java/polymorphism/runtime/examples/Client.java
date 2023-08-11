package polymorphism.runtime.examples;

import inheritance.constructors.D;

public class Client {

    public static void main(String[] args) {

        C c = new C();
        c.greet();

       // C dd = new B(); XX
        B dd = new C();
        dd.greet();


        A aa = new C();
        aa.greet();


    }
}
