package com.dronalia.dao;

import com.dronalia.dto.Order;
import com.dronalia.dto.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class ProductoDao {
    public int create(Order order, Producto producto) {
        String SQL_INSERT = "INSERT INTO lin_factura(lin_fac_id, lin_id, lin_producto, lin_precioProducto)  VALUES(?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        int rows = 0;
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int i = 1;
            stmt.setInt(i++,order.getId());
            stmt.setInt(i++, producto.getId());
            stmt.setString(i++, producto.getNombre());
            stmt.setString(i++, null);
            stmt.setDouble(i, producto.getPrecioBase() + producto.getPrecioSkin());


            System.out.println(producto.toString());
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
