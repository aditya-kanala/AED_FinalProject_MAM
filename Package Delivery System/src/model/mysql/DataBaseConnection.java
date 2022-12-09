/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mahith
 */
public class DataBaseConnection {
    Connection connection;
     
    public void databaseConnection(){
        System.out.println("Connection db");
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aed_project", "root", "root");//Establishing connection
            System.out.println("Connected With the database successfully"); //Message after successful connection 
        } catch (SQLException e) {
            System.out.println(e); //Message if something goes wrong while conneting to the database
        }

    } 
}
