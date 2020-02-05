package com.dronalia.dao;

import java.sql.*;

public class DBConnection {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/dronalia?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; // BD location
    private static final String DB = "dronalia"; // BD Name
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";

    public Connection con = null;

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            if (con != null) {
                System.out.println("Connexió OK!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }


    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }


}
