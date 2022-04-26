/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.heredadossoft.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class DBManager {
    private static DBManager dbManager;
    private String url = "jdbc:mysql://database-lp2-trabajo-final.cpembpgh8ejx.us-east-1.rds.amazonaws.com:3306/lp2trabajo";
    private String user = "admin";
    private String password = "20221trabajolp2";
    private Connection con;
    //database-lp2-trabajo-final.cpembpgh8ejx.us-east-1.rds.amazonaws.com
    public Connection getConnection(){
        try{
            //Registrar el driver de conexion
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establecer la conexion
            con = DriverManager.getConnection(url,user,password);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
    private synchronized static void createInstance(){
        if(dbManager == null){
            dbManager = new DBManager();
        }
    }
    
    public static DBManager getInstance(){
        if(dbManager == null)
            createInstance();
        return dbManager;
    }  
}
