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
