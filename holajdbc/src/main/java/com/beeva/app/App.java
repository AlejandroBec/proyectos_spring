package com.beeva.app;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "toor";
        String query = "Select * from empleado";
        
        try(Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);){
        
        
            while(rs.next()){
            
                
                System.out.println("*********");
                System.out.println("id:"+rs.getInt(1));
                System.out.println("First_Name"+rs.getString(2));
                System.out.println("Last_Name:"+rs.getString(3));
                System.out.println("Age:"+rs.getInt(4));
                
                
                
            }
            
            
        
        }catch(SQLException sql){
        
            sql.printStackTrace();
        
        }
        
        
    }
}
