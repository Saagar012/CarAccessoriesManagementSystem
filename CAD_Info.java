

import com.mysql.cj.jdbc.Blob;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sagar
 */
//Similar to the student of student management system.
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CAD_Info {

    //To insert, update and delete  the datas in the server table.
    public void insertUpdateDeleteAccessory(char operation, Integer id, String accessoryName, String category, String range,
            InputStream img, String date, int price, String description) {
        Connection con;
        PreparedStatement pst;
        if (operation == 'i') {
            try {
                con = MyConnection.getConnection();
                pst = con.prepareStatement("INSERT INTO accessory(id , accessoryName , category , rangee , image , addDate , price , description ) VALUES (?,?,?,?,?,?,?,?)");

                pst.setInt(1, id);
                pst.setString(2, accessoryName);
                pst.setString(3, category);
                pst.setString(4, range);
                pst.setBlob(5, img);
                pst.setString(6, date);
                pst.setInt(7, price);
                pst.setString(8, description);

                //execute update is an PreparedStatement method which returns an integer value which denotes that 
                //the returned no. of rows has affected.
                if (pst.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Item Added");
                    DefaultTableModel model = (DefaultTableModel) ManageAccessories.table.getModel();
                    ManageAccessories.table.setModel(model);
                    Object[] row1 = {id, accessoryName, category, range, date, price, description};
                    model.addRow(row1);
                    
                StringBuffer buffer = new StringBuffer("");
                buffer.append("**************************************************\n");
                buffer.append("**         Car Accessory Reciept       **\n");
                buffer.append("**************************************************");
                java.util.Date obj=new java.util.Date();
                String date1=obj.toString();
                buffer=buffer.append("\n"+date1+"\n\n");
                buffer = buffer.append("Item's Id   : " +id +"\n");
                buffer=buffer.append("Item's Name :  "+accessoryName+"\n");
                buffer=buffer.append("Category    :"+ category+"\n");
                buffer=buffer.append("Range       :"+range+"\n");
                buffer = buffer.append("Price(Rs)   : " + price+"\n");
                buffer=buffer.append("Description :"+ description+"\n");
                buffer = buffer.append("--------------------------------------------------\n");              
                ///calling the writeToFile method where the relavent data to be updated to the file.
                AddAccessoriesForm.writeToFile(buffer.toString());
                                                
                }

            } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null,
                                   "ID Already Entered",
                               "Please Insert Again",
                                    JOptionPane.WARNING_MESSAGE);

            }

        }
        //To update the data in the server.
        if (operation == 'u') {
            try {
                con = MyConnection.getConnection();
                pst = con.prepareStatement("UPDATE `accessory` SET `accessoryName`=?,`category`=? ,`rangee`=?,`image`=?,`addDate`=?,`price`= ? ,`description`= ?WHERE `id`= ?");

                pst.setString(1, accessoryName);
                pst.setString(2, category);
                pst.setString(3, range);
                pst.setBlob(4, img);
                pst.setString(5, date);
                pst.setInt(6, price);
                pst.setString(7, description);
                pst.setInt(8, id);

                //execute update is an PreparedStatement method which returns an integer value which denotes that 
                //the returned no. of rows has affected.
                if (pst.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Accessory data Updated ");
                StringBuffer buffer = new StringBuffer("");
                buffer.append("**************************************************\n");
                buffer.append("**         Car Accessory Reciept       **\n");
                buffer.append("**************************************************");
                java.util.Date obj=new java.util.Date();
                String date1=obj.toString();
                buffer=buffer.append("\n"+date+"\n\n");
                buffer = buffer.append("Item's Id : " +id +"\n");
                buffer=buffer.append("Item's Name   :  "+accessoryName+"\n");
                buffer=buffer.append("Category    :"+ category+"\n");
                buffer=buffer.append("Range       :"+range+"\n");
                buffer = buffer.append("Price(Rs)   : " + price+"\n");
                buffer=buffer.append("Description :"+ description+"\n");
                buffer = buffer.append("--------------------------------------------------\n");              
                ///calling the writeToFile method where the relavent data to be updated to the file.
                AddAccessoriesForm.writeToFile(buffer.toString());
                    
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }

        if (operation == 'd') {

            int yesOrNo = JOptionPane.showConfirmDialog(null, "Really want to delete the item",
                    "Delete  Accessory", JOptionPane.OK_CANCEL_OPTION, 2);
            if (yesOrNo == JOptionPane.OK_OPTION) {
                try {

                    con = MyConnection.getConnection();
                    pst = con.prepareStatement("DELETE FROM `accessory` WHERE `id`=?");
                    pst.setInt(1, id);

                    //execute update is an PreparedStatement method which returns an integer value which denotes that 
                    //the returned no. of rows has affected.
                    if (pst.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Accessory data Deleted");
                        try {
                            //Creating the defaultTable model for the table.
                            DefaultTableModel model = (DefaultTableModel) ManageAccessories.table.getModel();
                            //putting the user selected row as a integer.
                            int selectedRowIndex = ManageAccessories.table.getSelectedRow();
                            //removing the row.
                            model.removeRow(selectedRowIndex);
                            //updating the total accessories by getting the total accessories from the server.
                            MainForm.totalAccesories.setText("Total Accessories : " + MyFunction.countData("accessory"));

                        } catch (Exception ex) {
                            //  Logger.getLogger(ManageAccessories.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println(ex.getMessage());
                        }
                    }

                } catch (Exception ex) {
                    Logger.getLogger(CAD_Info.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
           

    }
    
public void insertUpdateDeleteAccessory1(char operation, Integer id, String accessoryName, String category, String range,
           String date, int price, String description) {
     Connection con;
        PreparedStatement pst;
     //To update the data in the server.
        if (operation == 'u') {
            try {
                con = MyConnection.getConnection();
                pst = con.prepareStatement("UPDATE `accessory` SET `accessoryName`=?,`category`=? ,`rangee`=?,`addDate`=?,`price`= ? ,`description`= ? WHERE `id`= ?");

                pst.setString(1, accessoryName);
                pst.setString(2, category);
                pst.setString(3, range);
                pst.setString(4, date);
                pst.setInt(5, price);
                pst.setString(6, description);
                pst.setInt(7, id);

                //execute update is an PreparedStatement method which returns an integer value which denotes that 
                //the returned no. of rows has affected.
                if (pst.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Accessory data Updated");
                StringBuffer buffer = new StringBuffer("");
                buffer.append("**************************************************\n");
                buffer.append("**         Car Accessory Reciept       **\n");
                buffer.append("**************************************************");
                java.util.Date obj=new java.util.Date();
                String date1=obj.toString();
                buffer=buffer.append("\n"+date+"\n\n");
                buffer = buffer.append("Item's Id : " +id +"\n");
                buffer=buffer.append("Item's Name   :  "+accessoryName+"\n");
                buffer=buffer.append("Category    :"+ category+"\n");
                buffer=buffer.append("Range       :"+range+"\n");
                buffer = buffer.append("Price(Rs)   : " + price+"\n");
                buffer=buffer.append("Description :"+ description+"\n");
                buffer = buffer.append("--------------------------------------------------\n");              
                ///calling the writeToFile method where the relavent data to be updated to the file.
                AddAccessoriesForm.writeToFile(buffer.toString());
                    
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }
        
    
    }

    //This is done to fill the JTable from the server datas.
    public void fillAccessoryJTable(JTable table, String valueToSearch) {

        PreparedStatement pst;
        try {
            Connection con = MyConnection.getConnection();
            pst = con.prepareStatement("SELECT * FROM `accessory` WHERE `price` LIKE ? ");
            
          
            pst.setString(1, valueToSearch + "%");
            //Here since valueToSearch is an emptyString whole the table of server is recieved and is kept 
            //on the ResulSet object.
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;

            while (rs.next()) {
                //defining the size of array.
                row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(6);
                row[5] = rs.getInt(7);
                row[6] = rs.getString(8);
                model.addRow(row);

            }

        } catch (Exception ex) {
            Logger.getLogger(CAD_Info.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
        //This is done to fill the JTable from the server datas.
    public void fillAccessoryJTable1(JTable table, String valueToSearch) {

        PreparedStatement pst;
        try {
            Connection con = MyConnection.getConnection();
            pst = con.prepareStatement("SELECT * FROM `accessory` WHERE `category` LIKE ? ");
            
          
            pst.setString(1, valueToSearch + "%");
            //Here since valueToSearch is an emptyString whole the table of server is recieved and is kept 
            //on the ResulSet object.
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;

            while (rs.next()) {
                //defining the size of array.
                row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(6);
                row[5] = rs.getInt(7);
                row[6] = rs.getString(8);
                model.addRow(row);

            }

        } catch (Exception ex) {
            Logger.getLogger(CAD_Info.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    

    //method which returns the ArrayList of  imageobject.
    public static ArrayList<ImageItems> getItemList() throws Exception {
        ArrayList<ImageItems> itemsList = new ArrayList<ImageItems>();
        Connection con = MyConnection.getConnection();
        String query = "SELECT `image` FROM `accessory`";
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);

            ImageItems items1;

            while (rs.next()) {
                //instantiating the imageObject by gaining the image from the server.
                items1 = new ImageItems(rs.getBytes("image"));
                //adding the image object in the imageList.
                itemsList.add(items1);
            }

        } catch (Exception ex) {

            Logger.getLogger(CAD_Info.class.getName()).log(Level.SEVERE, null, ex);

        }
        return itemsList;
    }

    //method to show all the datas in the form of tables.
    public void showAllItems(JTable table) {

        PreparedStatement pst;
        try {
            Connection con = MyConnection.getConnection();
            pst = con.prepareStatement("SELECT `id`,`accessoryName`,`category`,`rangee`,`addDate`,`price`,`description` FROM `accessory` ");
            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;

            while (rs.next()) {
                row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getInt(6);
                row[6] = rs.getString(7);
                model.addRow(row);

            }

        } catch (Exception ex) {
            Logger.getLogger(CAD_Info.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
