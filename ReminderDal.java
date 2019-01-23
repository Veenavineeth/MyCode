/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DAO.ReminderDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class ReminderDal {
     public ArrayList<ReminderDao>getallReminders()throws Exception
    {
        ArrayList<ReminderDao> objList=null;
        String query="SELECT id,name,date,time FROM reminder  ORDER BY id DESC";
        try
        {
            Connection con=DBConnection.getConnection();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            objList=new ArrayList<ReminderDao>();
            while(rs.next())
            {
                ReminderDao daoObj=new  ReminderDao();
                daoObj.setRemId(rs.getInt("id"));
                daoObj.setRemName(rs.getString("name"));
                daoObj.setRemDate (rs.getString("date"));
                daoObj.setRemTime(rs.getString("time"));
                objList.add(daoObj);
            }
            
        }
        catch(Exception ex)
        {
           throw ex;
        }
        return objList;
        
    }
      public boolean createAReminder(ReminderDao daoObj) throws Exception
    {
        boolean insertionStaus=false;
        int numberOfRowsAffected=0;
        String query="INSERT INTO reminder(name,date,time) VALUES(?,?,?)";
        try
        {
          Connection con=DBConnection.getConnection();
          PreparedStatement pstmt=con.prepareStatement(query);
          pstmt.setString(1,daoObj.getRemName());
          pstmt.setString(2,daoObj.getRemDate());
          pstmt.setString(3,daoObj.getRemTime());
          numberOfRowsAffected=pstmt.executeUpdate();
          if(numberOfRowsAffected==1)
          {
              insertionStaus=true;
          }
        }
        catch(Exception ex)
        {
              throw ex;
        }
         return insertionStaus;   
    }
      public boolean updateAReminder(ReminderDao daoObj)throws Exception 
    {
        boolean updationStaus=false;
        int numberOfRowsAffected=0;
        String query="UPDATE reminder SET name=?,date=?,time=? WHERE id=?";
        try
        {
          Connection con=DBConnection.getConnection();
          PreparedStatement pstmt=con.prepareStatement(query);
          pstmt.setString(1,daoObj.getRemName());
          pstmt.setString(2,daoObj.getRemDate());
          pstmt.setString(3,daoObj.getRemTime());
          pstmt.setInt(4,daoObj.getRemId());
          numberOfRowsAffected=pstmt.executeUpdate();
          if(numberOfRowsAffected==1)
          {
              updationStaus=true;
          }
        }
        catch(Exception ex)
        {
               throw ex;
        }
         return updationStaus;
    }
     public void viewReminderById(ReminderDao daoObj) throws Exception
      {         
         String query="SELECT name,date,time FROM reminder WHERE id=? ";
        try
         {
           Connection con=DBConnection.getConnection();            
           PreparedStatement pstmt= con.prepareStatement(query);
           pstmt.setInt(1, daoObj.getRemId());
           ResultSet rs=pstmt.executeQuery();
           while(rs.next())
           {
            daoObj.setRemName(rs.getString("name"));
            daoObj.setRemDate(rs.getString("date"));
            daoObj.setRemTime(rs.getString("time"));
           }  
        }
        catch(Exception ex)
        {
               throw ex;
       }
    } 
}
