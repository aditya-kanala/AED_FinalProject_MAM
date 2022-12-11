/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mahith
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class OrganizationsDirectory {

    public OrganizationsDirectory(Connection connection) {
        this.connection = connection;
    }
    
    Connection connection;
    
    public boolean addStore(String id, String name,String location,Double longitude, Double latitude){
  
       try{
        PreparedStatement preparedStatement =connection.prepareStatement("insert into store values(?,?,?,?,?)");
        preparedStatement.setString(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,location);
        preparedStatement.setString(4,String.valueOf(longitude));
        preparedStatement.setString(5,String.valueOf(latitude));
        
        preparedStatement.executeUpdate();
        System.out.println("Data inserted Successfully");
        return true;
      }
       catch(SQLException e){System.out.println(""+e); //Message if something goes wrong while conneting to the database
}
        return false;
    }
    
    public boolean addWarehouse(String id, String name, String type, String location,Double longitude, Double latitude){
    
        try{
        PreparedStatement preparedStatement =connection.prepareStatement("insert into warehouse values(?,?,?,?,?,?)");
        preparedStatement.setString(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,type);
        preparedStatement.setString(4,location);
        preparedStatement.setString(5,String.valueOf(longitude));
        preparedStatement.setString(6,String.valueOf(latitude));
        
        preparedStatement.executeUpdate();
        System.out.println("Data inserted Successfully");
        return true;
      }
       catch(SQLException e){System.out.println(""+e); //Message if something goes wrong while conneting to the database
        }
        return false;
    }
    
    public boolean addFarm(String name, String owner, String produce, String location, Double longitude, Double latitude){
            try{
        PreparedStatement preparedStatement =connection.prepareStatement("insert into farms values(?,?,?,?,?,?)");
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,owner);
        preparedStatement.setString(3,produce);
        preparedStatement.setString(4,location);
        preparedStatement.setString(5,String.valueOf(longitude));
        preparedStatement.setString(6,String.valueOf(latitude));
        
        preparedStatement.executeUpdate();
        System.out.println("Data inserted Successfully");
        return true;
      }
       catch(SQLException e){System.out.println(""+e); //Message if something goes wrong while conneting to the database
        }
        return false;
    }
    
    public boolean addSupplier(String name, String email, String mobile, String location, String username, String password){
        try{
        PreparedStatement preparedStatement =connection.prepareStatement("insert into supplier values(?,?,?,?,?,?)");
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,email);
        preparedStatement.setString(4,mobile);
        preparedStatement.setString(3,location);
        preparedStatement.setString(5,username);
        preparedStatement.setString(6,password);
        
        preparedStatement.executeUpdate();
        System.out.println("Data inserted Successfully");
        return true;
      }
       catch(SQLException e){System.out.println(""+e); //Message if something goes wrong while conneting to the database
        }
        return false;
    }
    



}


