package solidPrinciples.ocp;

import java.sql.Connection;

public class OracleDatabaseProvider implements  IDatabaseConnection{
    private static volatile OracleDatabaseProvider conn;

    OracleDatabaseProvider(){

    }
    @Override
    public IDatabaseConnection createConnection() {
        if(conn == null){
            conn = new OracleDatabaseProvider();
        }
        return conn;
    }

    public static OracleDatabaseProvider getConn() {
        if(conn == null){
            new OracleDatabaseProvider().createConnection();
        }
        return conn;
    }
}
