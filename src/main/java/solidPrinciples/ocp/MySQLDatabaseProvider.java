package solidPrinciples.ocp;

import java.sql.Connection;

public class MySQLDatabaseProvider implements  IDatabaseConnection{
    private static volatile MySQLDatabaseProvider conn;

    private MySQLDatabaseProvider(){

    }

    @Override
    public IDatabaseConnection createConnection() {
        if(conn == null){
            conn = new MySQLDatabaseProvider();
        }
        return conn;
    }

    public static MySQLDatabaseProvider getConn() {
        if(conn == null){
            new MySQLDatabaseProvider().createConnection();
        }
        return conn;
    }
}
