/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpingo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Lokesh Chandra
 */
public class MysqlConnection {
    
        private static final String username = "cyber";
        private static final String password = "cyber";
        private static final String CONN_STRING="jdbc:mysql://172.31.128.251:3307/helpingo";
        static Connection conn = null;
        static boolean check = false;
        
    MysqlConnection()
    {
        try
             {
                     conn = DriverManager.getConnection(CONN_STRING,username,password); //Connection Established between netbeans and SQL
                     System.out.println("Connected Database..1");                          //Database connection Successful message
                     
             }
            catch(SQLException e)
            {
                 e.printStackTrace();
                 JOptionPane.showMessageDialog(null, "Database connection failed .. !!!");
}
    
    }
    
}
