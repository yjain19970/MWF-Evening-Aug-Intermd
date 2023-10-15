package singletonexample;

import singletonexample.eagerloading.EagerDBConnection;
import singletonexample.singlethreaded.DBConnection;

public class Client {
    public static void main(String[] args) {
        DBConnection one = DBConnection.createInstance();
        DBConnection two = DBConnection.createInstance();

        EagerDBConnection eagerDBConnection = EagerDBConnection.createInstance();
        EagerDBConnection eagerDBConnection2 = EagerDBConnection.createInstance();

        System.out.println("FIRST OBJECT" + eagerDBConnection);
        System.out.println("SECOND OBJECT" + eagerDBConnection2);
    }
}

/*
 *  Why Design are patterns are Required ?
 *
 *  Shared vocabulary across the software industry.
 *  Solves common problems in known software problems which are repetitive, redundant functions.
 *  Provides transparency to the software design problems.
 *  Saves lots of time and developers can understand the communication.
 *
 *  Types of Design Patterns:
 *      1. Creational DP - These patterns are designed for class instantiation.
 *                         They can be either class-creation patterns or object-creational patterns.
 *      2. Structural DP - These patterns are designed with regard to a class's structure and composition.
 *                         The main goal of most of these patterns is to increase the functionality of the class(es) involved,
 *                         without changing much of its composition.
 *      3. BehaviouralDP - These patterns are designed depending on how one class communicates with others.
 *
 *  Link : https://www.freecodecamp.org/news/the-basic-design-patterns-all-developers-need-to-know/
 *
 *      Composition : If an object contains the other object and the contained object cannot exist without the existence of that object,
 *
 *  Singleton DP:
 *      Singleton dp allows tp create one object at a time for a class.
 *      for example : DBConnection
 *
 *      By making constructor as Private we can restrict object creation.
 *
 *      1. saves lots of time and space complexity
 *      2. Object creation is a costlier.
 *
 *  When we need to use SINGLETON DP.
 *      - When the object data is same across application or session.
 */