package com.dronalia.dao;

import com.dronalia.dto.Dron;
import com.dronalia.enumeradas.EnumDronCategoria;
import com.dronalia.enumeradas.EnumDronColor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DronDao {
    /*
     * Llista tots els drons de la base de dades
     *
     */
    public List<Dron> listar() {
        String SQL_SELECT = "SELECT dro_id, dro_nombre, dro_ejes, dro_medida, dro_categoria, dro_color, dro_precio_base " + " FROM drones";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Dron dron;
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
                EnumDronCategoria categoria = EnumDronCategoria.valueOf(rs.getString("dro_categoria"));
                EnumDronColor color = EnumDronColor.valueOf(rs.getString("dro_color"));
                double precio_base = rs.getDouble("dro_precio_base");
                String foto = rs.getString("dro_foto");

                dron = new Dron(id, nombre, ejes, medida, categoria, color, precio_base, foto);
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

    public List<Dron> listarDronCategoria(EnumDronCategoria cat) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Dron dron;
        List<Dron> drons = new ArrayList<>();

        try {
            String query = "SELECT * FROM drones";
            if (cat != null) {
                query = "SELECT * FROM drones WHERE dro_categoria = ?";
            }

            Connection conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();

            if (cat != null) {
                stmt.setString(1, cat.toString());
                System.out.println(cat.toString());
            }

            if (rs != null) {
                while (rs.next()) {
                    int id = rs.getInt("dro_id");
                    String nombre = rs.getString("dro_nombre");
                    String ejes = rs.getString("dro_ejes");
                    String medida = rs.getString("dro_medida");
                    EnumDronCategoria categoria = EnumDronCategoria.valueOf(rs.getString("dro_categoria"));
                    EnumDronColor color = EnumDronColor.valueOf(rs.getString("dro_color"));
                    double precio_base = rs.getDouble("dro_precio_base");
                    String foto = rs.getString("dro_foto");

                    dron = new Dron(id, nombre, ejes, medida, categoria, color, precio_base, foto);
                    drons.add(dron);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } //finally {
//            DBConnection.close(rs);
//            DBConnection.close(stmt);
//            DBConnection.close(conn);
//        }
        return drons;
    }
}