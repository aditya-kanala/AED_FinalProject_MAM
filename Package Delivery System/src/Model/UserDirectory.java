/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mahith
 */

package Model;
import java.sql.*;
import javax.swing.JOptionPane;

public class UserDirectory {

    Connection connection;

    public UserDirectory(Connection connection){
        this.connection = connection;
    }
   
   
   public boolean addWarehouseManager(String id,String sname,String mname,String memail,String username,String password){
       try{
        PreparedStatement preparedStatement =connection.prepareStatement("insert into warehouse_manager values(?,?,?,?,?,?)");
        preparedStatement.setString(1,id);
        preparedStatement.setString(2,sname);
        preparedStatement.setString(3,mname);
        preparedStatement.setString(4,memail);
        preparedStatement.setString(5,username);
        preparedStatement.setString(6,password);
        
        preparedStatement.executeUpdate();
        System.out.println("Data inserted Successfully");
        return true;
      }
       catch(Exception e){
            System.out.println(""+e);
       }
        return false;
   }
   
   public boolean addStoreManager(String sid, String sname,String mname, String memail, String username, String password){
        try{
        PreparedStatement preparedStatement =connection.prepareStatement("insert into store_manager values(?,?,?,?,?,?)");
        preparedStatement.setString(1,sid);
        preparedStatement.setString(2,sname);
        preparedStatement.setString(3,mname);
        preparedStatement.setString(4,memail);
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

    public boolean addCSRAgent(String id, String csrname, String csremail, String password){
             
      try{
        PreparedStatement preparedStatement =connection.prepareStatement("insert into csr values(?,?,?,?)");
        preparedStatement.setString(1,id);
        preparedStatement.setString(2,csrname);
        preparedStatement.setString(3,csremail);
        preparedStatement.setString(4,password);
        
        preparedStatement.executeUpdate();
        System.out.println("Data inserted Successfully");
        return true;
      }
       catch(SQLException e){System.out.println(""+e); //Message if something goes wrong while conneting to the database
} 
        return false;
    }
    
    public boolean addSSRAgent(String id, String ssrname, String ssremail, String password){
             
      try{
        PreparedStatement preparedStatement =connection.prepareStatement("insert into ssr values(?,?,?,?)");
        preparedStatement.setString(1,id);
        preparedStatement.setString(2,ssrname);
        preparedStatement.setString(3,ssremail);
        preparedStatement.setString(4,password);
        
        preparedStatement.executeUpdate();
        System.out.println("Data inserted Successfully");
        return true;
      }
       catch(SQLException e){System.out.println(""+e); //Message if something goes wrong while conneting to the database
} 
        return false;
    }
    
    public boolean addShippingAgent(String name, String mobile, String bLocation, String username, String password){
        try{
        PreparedStatement preparedStatement =connection.prepareStatement("insert into shipping_agent values(?,?,?,?,?)");
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,mobile);
        preparedStatement.setString(3,bLocation);
        preparedStatement.setString(4,username);
        preparedStatement.setString(5,password);

        
        preparedStatement.executeUpdate();
        System.out.println("Data inserted Successfully");
        return true;
      }
       catch(SQLException e){System.out.println(""+e); //Message if something goes wrong while conneting to the database
}
        return false;
    }
    
    public boolean addDAgent(String id, String name, String mobile, String bLocation, String username, String password){
          try{
        PreparedStatement preparedStatement =connection.prepareStatement("insert into delivery_agent values(?,?,?,?,?,?)");
        preparedStatement.setString(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,mobile);
        preparedStatement.setString(4,bLocation);
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
    
    public boolean addCustomer(String name, String email, String username, String mobile, String password, String gender){
            try{
        PreparedStatement preparedStatement =connection.prepareStatement("insert into customer values(?,?,?,?,?,?)");
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,email);
        preparedStatement.setString(3,username);
        preparedStatement.setString(4,mobile);
        preparedStatement.setString(5,password);
        preparedStatement.setString(6,gender);


        
        preparedStatement.executeUpdate();
        System.out.println("Data inserted Successfully");
        return true;
        
      }
       catch(SQLException e){System.out.println(""+e); //Message if something goes wrong while conneting to the database
} 
        return false;
    }







}
