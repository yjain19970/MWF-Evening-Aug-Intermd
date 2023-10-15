package singletonexample.eagerloading;

public class EagerDBConnection {
    private EagerDBConnection() {
    }

    private static EagerDBConnection dbConnection = new EagerDBConnection();

    /**
     * PROBLEM: many classes on app start could lead to increase in app start time.
     * @return  db connection
     */
    public static EagerDBConnection createInstance() {
        return dbConnection;
    }
}


/*
 *  EagerLoading will work in single thread environment.
 *
 *  When multiple threads try to access at a time, this will results race condition.
 *  App start will take more time and may chance of creates multiple connections.
 *
 *  Solution for this is we need way to create singleton at runtime and implement concurrency as well.
 *      Best solution for concurrency is Locks.
 */