package com.company;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        JDBC NewCursor = new JDBC();
        NewCursor.createTable();
        NewCursor.insertTable("Nikoloz", "Bezhiashvili", "558612***");
        NewCursor.updateTable("Nikoloz", 1);
        NewCursor.deleteTable(1);

    }
}
