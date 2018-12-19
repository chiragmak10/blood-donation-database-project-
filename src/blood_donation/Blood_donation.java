/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood_donation;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * 
 */
public class Blood_donation {

    /**
     * @param args the command line arguments
     */
    public static Connection Connerdb(){
       try
       {
           Class.forName("oracle.jdbc.OracleDriver");
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Aish");
           return con;
       }
       catch(Exception e)
       {
           
       }
       return null;
    }
    
}
