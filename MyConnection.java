/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sagar
 */
import java.sql.*;

public class MyConnection {

    public static Connection getConnection() throws Exception {
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/stdmgdb?useLegacyDatetimeCode=false&serverTimezone=UTC";
        String uName = "root";
        String pass = "";
        /*
        Registering the mysql driver using the  forName method by loading the Driver class. 
        In depth Driver is a class which contains a static block inside which a method to register the 
        driver is present so,just loading the class, static block gets executed and driver gets registered.
       
         */
        Class.forName("com.mysql.cj.jdbc.Driver");
        /*
         Establishing the connection,
         Lets say we are using mySql as a DBMS then we an have multiple database,how can we know which database  
         we want to work with. And also we have to specify the userName and password to access the 
         database. Otherwise anyone can access to our database.
         */
        con = DriverManager.getConnection(url, uName, pass);
        return con;

    }

}
