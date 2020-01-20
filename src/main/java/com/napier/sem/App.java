package com.napier.sem;

import java.sql.*;

public class App {
    public static  void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.driver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Could not load SQL Driver");
        }

        //Connection to the database

        Connection con = null;
        int retries = 100;
        for (int i = 0;  i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait for the DB to start
                Thread.sleep(30000);
                con = DriverManager.getConnection("jdbc:mysql://db:3306/employees?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                // Wait a bit
                Thread.sleep(10000);
                // Exit for loop
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }

        if(con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }
}
