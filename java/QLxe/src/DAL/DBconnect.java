/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class DBconnect {
    public Connection con;
    public DBconnect(){
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-OJN6RON:1433;databaseName=QUANLIXE;user=sa;password=123456");
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public Connection getCon(){
        return con;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        DBconnect a = new DBconnect();
        if(a.getCon()!= null)
            System.out.print("ket noi");
            else   System.out.print("khong nhe");
    }
}
      
        
        
        
        
        
        
        