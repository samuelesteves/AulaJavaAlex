
package br.com.sistemataxonomia.rdn;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class ConnectionFactory {
    
    private String URL = "jdbc:sqlserver://localhost:1433;databaseName=trabalhoTaxonomia;trustServerCertificate=true;integratedSecurity=true;";
    
    
    public Connection getConnection(){
    
         try {

            return DriverManager.getConnection(this.URL);
        } catch (SQLException ex) {

            throw new RuntimeException(ex);
        }
    }
}
