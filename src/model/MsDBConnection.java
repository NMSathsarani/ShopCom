/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ME
 */
public class MsDBConnection {
    private static Connection con;
    public static Connection createDBConnection()
    {
        try{
        String dbloc="jdbc:mysql://localhost/shop_com";
        con=DriverManager.getConnection(dbloc,"root","");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return con;
        
    }
}
