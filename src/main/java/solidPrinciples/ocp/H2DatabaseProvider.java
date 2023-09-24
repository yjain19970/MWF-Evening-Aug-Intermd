package solidPrinciples.ocp;

public class H2DatabaseProvider implements  IDatabaseConnection{

    private static volatile H2DatabaseProvider conn;

    private H2DatabaseProvider(){

    }

    @Override
    public IDatabaseConnection createConnection() {
        if(conn == null){
            conn = new H2DatabaseProvider();
        }
        return conn;
    }

    public static H2DatabaseProvider getConn() {
        if(conn == null){
            new H2DatabaseProvider().createConnection();
        }
        return conn;
    }
}
