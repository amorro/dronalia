package com.dronalia.dao;

import com.dronalia.dto.Dron;
import com.dronalia.enumeradas.EnumDronCategoria;
import com.dronalia.enumeradas.EnumDronColor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DronDao {
    /*
     * Llista tots els clients de la base de dades
     *
     */
    public List<Dron> listar() {
        String SQL_SELECT = "SELECT dro_id, dro_nombre, dro_ejes, dro_medida, dro_categoria, dro_color, dro_precio_base " + " FROM drones";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Dron dron = null;
        List<Dron> drons = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("dro_id");
                String nombre = rs.getString("dro_nombre");
                String ejes = rs.getString("dro_ejes");
                String medida = rs.getString("dro_medida");
                EnumDronCategoria categoria = EnumDronCategoria.valueOf( rs.getString("dro_categoria"));
                EnumDronColor color = EnumDronColor.valueOf( rs.getString("dro_color"));
                double precio_base = rs.getDouble("dro_precio_base");

                dron = new Dron(id, nombre, ejes, medida, categoria, color, precio_base);
                drons.add(dron);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DBConnection.close(rs);
            DBConnection.close(stmt);
            DBConnection.close(conn);
        }
        return drons;
    }
}
