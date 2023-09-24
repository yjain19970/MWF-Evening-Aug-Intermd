package solidPrinciples.ocp;

public class Client {
    public static void main(String[] args) {
        IDatabaseConnection conn1 = MySQLDatabaseProvider.getConn();
        IDatabaseConnection conn2 = MySQLDatabaseProvider.getConn();

        IDatabaseConnection conn3 = OracleDatabaseProvider.getConn();
        IDatabaseConnection conn4 = OracleDatabaseProvider.getConn();

        IDatabaseConnection conn5 = H2DatabaseProvider.getConn();
        IDatabaseConnection conn6 = H2DatabaseProvider.getConn();

        IDatabaseConnection conn7 = MySQLDatabaseProvider.getConn();
        IDatabaseConnection conn8 = OracleDatabaseProvider.getConn();
    }
}

/*
 *  OCP means Open Close principle
 *  OCP states that Open for Extension and Close for Modifications
 *  Open for adding new lines of code (Adding new functionality ) close for modification of existing code (functionality)
 */
