package com.dronalia.dao;

import com.dronalia.dto.Order;
import java.time.LocalDate;
import java.util.Objects;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDao {
    public int create(Order order) {
        String SQL_INSERT = "INSERT INTO facturas(fac_id, fac_use_email, fac_fecha, fac_total)  VALUES(?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        int rows = 0;
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int i = 1;
            stmt.setInt(i++, order.getIdFactura());
            stmt.setString(i++, order.getComprador());
            stmt.setString(i++, order.getFecha().toString());
            stmt.setDouble(i++, order.getPrecioTotal());
           

            System.out.println(order.toString());
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DBConnection.close(stmt);
            DBConnection.close(conn);
        }
        return rows;
    }
}
