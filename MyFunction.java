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
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFunction {
//returns the total number of accessories as a integer.
    public static int countData(String tableName) throws Exception {
        int total = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM "+ tableName);
            
            while(rs.next()){
                total=rs.getInt(1);
            }

        } catch (Exception ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return total;

    }

}
