/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ME
 */
public class MProductManagementUI {
    
    public void addCategory(int mem_id, String mem_name)
    {
        try{
            //MyDBConnection dbConnection = new MyDBConnection();
            Statement st=MsDBConnection.createDBConnection().createStatement();
            int count=st.executeUpdate("insert into student values('"+mem_id+"','"+mem_name+"')");
            if(count>0)
            {
                JOptionPane.showMessageDialog(null,"sucessfully submited");
            }
        }
        catch(Exception e)
        {System.err.println(e.getMessage());            
        }
        
        
    }
    
}
