/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.sql.DriverManager;
public class Koneksi {
    private static java.sql.Connection connector;
    
    public static java.sql.Connection getConnector(){
        if (connector == null){
            try{
                 String url = "jdbc:mysql://localhost:3306/tugasjdbc";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                connector = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return connector;
    }
    
    public static void main(String args[]){
        getConnector();
    }
}