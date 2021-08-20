
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sagar
 */
public class ReturnArrayListObject {
    
    public ArrayList<Integer> list(){
        ArrayList<Integer> obj = new ArrayList<Integer>();
        Statement st;
        try {
            Connection con = MyConnection.getConnection();
            st = con.createStatement();
            
            ResultSet rs = st.executeQuery(" SELECT `id` FROM `accessory` ");
            int result = MyFunction.countData("accessory");
            
            
            while (rs.next()) {
                int a = rs.getInt(1);
                obj.add(a);
            }
        } catch (Exception ex) {
            Logger.getLogger(ReturnArrayListObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return obj;
        
    }
    
}
