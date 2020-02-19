package com.dronalia.dao;

import com.dronalia.dto.Dron;
import com.dronalia.dto.Skin;
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
    public Dron listarDron(int idDron) {

        DBConnection db = new DBConnection();
        Dron dron = null;

        try {
            String query = "SELECT * FROM drones WHERE dro_id = ?";

            Connection conn = db.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(query);

            sentencia.setString(1, String.valueOf(idDron));

            ResultSet rs = sentencia.executeQuery();

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
                    System.out.println(dron.toString());
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } //finally {
//            DBConnection.close(rs);
//            DBConnection.close(se);
//            DBConnection.close(conn);
//        }
        return dron;
    }

    public List<Dron> listarDronCategoria(EnumDronCategoria cat) {
        DBConnection db = new DBConnection();
        List<Dron> listaDrons = new ArrayList<>();

        try {
            String query = "SELECT * FROM drones";
            if (cat != null) {
                query = "SELECT * FROM drones WHERE dro_categoria = ?";
            }

            Connection conn = db.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(query);

            if (cat != null) {
                int i = 1;
                sentencia.setString(i, cat.toString());
                System.out.println(cat.toString());
            }

            ResultSet rs = sentencia.executeQuery();

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
                    String foto2 = rs.getString("dro_foto2");
                    String foto3 = rs.getNString("dro_foto3");


                    Dron dron = new Dron(id, nombre, ejes, medida, categoria, color, precio_base, foto, foto2, foto3);
                    System.out.println(dron.toString());
                    listaDrons.add(dron);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return listaDrons;
    }

    public int create(Dron dron) {
        String SQL_INSERT = "INSERT INTO drones(dro_nombre, dro_ejes, dro_medida, dro_categoria, dro_color, dro_precio_base, dro_foto, dro_foto2, dro_foto3) "
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        int rows = 0;
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int i = 1;
            stmt.setString(i++, dron.getNombre());
            stmt.setString(i++, dron.getEjes());
            stmt.setString(i++, dron.getMedida());
            stmt.setString(i++, dron.getDronCategoriaEnum().toString());
            stmt.setString(i++, dron.getDronColorEnum().toString());
            stmt.setDouble(i++, dron.getPrecioBase());
            stmt.setString(i, dron.getFoto());
            stmt.setString(i, dron.getFoto2());
            stmt.setString(i, dron.getFoto3());

            System.out.println(dron.toString());
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