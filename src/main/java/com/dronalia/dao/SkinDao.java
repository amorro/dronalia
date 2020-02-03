package com.dronalia.dao;


import com.dronalia.dto.Skin;
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
        String SQL_SELECT = "SELECT ski_id, ski_nombre, ski_foto, ski_tematica" + " FROM skins";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Skin skin;
        List<Skin> skins = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
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
        } finally {
            DBConnection.close(rs);
            DBConnection.close(stmt);
            DBConnection.close(conn);
        }
        return skins;
    }
}
