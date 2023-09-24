package solidPrinciples.ocp;

import java.sql.Connection;

public interface IDatabaseConnection {
    public IDatabaseConnection createConnection();
}


/*
 *  Create an Interface DBConnectivity and implement in MySQLProvider, OracleProvider types of DB providers
 *
 *  Whenever need to create one more H2Provider, create a new Class and implement DBConnectivity.
 *  This satisfies the OCP principle and ne
 */