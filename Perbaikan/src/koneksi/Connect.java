/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koneksi;

/**
 *
 * @author HP
 */
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
public class Connect {
    
  public static Connection Connect(){
       try {
           MysqlDataSource con = new MysqlDataSource();
        
           con.setDatabaseName("perbaikan");
           con.setUser("root");
           con.setPassword("");
           con.setServerName("localhost");
           con.setPortNumber (3306);
           con.setServerTimezone("Asia/Jakarta");
           Connection c = con.getConnection();
           return c;
       } catch (Exception e) {
       }
        return null;
   }
 }

