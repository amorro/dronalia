package com.dronalia.dao;


import com.dronalia.dto.Skin;
import com.dronalia.dto.User;
import com.dronalia.enumeradas.EnumSkinTematica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SkinDao {
    /*
     * Llista tots els skins de la base de dades
     *
     */
    public List<Skin> listar() {
        DBConnection db = new DBConnection();
        Skin skin;
        List<Skin> skins = new ArrayList<>();

        try {
            String query = "SELECT * FROM skins";

            Connection conn = db.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(query);
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ski_id");
                String name = rs.getString("ski_nombre");
                String photo = rs.getString("ski_foto");
                EnumSkinTematica tematica = EnumSkinTematica.valueOf(rs.getString("ski_tematica"));

                skin = new Skin(id, name, photo, tematica);
                skins.add(skin);
            }
        }catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } //finally {
//            DBConnection.close(rs);
//            DBConnection.close(stmt);
//            DBConnection.close(conn);
//        }
        return skins;
    }

    public int create(Skin skin) {
        String SQL_INSERT = "INSERT INTO skins(ski_tematica, ski_nombre, ski_foto) "
                + " VALUES(?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        int rows = 0;
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int i = 1;
            stmt.setString(i++, skin.getSkinTematicaEnum().toString());
            stmt.setString(i++, skin.getName());
            stmt.setString(i, skin.getPhoto());

            System.out.println(skin.toString());
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
