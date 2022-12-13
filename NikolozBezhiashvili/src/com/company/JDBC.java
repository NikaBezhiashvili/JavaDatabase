package com.company;

import java.sql.*;

public class JDBC {

    public static Connection con;
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(
                "sql8.freesqldatabase.com",
                "sql8583729",
                "RJyQFm6LnQ!"
        );

        return con;
    }


    public static ResultSet getResultSet(String Query) throws SQLException, ClassNotFoundException {
        con = JDBC.getConnection();
        Statement stm = con.createStatement();
        return stm.executeQuery(Query);
    }
    //
    public ResultSet createTable() throws SQLException, ClassNotFoundException {
        String newTable = "CREATE TABLE PRODUCTS (ID INT AUTO_INCREMENT NOT NULL," +
                "FIRST_NAME VARCHAR(225)," +
                "LAST_NAME VARCHAR(225))," +
                "PHONE_NUMBER INT," +
                "PRIMARY KEY (ID)";
        return getResultSet(newTable);
    }


    public ResultSet insertTable(String first_name, String last_name, String phone_number) throws SQLException, ClassNotFoundException {
        String insertTable = "INSERT INTO PRODUCTS (FIRST_NAME, LAST_NAME, PHONE_NUMBER) VALUES ('"+first_name+"', '"+last_name+"', "+phone_number+")";
        return getResultSet(insertTable);
    }

    public ResultSet updateTable(String first_name, Integer id) throws SQLException, ClassNotFoundException {
        String updateTable = "UPDATE PRODUCTS SET FIRST_NAME = '"+first_name+"' WHERE ID = "+id+"";
        return getResultSet(updateTable);
    }

    public ResultSet deleteTable(Integer id) throws SQLException, ClassNotFoundException {
        String deleteTable = "DELETE FROM PRODUCTS WHERE ID = "+id+"";
        return getResultSet(deleteTable);
    }

}
