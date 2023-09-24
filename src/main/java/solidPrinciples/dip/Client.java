package solidPrinciples.dip;

import java.sql.Connection;

public class Client {
    public static void main(String[] args) {

    }
}

/*
 *  High-level modules should not depend on low-level modules. Both should depend on abstractions.
 *  Abstractions should not depend on details. Details should depend on abstractions.
 *  Every dependency in the design should target an interface or an abstract class.
 *  No dependency should target a concrete class.
 *  Factories and Abstract Factories can be used as dependency frameworks,
 *          but there are specialized frameworks for that such as Spring IOC (Inversion of Control Container).
 *
 *
 *
 *  Benefits:
 *      - Loose coupling
 *      -
 */
