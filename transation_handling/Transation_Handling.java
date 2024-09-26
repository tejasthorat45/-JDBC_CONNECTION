package com.transation_handling;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.*;

public class Transation_Handling {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/placement";
        String username = "root";
        String password = "@Tejas123";
        String withdrawquery = "UPDATE bankacc SET balance = balance-? WHERE acc_num=?";
        String depositquery = "UPDATE bankacc SET balance = balance +? WHERE acc_num=?";




        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Succesfully");

        }catch (ClassNotFoundException e){
            System.out.println(" Connection failed");

        }


        try{

            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Establish sucessfuly");
            con.setAutoCommit(false);

             try {
                 PreparedStatement withdrawStatement = con.prepareStatement(withdrawquery);
                 PreparedStatement depositStatement = con.prepareStatement(depositquery);

                 withdrawStatement.setDouble(1, 2000);
                 withdrawStatement.setString(2, "SBI1123");
                 depositStatement.setDouble(1, 2000);
                 depositStatement.setString(2, "SBI789");
                 int withdrawrowsaff = withdrawStatement.executeUpdate();
                 int deporowsaff = depositStatement.executeUpdate();


                 if(withdrawrowsaff>0 && deporowsaff>0){
                     con.commit();
                     System.out.println("Transation sucessfull.......");
                 }else {
                     con.rollback();
                     System.out.println("Transation failed...........");
                 }

                 withdrawStatement.close();
                 depositStatement.close();

             }catch(SQLException e){
                 System.out.println(e.getMessage());

             }
             con.close();
            System.out.println();
            System.out.println("Connection close sucessfuly.");


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }


}
