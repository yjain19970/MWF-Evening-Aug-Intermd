package singletonexample.singlethreaded;

public class DBConnection {
    private static DBConnection dbConnection = null;

    private DBConnection() {
    }

    public static DBConnection createInstance(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}


/*
 * This will work on Single thread environment.
 * Implementation :
 *
 * 1. Create a private constructor
 * 2. Create a static private variable conn
 * 3. Create a public method getConn() which returns Connection
 *      -> If case checks conn variable is null, then assign new Connection to conn
 *      -> return conn
 *
 *  Why this code ?
 *      In your project you are calling 1000 times connection and whenever you want to call, it will create a new connections.
 *      This will become costlier and time taking process and wastes of CPU process.
 *
 *      we are using if else case and private constructor and returning same connection if exists.
 */