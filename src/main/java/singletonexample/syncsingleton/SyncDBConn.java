package singletonexample.syncsingleton;

import singletonexample.singlethreaded.DBConnection;

public class SyncDBConn {
    private static SyncDBConn dbConnection = null;
    private SyncDBConn() {
    }

    /**
     * This will work in multi threaded ENV.
     * PROBLEMS -- because I am taking lock on complete method, it will hamper performace.
     *
     * @return
     */
    public static synchronized SyncDBConn createInstance(){
        if(dbConnection == null){
            dbConnection = new SyncDBConn();
        }
        return dbConnection;
    }
}

/*
 *  We are using concurrency with method level and it will work in multithreaded environment.
 *  Synchronization uses locks and supports multi thread environment.
 *
 *  There is a problem with this approach and results low performance.
 *      - when we call 1000 times and one by one thread will access this method and takes lots of time.
 *      - This approach is safe from race condition using locks but hampers performance.
 *
 *  Solution for this is change synchronized at method level to code level.
 */